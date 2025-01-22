package com.startup.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "service_entities")
public class ServiceEntity extends User {

    private String entityName; // e.g., Store or Restaurant Name
    private String entityAddress;

    public ServiceEntity() {}

    public ServiceEntity(String username, String password, Role role, String email, String phone, String entityName, String entityAddress) {
        super(username, password, role, email, phone);
        this.entityName = entityName;
        this.entityAddress = entityAddress;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityAddress() {
        return entityAddress;
    }

    public void setEntityAddress(String entityAddress) {
        this.entityAddress = entityAddress;
    }

    @Override
    public String toString() {
        return "ServiceEntity{" +
                "entityName='" + entityName + '\'' +
                ", entityAddress='" + entityAddress + '\'' +
                "} " + super.toString();
    }
}
