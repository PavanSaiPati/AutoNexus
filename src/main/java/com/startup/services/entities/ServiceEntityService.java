package com.startup.services.entities;

import com.startup.models.entities.ServiceEntity;
import com.startup.repositories.entities.ServiceEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceEntityService {

    private final ServiceEntityRepository serviceEntityRepository;


    @Autowired
    public ServiceEntityService(ServiceEntityRepository serviceEntityRepository) {
        this.serviceEntityRepository = serviceEntityRepository;
    }

    public Optional<ServiceEntity> findByEntityName(String entityName) {
        return serviceEntityRepository.findByEntityName(entityName);
    }

    public ServiceEntity saveServiceEntity(ServiceEntity serviceEntity) {
        return serviceEntityRepository.save(serviceEntity);
    }
}
