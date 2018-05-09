wplab04.controller('orderController', function($scope, pizzaTypes, Order) {
	$scope.pizzaTypes = pizzaTypes;
	$scope.pizza = $scope.pizzaTypes[0];
	$scope.success = false;

	$scope.create = function() {
		$scope.order = new Order();
		$scope.order.pizza = $scope.pizza;
		$scope.order.clientName = $scope.name;
		$scope.order.clientAddress = $scope.address;

		var order = Order.save($scope.order, function() {
			$scope.success = true;
		});
	}
});