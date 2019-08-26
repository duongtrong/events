package com.asm.model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Event {

    @Id
    private String timeDay;
    private String timeOld;
    private String planning;
    private String whereee;
    private String info;
    private long createdAtMLS;
    private long updatedAtMLS;

    public Event() {
        this.createdAtMLS = Calendar.getInstance().getTimeInMillis();
        this.updatedAtMLS = Calendar.getInstance().getTimeInMillis();
    }

    public String getTimeDay() {
        return timeDay;
    }

    public void setTimeDay(String timeDay) {
        this.timeDay = timeDay;
    }

    public String getTimeOld() {
        return timeOld;
    }

    public void setTimeOld(String timeOld) {
        this.timeOld = timeOld;
    }

    public String getPlanning() {
        return planning;
    }

    public void setPlanning(String planning) {
        this.planning = planning;
    }

    public String getWhereee() {
        return whereee;
    }

    public void setWhereee(String whereee) {
        this.whereee = whereee;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public long getCreatedAtMLS() {
        return createdAtMLS;
    }

    public void setCreatedAtMLS(long createdAtMLS) {
        this.createdAtMLS = createdAtMLS;
    }

    public long getUpdatedAtMLS() {
        return updatedAtMLS;
    }

    public void setUpdatedAtMLS(long updatedAtMLS) {
        this.updatedAtMLS = updatedAtMLS;
    }



}
