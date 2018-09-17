var app = angular.module('MyApp', ['ngMaterial', 'ngMessages'])

app.controller('DemoCtrl', function($scope,$mdSidenav) {
  
  $scope.toggleSidenav = buildToggler('closeEventsDisabled');

	    function buildToggler(componentId) {
	      return function() {
	        $mdSidenav(componentId).toggle();
	      };
	    }
  
  $scope.getFormData = function(){
    
    $scope.adhaar = $scope.user.adhaar;
    
    $scope.firstname = $scope.user.firstname;
    $scope.lastname = $scope.user.lastname;
    $scope.contact = $scope.user.contact;
    $scope.email = $scope.user.email;
    $scope.username = $scope.user.username;
    $scope.password = $scope.user.password;
    $scope.confirmPassword = $scope.user.confirmPassword;

    alert($scope.adhaar + " " + $scope.firstname  + " " + $scope.lastname  + " " + $scope.contact  + " " + $scope.email  + " " + $scope.username  + " " + $scope.password  + " " + $scope.confirmPassword);

    

  }  
 
});
  