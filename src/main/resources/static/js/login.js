var app = angular.module('MyApp',['ngMaterial']);

app.controller('loginCtrl', function($scope,$window) {
       
    $scope.validateUser = function(){
        alert("HELLO")
        if($scope.user.username == 'admin' && $scope.user.password == '123456'){
            $window.location.href = '/Dashboard.html';
        }
    }
});
