package com.Solvd.Enums;

public enum Symptom {
    HEADACHE("Headache","Rest and 1 Migral 1mg per 8 hours."),
    STOMACHACHE("Stomachache", "Diet, plenty of water and 1 Buscapina pero 8 hours."),
    FRACTURE("Fracture", "Cast the fractured zone."),
    ALLERGY("Allergy","antihistamine"),
    COVID("Covid","rest, isolation for a week and ibuprofen");

    private String disease;
    private String medication;

    Symptom(String disease, String medication) {
        this.disease = disease;
        this.medication = medication;
    }

    public String getDisease() {
        return disease;
    }

    public String getMedication() {
        return medication;
    }

    @Override
    public String toString() {
        return "Symptom{" +
                "disease='" + disease + '\'' +
                ", medication='" + medication + '\'' +
                '}';
    }
}
