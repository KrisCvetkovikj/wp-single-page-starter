wplab04.config(function($stateProvider, $urlRouterProvider, $locationProvider) {

	$urlRouterProvider.otherwise('/pizza');

	$stateProvider.state('pizza', {
		url: '/pizza',
		templateUrl: 'views/pizzas/index.html',		
		controller: 'pizzacontroller',
		resolve: {
			pizzas: function(Pizza) {
				return Pizza.query();
			}
		}
	});
    $stateProvider.state('pizza-order', {
		url: '/pizza/order',
		templateUrl: 'views/order/index.html',
		controller: 'ordercontroller',
		resolve: {
			pizzaTypes: function($log, Pizza) {
				return Pizza.query();
			}
		}
	});
    $stateProvider.state('order-admin', {
		url: '/pizza/orders',
		templateUrl: 'views/order/list.html',
		controller: 'orderscontroller',
		resolve: {
			orders : function(Order) {
				return Order.query();
			}
		}
	});
});