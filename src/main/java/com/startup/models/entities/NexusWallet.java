package com.startup.models.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "nexus_wallets")
public class NexusWallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private BigDecimal balance = BigDecimal.ZERO;

    @Column(nullable = false)
    private LocalDateTime lastUpdated;

    public NexusWallet() {}

    public NexusWallet(User user) {
        this.user = user;
        this.lastUpdated = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
        this.lastUpdated = LocalDateTime.now();
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    @Override
    public String toString() {
        return "NexusWallet{" +
                "id=" + id +
                ", user=" + user +
                ", balance=" + balance +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
