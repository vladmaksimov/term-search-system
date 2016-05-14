angular
    .module('app')
    .config(function ($stateProvider, $urlRouterProvider) {

        init();

        function init() {
            $stateProvider.state('login', loginState());

            $urlRouterProvider.otherwise('/');
        }

        function loginState() {
            return {
                url: '/',
                templateUrl: 'templates/main.html',
                controller: 'MainController',
                controllerAs: 'vm'
            }
        }

    });