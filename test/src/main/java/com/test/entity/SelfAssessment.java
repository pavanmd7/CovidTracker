package com.test.entity;


import java.util.List;

public class SelfAssessment {

    private boolean travelHistory;
    private boolean conactHistory;
    private List symptoms;

    private User user;

    public SelfAssessment( boolean travelHistory, boolean conactHistory, List symptoms) {

        this.travelHistory = travelHistory;
        this.conactHistory = conactHistory;
        this.symptoms = symptoms;
    }


    public boolean isTravelHistory() {
        return travelHistory;
    }

    public void setTravelHistory(boolean travelHistory) {
        this.travelHistory = travelHistory;
    }

    public boolean isConactHistory() {
        return conactHistory;
    }

    public void setConactHistory(boolean conactHistory) {
        this.conactHistory = conactHistory;
    }

    public List getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List symptoms) {
        this.symptoms = symptoms;
    }
}
