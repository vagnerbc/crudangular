function CreateCtrl($scope, $http) {
	
	
	$scope.adicionar = function() {
		var descricao = $scope.tarefa.descricao;
		
	};
}



function ListCtrl($scope) {
	
}




function LoginCtrl($scope, $location) {
	
	$scope.entrar = function(){
		$location.path("/menu");
	};
	
	
}



function MenuCtrl($scope, $location) {
	$scope.logout = function(){
		
		$location.path("/");
	};
}

