package com.startup.services.drivers;

import com.startup.models.entities.Driver;
import com.startup.repositories.drivers.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DriverService {

    private final DriverRepository driverRepository;

    @Autowired
    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public Optional<Driver> findByUsername(String username) {
        return driverRepository.findByUsername(username);
    }

    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);
    }
}
