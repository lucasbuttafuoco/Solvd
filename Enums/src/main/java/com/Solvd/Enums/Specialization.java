package com.Solvd.Enums;

public enum Specialization {

    PAED("Paediatrics"),
    NEURO("Neurologyst"),
    CARDIO("Cardiologyst"),
    CLINICAL("CLinical"),
    PARA("Paramedic");

    private String specialization;

    Specialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "specialization='" + specialization + '\'' +
                '}';
    }
}
