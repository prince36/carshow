angular.module('demo', [])
    .controller('Hello', function($scope, $http) {
        $http.get('http://localhost:8090/car/3176').
        then(function(response) {
            $scope.greeting = response.data;
        });
    });