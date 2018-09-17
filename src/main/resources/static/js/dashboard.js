var app = angular.module('MyApp', ['ngMaterial', 'ngMessages'])

app.controller('AppCtrl', function($scope,$mdSidenav) {
    $scope.toggleSidenav = buildToggler('closeEventsDisabled');

	    function buildToggler(componentId) {
	      return function() {
	        $mdSidenav(componentId).toggle();
	      };
	    }
});