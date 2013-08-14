function CreateCtrl($scope, $http, $location) {
	
	
	$scope.adicionar = function(tarefa) {
		$http.post("adicionaTarefa",tarefa).success(function(){
			$location.path("/menu");
		});
	};
}



function ListCtrl($scope, $http) {
	
	$scope.lista = function(){
		$http.get("listaTarefas").success(function(data){
			$scope.tarefas = data;
		});
	};
	
	$scope.remove = function(tarefa){
		$http.post("removeTarefa",tarefa).success(function(){
			$scope.lista();
		});
	};
	
	$scope.finaliza = function(id){
		$http.post("finalizaTarefa",id).success(function(){
			$scope.lista();
		});
	};
	
	$scope.lista();
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

