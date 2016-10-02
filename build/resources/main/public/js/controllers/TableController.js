'use strict';

timerApp.controller('TableController', 
    function TableController($scope, competitorData, $interval, $window) {
        $scope.competitors = {competitorArray: []};

        var intervalStopper = $interval(function(){
            $scope.competitors.competitorArray = competitorData.getCompetitors()
        }, 5000);

        $scope.customSort = function (competitor) {
            if(competitor.finishTime > 0) return 0 - competitor.finishTime;
            else return 0 - competitor.splitTime;
        };
            
        $window.onblur = function () {
            $interval.cancel(intervalStopper);
        };
        
        $window.onfocus = function () {
            intervalStopper = $interval(function(){
                $scope.competitors.competitorArray = competitorData.getCompetitors()
            }, 5000)
        };
    }
);