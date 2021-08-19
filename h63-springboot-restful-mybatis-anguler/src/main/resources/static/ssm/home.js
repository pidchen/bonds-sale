'use strict';
/* App Module */
var trainApp = angular.module('trainApp', [
   'user.services'
]);

trainApp.controller('homeCtrl', function ($scope,$rootScope, userService) {
	//获取所有用户
    userService.getAllUser().success(function(data) {
        $rootScope.userList = data;
	});
	
 	$scope.getAllUser = function() {	
		userService.getAllUser().success(function(data) {
		        $rootScope.userList = data;
			});	
	}
		   
  	$scope.addUser = function() {	
  	   userService.addUser().success(function(data) {
			$scope.getAllUser();
		});		
	}
	$scope.deleteUser = function(user) {	     
		userService.deleteUser(user).success(function(data) {
			$scope.getAllUser();
		});		
	}
	$scope.updateUser = function(user) {	     
		userService.updateUser(user).success(function(data) {
			$scope.getAllUser();
		});		
	}	
});

