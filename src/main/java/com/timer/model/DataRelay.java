package com.timer.model;

public class DataRelay {
    private Long athleteId;
    private int timerId;
    private int time;

    public DataRelay() {
    }

    public DataRelay(Long athleteId, int timerId, int time) {
        this.athleteId = athleteId;
        this.timerId = timerId;
        this.time = time;
    }

    public Long getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(Long athleteId) {
        this.athleteId = athleteId;
    }

    public int getTimerId() {
        return timerId;
    }

    public void setTimerId(int timerId) {
        this.timerId = timerId;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
