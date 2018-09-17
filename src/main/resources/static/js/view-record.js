var app = angular.module('MyApp', ['ngMaterial', 'ngMessages','material.svgAssetsCache'])
.config(function ($mdThemingProvider) {
	$mdThemingProvider.theme('red')
		.primaryPalette('red');

	$mdThemingProvider.theme('blue')
		.primaryPalette('blue');

})
app.controller('DemoCtrl', function($scope,$mdSidenav,$mdDialog, $interval,$element) {
    
    $scope.toggleSidenav = buildToggler('closeEventsDisabled');

	    function buildToggler(componentId) {
	      return function() {
	        $mdSidenav(componentId).toggle();
	      };
			}
	
  $scope.showAdvanced = function(ev) {
    $mdDialog.show({
      controller: DialogController,
      templateUrl: 'add-visit.templ.html',
      parent: angular.element(document.body),
      targetEvent: ev,
      clickOutsideToClose:false
    })
    .then(function(answer) {
      $scope.status = 'You said the information was "' + answer + '".';
    }, function() {
      $scope.status = 'You cancelled the dialog.';
    });
  };

  function DialogController($scope, $mdDialog) {
    $scope.hide = function() {
      $mdDialog.hide();
    };

    $scope.cancel = function() {
      $mdDialog.cancel();
    };

    $scope.answer = function(answer) {
      $mdDialog.hide(answer);
    };
  }
 
  
});