package com.Solvd.Models.person;

public class Doctor extends com.Solvd.Models.person.Person {

    private boolean onCall;
    private String specialization;

    public Doctor(){}

    public Doctor(String firstName, String lastName, int age, String realId, String email, String telephone, String address, boolean onCall, String specialization) {
        super(firstName, lastName, age, realId, email, telephone, address);
        this.onCall = onCall;
        this.specialization = specialization;
    }

    public boolean isOnCall() {
        return onCall;
    }

    public void setOnCall(boolean onCall) {
        this.onCall = onCall;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * In order to override equals method as a part of the task
     * @param obj
     * @return true if obj is an instance of Doctor
     */

    @Override
    public boolean equals(Object obj) {
        if((obj instanceof Doctor))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                super.toString() +
                "onCall=" + onCall +
                ", specialization='" + specialization + '\'' +
                '}';
    }


}
