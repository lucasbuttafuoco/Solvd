import Models.BloodTest;
import Models.Consult;
import Models.Hospital;
import Models.equipment.Ultrasound;
import Models.equipment.Xray;
import Models.person.Doctor;
import Models.person.Nurse;
import Models.person.Patient;

import java.time.LocalDate;

public class HospitalApp {
    public static void main(String args[]){
        //Instantiation of Hospital(s)
        Hospital hospital = new Hospital("St. Francis","NoName st 123","Philadelphia");

        //Instantiation of Doctors and Nurses
        Doctor doc1 = new Doctor("John","Doe", 32, "1234", "John@hospital.com", "555-1234", "Happy st 345", true, "Neurologist");
        Doctor doc2 = new Doctor("Paul","Smith",50,"2345","Paul@hospital.com","555-6789","House st 45", true,"Cardiologist");
        Doctor doc3 = new Doctor("Laura","Jones",41,"5544","Laura@hospital.com","555-5432", "General st 900", false, "MD");
        Doctor doc4 = new Doctor("Jane","Booth",28,"1111","Jane@hospital.com","555-1111","General st 655", true, "Pediatrics");

        Nurse nurse1 = new Nurse("Sean","Torres",30,"3434","Sean@hospital.com","555-5656","Davis st 56", true);
        Nurse nurse2 = new Nurse("Stella","Lopez",51,"4321","Stella@hospital.com","555-3535","NoName st 459",true);
        Nurse nurse3 = new Nurse("Carla","Michaels",34,"2367","Carla@hospital.com","555-5656","Philadelphia st 56",false);

        //adding them to the list of employees
        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addDoctor(doc3);
        hospital.addDoctor(doc4);
        hospital.addNurse(nurse1);
        hospital.addNurse(nurse2);
        hospital.addNurse(nurse3);

        //Instantiation of Equipment
        Ultrasound ultrasound1 = new Ultrasound("ultrasound",23,true,"OK");
        Ultrasound ultrasound2 = new Ultrasound("ultrasound",23,true,"Caution");
        Xray xray1 = new Xray("X-ray", 34, true,"OK");
        Xray xray2 = new Xray("X-ray",12,true,"Caution");

        //Instantiation of Patients
        Patient patient1 = new Patient("Michael","Phelps",20,"6543", "Mike@gmail.com","555-5555","fake st 44",true);
        Patient patient2 = new Patient("Camila","Crosetta",29,"4312","Paulie@hotmail.com","555-6754","unreal st 321",true);
        Patient patient3 = new Patient("Ross","Geller",29,"6457","ross@outlook.com","555-9999","unreal st 67",false);


        //Instantiation of Blood Tests
        BloodTest test1 = new BloodTest(patient1,doc1,"Normal","Normal","Normal");
        BloodTest test2 = new BloodTest(patient2, doc4,"Low","Low","High");

        //Diagnosis of patients
        Consult consult1 = new Consult(patient1,"headache",LocalDate.now(),ultrasound1,xray1,test1);
        System.out.println(consult1.toString());

        Consult consult2 = new Consult(patient2,"Low Pressure and sickness",LocalDate.now(),ultrasound2,xray2,test2);
        System.out.println(consult2.toString());

    }
}
