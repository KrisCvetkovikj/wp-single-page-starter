wplab04.factory('Order', function($resource) {
	return $resource('/api/pizza/order/:id', {id: '@id'}, {
		update: {
			method: 'PUT'
		}
	});
});