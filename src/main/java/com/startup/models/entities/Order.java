package com.startup.models.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "driver_id", nullable = true) // Nullable for self-pickup cases
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "service_entity_id", nullable = false)
    private ServiceEntity serviceEntity;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = true)
    private BigDecimal tip;

    @Column(nullable = false)
    private LocalDateTime orderTime;

    @Column(nullable = false)
    private String status; // e.g., PENDING, COMPLETED, CANCELED

    public Order() {}

    public Order(Customer customer, Driver driver, ServiceEntity serviceEntity, BigDecimal amount, BigDecimal tip, String status) {
        this.customer = customer;
        this.driver = driver;
        this.serviceEntity = serviceEntity;
        this.amount = amount;
        this.tip = tip;
        this.orderTime = LocalDateTime.now();
        this.status = status;
    }

    // Getters, setters, and toString() methods here...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServiceEntity getServiceEntity() {
        return serviceEntity;
    }

    public void setServiceEntity(ServiceEntity serviceEntity) {
        this.serviceEntity = serviceEntity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getTip() {
        return tip;
    }

    public void setTip(BigDecimal tip) {
        this.tip = tip;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }
}
