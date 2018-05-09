wplab04.controller('pizzacontroller', function($scope, $location, $anchorScroll, pizzas, Pizza){
	$scope.pizzas = pizzas;		
	$scope.header = "Make new pizza";
	$scope.button = "Create";	
	$scope.editPizza = null;	


	$scope.getAll = function() {
		$scope.pizzas = Pizza.query();
	}

	$scope.create = function() {
		$location.hash('form');
		$anchorScroll();
		$scope.editPizza = null;
		$scope.header = "Make new pizza";
		$scope.type = "";
		$scope.button = "Make";
	}

	$scope.store = function() {		
		if($scope.editPizza == null) {
			$scope.pizza = new Pizza();
			$scope.pizza.type = $scope.type;
			var result = Pizza.save($scope.pizza, function() {
				$scope.type = "";
				$scope.getAll();				
			});
		}else {
			$scope.update();
		}		
	}

	$scope.edit = function(id) {		
		$scope.header = "Change pizza";
		$scope.button = "Update";
			
		$scope.editPizza = Pizza.get({id: id}, function() {						
			$scope.type = $scope.editPizza.type;
			$location.hash('form');
	    	$anchorScroll();
		});	
	}

	$scope.update = function() {
		$scope.editPizza.type = $scope.type;

		$scope.editPizza.$update(function() {
			$scope.getAll();
		});
	}

	$scope.delete = function(id) {
		Pizza.remove({id: id}, function() {
			$scope.getAll();
			$scope.header = "Make new pizza";
			$scope.button = "Make";
			$scope.editPizza = null;
		});
	}

});