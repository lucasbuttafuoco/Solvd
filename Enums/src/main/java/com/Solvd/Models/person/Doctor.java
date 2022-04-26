package com.Solvd.Models.person;

import com.Solvd.Enums.Gender;
import com.Solvd.Enums.Specialization;

public class Doctor extends com.Solvd.Models.person.Person {

    private boolean onCall;
    private Specialization specialization;

    public Doctor(){}

    public Doctor(String firstName, String lastName, int age, String realId, String email, String telephone, String address, Gender gender , boolean onCall, Specialization specialization) {
        super(firstName, lastName, age, realId, email, telephone, address,gender);
        this.onCall = onCall;
        this.specialization = specialization;
    }

    public boolean isOnCall() {
        return onCall;
    }

    public void setOnCall(boolean onCall) {
        this.onCall = onCall;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
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
