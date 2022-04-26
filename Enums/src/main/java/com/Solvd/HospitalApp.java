package com.Solvd;

import com.Solvd.Enums.Gender;
import com.Solvd.Enums.Specialization;
import com.Solvd.Enums.Symptom;
import com.Solvd.Exceptions.*;
import com.Solvd.Models.BloodTest;
import com.Solvd.Models.Consult;
import com.Solvd.Models.Hospital;
import com.Solvd.Models.MedicalRecord;
import com.Solvd.Models.equipment.Equipment;
import com.Solvd.Models.equipment.Ultrasound;
import com.Solvd.Models.equipment.Xray;
import com.Solvd.Models.person.Doctor;
import com.Solvd.Models.person.Nurse;
import com.Solvd.Models.person.Patient;
import com.Solvd.Models.person.Person;
import com.Solvd.Models.supplies.Disposables;
import com.Solvd.Models.supplies.Supplies;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.Scanner;

public class HospitalApp {

    private static final Logger LOGGER = LogManager.getLogger(HospitalApp.class);

    public static void main(String args[]){


        //Instantiation of Hospital(s)
        Hospital hospital = new Hospital("St. Francis","NoName st 123","Philadelphia");

        //Instantiation of Doctors and Nurses
        Doctor doc1 = new Doctor("John","Doe", 32, "1234", "John@hospital.com", "555-1234", "Happy st 345", Gender.MALE,true, Specialization.NEURO);
        Doctor doc2 = new Doctor("Paul","Smith",50,"2345","Paul@hospital.com","555-6789","House st 45",Gender.MALE ,true,Specialization.CARDIO);
        Doctor doc3 = new Doctor("Laura","Jones",41,"5544","Laura@hospital.com","555-5432", "General st 900", Gender.FEMALE ,false, Specialization.CLINICAL);
        Doctor doc4 = new Doctor("Jane","Booth",28,"1111","Jane@hospital.com","555-1111","General st 655", Gender.FEMALE ,true, Specialization.PAED);

        Nurse nurse1 = new Nurse("Sean","Torres",30,"3434","Sean@hospital.com","555-5656","Davis st 56", Gender.MALE ,true);
        Nurse nurse2 = new Nurse("Stella","Lopez",51,"4321","Stella@hospital.com","555-3535","NoName st 459", Gender.FEMALE,true);
        Nurse nurse3 = new Nurse("Carla","Michaels",17,"2367","Carla@hospital.com","555-5656","Philadelphia st 56", Gender.FEMALE,false);

        //Checking if the Staff (doctor or nurse) has a valid age for a worker
        try{
            checkAge(nurse3);
        } catch(StaffAgeException e){
            //System.out.println(e);
            LOGGER.error(e);
        }

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
        Xray xray3 = new Xray("X-ray",-2,true,"ok");

        //Checking if the equipment has a valid Id

        try{
            checkId(xray3);
        } catch(ValidIdException e){
            LOGGER.error(e);
            //System.out.println("\n"+e);
        }

        //Checking a valid number of patients in the waiting room
        LOGGER.info("How many patients are in the waiting room?");
        try(Scanner sc = new Scanner(System.in)){
            checkNumberOfPatients(sc.nextInt());
        } catch (NumberOfPatientsException e){
            LOGGER.error(e);
            //System.out.println("\n" + e);
        }


        //Instantiation of Patients
        Patient patient1 = new Patient("Michael","Phelps",20,"6543", "Mike@gmail.com","555-5555","fake st 44", Gender.MALE,true);
        Patient patient2 = new Patient("Camila","Crosetta",29,"4312","Paulie@hotmail.com","555-6754","unreal st 321",Gender.FEMALE,true);
        Patient patient3 = new Patient("Ross","Geller",29,"6457","ross@outlook.com","555-9999","unreal st 67",Gender.MALE,false);
        //Checking if the patient has insurance with the exception
        try{
            checkInsurance(patient3);
        } catch (HasNotInsuranceException e){
            //System.out.println("\n"+e);
            LOGGER.error(e);
        }
        //Instantiation of Supplies
        Disposables mask = new Disposables("mask",0,1234,"face mask","N95");
        //Checking if the supply is out of stock with the exception
        try{
            checkStock(mask);
        } catch(Exception e){
            //System.out.println("\n"+e);
            LOGGER.error(e);
        }

        //Instantiation of Blood Tests
        BloodTest test1 = new BloodTest(patient1,doc1,"Normal","Normal","Normal");
        BloodTest test2 = new BloodTest(patient2, doc4,"Low","Low","High");

        //Diagnosis of patients
        Consult consult1 = new Consult(patient1, Symptom.HEADACHE,LocalDate.now(),ultrasound1,xray1,test1);
        System.out.println(consult1.toString());

        Consult consult2 = new Consult(patient2,Symptom.COVID,LocalDate.now(),ultrasound2,xray2,test2);
        System.out.println(consult2.toString());

        //adding the consults to the medical record

        MedicalRecord record1 = new MedicalRecord(1,patient1,doc1,nurse1,consult1);
        record1.addConsultToMedicalRecord();

        MedicalRecord record2 = new MedicalRecord(3,patient2,doc2,nurse2,consult2);
        record2.addConsultToMedicalRecord();

    }

    public static void checkStock(Supplies sup) throws OutofStockException{
        if(sup.getStock() <= 0){
            throw new OutofStockException("This supply is out of stock");
        }
    }

    public static void checkInsurance(Patient pat) throws HasNotInsuranceException{
        if (!(pat.isHasInsurance())){
            throw new HasNotInsuranceException("the patient must have insurance");
        }
    }

    public static void checkAge(Person per) throws StaffAgeException{
        if(per.getAge() < 18){
            throw new StaffAgeException("You are too young to work for the hospital");
        }
    }

    public static void checkId(Equipment equip) throws ValidIdException{
        if(equip.getEquipId() < 0){
            throw new ValidIdException("The id of the equipment is not valid");
        }
    }

    public static void checkNumberOfPatients(int numberOfPatients) throws NumberOfPatientsException{
        if (numberOfPatients<=0){
            throw new NumberOfPatientsException("There are no patients in the waiting room");
        }

    }
}


