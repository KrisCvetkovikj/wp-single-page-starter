wplab04.controller('orderscontroller', function($scope, orders, Order){
	$scope.orders = orders;
	$scope.rowCollection = $scope.orders;	

	$scope.remove = function(order) {
		Order.remove({id: order.id}, function() {
			$scope.orders = Order.query();
		});
	}
});