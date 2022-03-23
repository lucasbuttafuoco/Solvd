package Models.person;

import Models.MedicalRecord;

public class Patient extends Person {

    private boolean hasInsurance;
    private MedicalRecord medicalRecord;

    public Patient() {
    }

    public Patient(String firstName, String lastName, int age, String realId, String email, String telephone, String address, boolean hasInsurance) {
        super(firstName, lastName, age, realId, email, telephone, address);
        this.hasInsurance = hasInsurance;
    }

    public boolean isHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
}
