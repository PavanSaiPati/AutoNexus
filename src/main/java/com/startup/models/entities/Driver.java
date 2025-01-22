package com.startup.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "drivers")
public class Driver extends User {

    private String licenseNumber;
    private String vehicleDetails; // e.g., Car Model, Plate Number

    public Driver() {}

    public Driver(String username, String password, Role role, String email, String phone, String licenseNumber, String vehicleDetails) {
        super(username, password, role, email, phone);
        this.licenseNumber = licenseNumber;
        this.vehicleDetails = vehicleDetails;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "licenseNumber='" + licenseNumber + '\'' +
                ", vehicleDetails='" + vehicleDetails + '\'' +
                "} " + super.toString();
    }
}
