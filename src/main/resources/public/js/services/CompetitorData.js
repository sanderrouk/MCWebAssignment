timerApp.factory('competitorData', function ($resource) {
    return {
        getCompetitors: function () {
            return $resource('/api/competitors').query();
        }
    };
});