package com.Solvd.Models;

import com.Solvd.Enums.Symptom;
import com.Solvd.Interfaces.IWork;
import com.Solvd.Models.equipment.Ultrasound;
import com.Solvd.Models.equipment.Xray;
import com.Solvd.Models.person.Patient;

import java.time.LocalDate;

public class Consult implements IWork {

    private Patient patient;
    private Symptom symptom; //Previously, this was a String, but with Enums I can use this field in a proper way.
    private LocalDate dateOfConsult;
    private Ultrasound ultrasoundResult;
    private Xray xRayResult;
    private BloodTest test;


    public Consult(){}

    public Consult(Patient patient, Symptom symptom, LocalDate dateOfConsult, Ultrasound ultrasoundResult, Xray xRayResult, BloodTest test) {
        this.patient = patient;
        this.symptom = symptom;
        this.dateOfConsult = dateOfConsult;
        this.ultrasoundResult = ultrasoundResult;
        this.xRayResult = xRayResult;
        this.test = test;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    public void setSymptom(Symptom symptom) {
        this.symptom = symptom;
    }

    public LocalDate getDateOfConsult() {
        return dateOfConsult;
    }

    public void setDateOfConsult(LocalDate dateOfConsult) {
        this.dateOfConsult = dateOfConsult;
    }

    public BloodTest getTest() {
        return test;
    }

    public void setTest(BloodTest test) {
        this.test = test;
    }

    @Override
    public String working() {

        if(test.testResults(test.getRedBloodCells(),test.getWhiteBloodCells(),test.getCholesterol()).equals("Caution")  && ultrasoundResult.getResult() == "Caution" && xRayResult.getResult() == "Caution"){
            return "You need to be hospitalized";
        } else if (test.testResults(test.getRedBloodCells(),test.getWhiteBloodCells(),test.getCholesterol()) == "Exercise"){
            return "You should exercise more";
        } else {
            return "Your blood test came out fine, take this medicine and you'll be OK.";
        }


    }

    @Override
    public String toString() {
        return  "\nPatient: " + patient.getFirstName()+" "+patient.getLastName() +
                "\nSymptom: " + symptom +
                "\nDateOfConsult: " + dateOfConsult +
                "\nBlood Test: " + test.testResults(test.getRedBloodCells(), test.getWhiteBloodCells(), test.getCholesterol()) +
                "\nUltrasound: " + ultrasoundResult.getResult() +
                "\nX-rays: " + xRayResult.getResult() +
                "\nDiagnose: " + working();

    }
}
