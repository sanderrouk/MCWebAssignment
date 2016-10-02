timerApp.factory('timePutService', function ($resource) {
    return{
        updateTime: function (timeSplit) {
            var resource = $resource('api/time', null, {
                'update': { method:'PUT' }
            });
            return resource.update(timeSplit);
        }
    }
    
})