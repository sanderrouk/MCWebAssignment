'use strict';

timerApp.controller('StopwatchController',
    function TableController($scope,$interval, $window, competitorData, timePutService) {
        $scope.timeObject = {
            timeNumber: 0
        };

        $scope.dataObject = {
            competitors: competitorData.getCompetitors()
        };

        var timerState;
        $scope.activeCompetitor;
        $scope.startBtnState = false;
        $scope.stopBtnState = true;
        $scope.dropdownString = "Choose target competitor...";

        $scope.startTimer = function () {
            timerState = $interval(function () {
                $scope.timeObject.timeNumber++;
            },10);
            $scope.startBtnState = true;
            $scope.stopBtnState = false;
        };
        
        $scope.stopTimer = function () {
            $interval.cancel(timerState);
            $scope.startBtnState = false;
            $scope.stopBtnState = true;
        };

        $scope.resetTimer = function () {
            $scope.timeObject.timeNumber = 0;
        };


        $scope.submitTime = function(timeOriginId){
            if($scope.activeCompetitor == null) console.log("Select competitor");
            else {
                var submitTime = {
                    athleteId: $scope.activeCompetitor.id,
                    timerId: timeOriginId,
                    time: $scope.timeObject.timeNumber
                }
                console.log(submitTime);
                timePutService.updateTime(submitTime);
            }
        }
    }
);