package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity

public class Student {
    @GeneratedValue
    @Id
    private int id;
    private String Fname;
    private String Lname;
    private String address;
    private int PnoNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPnoNumber() {
        return PnoNumber;
    }

    public void setPnoNumber(int pnoNumber) {
        PnoNumber = pnoNumber;
    }
}
