package com.Solvd.Models;

import com.Solvd.Models.person.Doctor;
import com.Solvd.Models.person.Patient;

public class BloodTest {

    private Patient patient;
    private Doctor doctor;
    private String redBloodCells;
    private String whiteBloodCells;
    private String cholesterol;

    public BloodTest() {
    }

    public BloodTest(Patient patient, Doctor doctor, String redBloodCells, String whiteBloodCells, String cholesterol) {
        this.patient = patient;
        this.doctor = doctor;
        this.redBloodCells = redBloodCells;
        this.whiteBloodCells = whiteBloodCells;
        this.cholesterol = cholesterol;
    }

    public String getPatient() {
        return patient.getLastName() + " " + patient.getFirstName();
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDoctor() {
        return "Dr. " + doctor.getLastName() + " " + doctor.getFirstName();
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getRedBloodCells() {
        return redBloodCells;
    }

    public void setRedBloodCells(String redBloodCells) {
        this.redBloodCells = redBloodCells;
    }

    public String getWhiteBloodCells() {
        return whiteBloodCells;
    }

    public void setWhiteBloodCells(String whiteBloodCells) {
        this.whiteBloodCells = whiteBloodCells;
    }

    public String getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(String cholesterol) {
        this.cholesterol = cholesterol;
    }

    public String testResults(String red, String white, String cholesterol) {
        if (red == "Low" && white == "Low" && cholesterol == "High") {
            return "Caution";
        } else if ( red == "normal" && white == "normal" && cholesterol == "High"){
            return "Exercise";
        } else {
            return "Normal";
        }
    }
}
