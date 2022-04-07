package com.Solvd.Models;

import com.Solvd.Models.person.Doctor;
import com.Solvd.Models.person.Nurse;
import com.Solvd.Models.person.Patient;

import java.util.HashMap;
import java.util.Map;

public class MedicalRecord {
    private int consultId;
    private Patient patient;
    private Doctor doctor;
    private Nurse nurse;
    private Consult consult;
    private Map<Integer,Consult> consults = new HashMap<>();


    public MedicalRecord() {
    }

    public MedicalRecord(int consultId, Patient patient, Doctor doctor, Nurse nurse, Consult consult) {
        this.consultId = consultId;
        this.patient = patient;
        this.doctor = doctor;
        this.nurse = nurse;
    }

    public int getConsultId() {
        return consultId;
    }

    public void setConsultId(int consultId) {
        this.consultId = consultId;
    }

    public String getPatient() {
        return (patient.getLastName()+ " " + patient.getFirstName());
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDoctor() {
        return ("Dr." + doctor.getLastName() + " " +doctor.getFirstName());
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getNurse() {
        return (nurse.getLastName() + nurse.getFirstName());
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Consult getConsult() {
        return consult;
    }

    public void setConsult(Consult consult) {
        this.consult = consult;
    }

    public Map<Integer, Consult> getConsults() {
        return consults;
    }

    public void setConsults(Map<Integer, Consult> consults) {
        this.consults = consults;
    }

    public void addConsultToMedicalRecord(){
        consults.put(this.getConsultId(),this.getConsult());
    }

    @Override
    public String toString() {
        return "\nMedicalRecord:" +
                "\nId:" + consultId +
                "\nPatient: " + patient +
                "\nDoctor: " + doctor +
                "\nNurse: " + nurse +
                "\nSymptom: " + consult.getSymptom() +
                "\nTreatment: " + consult.working(); //I can put the interface here!
    }
}
