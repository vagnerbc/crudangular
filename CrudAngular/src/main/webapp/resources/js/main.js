angular.module('main', []).
  config(['$routeProvider', function($routeProvider) {
  $routeProvider.
      when('/', {templateUrl: 'partials/formulario-login.html', controller: LoginCtrl}).
      when('/menu', {templateUrl: 'partials/menu.html', controller: MenuCtrl}).
      when('/list', {templateUrl: 'partials/lista.html', controller: ListCtrl}).
      when('/add', {templateUrl: 'partials/formulario.html', controller: CreateCtrl}).
      otherwise({redirectTo: '/'});
}]);




