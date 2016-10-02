package com.timer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Competitor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int startPos;
    private String firstname;
    private String lastname;
    private int splitTime;
    private int finishTime;

    public Competitor() {
    }

    public Competitor(Long id, int startPos, String firstname, String lastname, int splitTime, int finishTime) {
        this.id = id;
        this.startPos = startPos;
        this.firstname = firstname;
        this.lastname = lastname;
        this.splitTime = splitTime;
        this.finishTime = finishTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStartPos() {
        return startPos;
    }

    public void setStartPos(int startPos) {
        this.startPos = startPos;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSplitTime() {
        return splitTime;
    }

    public void setSplitTime(int splitTime) {
        this.splitTime = splitTime;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
}
