wplab04.factory('Pizza', function($resource) {
	return $resource('/api/pizza/:id', {id: '@id'}, {
		update: {
			method: 'PUT'
		}
	});
});