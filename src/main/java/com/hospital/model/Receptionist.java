package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Receptionist {
    @Id
    @GeneratedValue
    private int ReceptionistId;
    private String FName;
    private String LName;
    private String Address;

    public int getReceptionistId() {
        return ReceptionistId;
    }

    public void setReceptionistId(int receptionistId) {
        ReceptionistId = receptionistId;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
