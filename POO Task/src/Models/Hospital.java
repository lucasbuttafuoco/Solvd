package Models;

import Models.person.Doctor;
import Models.person.Nurse;


import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String name;
    private String address;
    private String city;
    private List<Doctor> doctors = new ArrayList<>(); //this list contains the doctors who work in the hospital
    private List<Nurse> nurses = new ArrayList<>();  //this list contains the nurses who work in the hospital


    public Hospital(){}

    public Hospital(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors (List<Doctor> doctors){
        this.doctors = doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    /**
     * with this method you can add one doctor to the hospital staff.
     * @param doctor you must instance an object Doctor in main application, then you can use this method.
     */
    public void addDoctor(Doctor doctor){
        this.getDoctors().add(doctor);
    }

    /**
     * same as addDoctor
     * @param nurse same as addDoctor
     */
    public void addNurse(Nurse nurse){ //with this method you can add one nurse to the hospital
        this.getNurses().add(nurse);
    }

    /**
     * in order to Override String method as a part of the task
     * @return
     */
    @Override
    public String toString() {
        return "\n Hospital: "+ "\nname: " + name + "\naddress: " + address + "\ncity: "+ city;
    }
}
