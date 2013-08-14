<!DOCTYPE html>

<html ng-app="main">
	<head>
		<script src="${pageContext.request.contextPath}/resources/libs/jquery-1.7.2.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
		<script src="${pageContext.request.contextPath}/resources/js/controllers.js"></script>
				
		
		<title>App AngularJS</title>
	</head>
	
	<body>
		<h1>{{'Tarefas'}}</h1>
		
		<div ng-view></div>
	</body>
</html>