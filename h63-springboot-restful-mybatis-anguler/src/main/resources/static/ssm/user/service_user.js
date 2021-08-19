'use strict';
var userServices = angular.module('user.services', []);

userServices.service( 'userService',['$http', function($http ) {
    return {
        getAllUser: function(){
           return $http.get('../../api/user');
          //return $http.get('../../jsonmock/user/userlist.json');
	    },
	    addUser: function(){
	       return $http({
	            method: "POST",
	            url: "../../api/user",
	            data: {
	               "username":"jack",
   					"userage":33
	            },
	            headers: { 'Content-Type': 'application/json' },
	        });
	    	//return $http.get('../../jsonmock/user/newUser.json');
	    },

	    deleteUser: function(user){
	       return $http({
	            method: "DELETE",
	            url: "../../api/user/"+user.id,
	            data:user,
	            headers: { 'Content-Type': 'application/json' },
	        });	    
	    
	    	// return $http.get('../../jsonmock/user/deleteUser.json');
	    	
	    },	
	    
	    updateUser: function(user){
	       return $http({
	          
	            method: "PUT",
	            url: "../../api/user",
	            data:user,
	            headers: { 'Content-Type': 'application/json' },
	        });
	    	//return $http.get('../../jsonmock/user/newUser.json');
	    },	    
	    	     
	  
    	    
	    		                     
    }
}]);

