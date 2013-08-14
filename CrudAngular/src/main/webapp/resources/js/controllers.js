function CreateCtrl($scope, $http) {
	
	
	$scope.adicionar = function(tarefa) {
		$http.post("adicionaTarefa",tarefa).success(function(){
			$location.path("/menu");
		});
	};
}



function ListCtrl($scope) {
	
}




function LoginCtrl($scope, $rootScope, $location) {
	
	$rootScope.login = $scope.login;
	
	$scope.entrar = function(){
		$rootScope.login = $scope.login;
		$location.path("/menu");
	};
	
	
}



function MenuCtrl($scope, $rootScope, $location) {
	
	$scope.login = $rootScope.login;
	
	$scope.logout = function(){	
		$location.path("/");
	};
}

