package com.Solvd.Models.person;

import com.Solvd.Enums.Gender;

public abstract class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String realId;
    private String email;
    private String telephone;
    private String address;
    private Gender gender;

    public Person(){};

    public Person(String firstName, String lastName, int age , String realId,String email,String telephone, String address, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.realId = realId;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRealId() {
        return realId;
    }

    public void setRealId(String realId) {
        this.realId = realId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nAge: " + age +
                "\nRealId: " + realId +
                "\nEmail: " + email +
                "\nTelephone: " + telephone +
                "\nAddress: " + address;
    }
}
