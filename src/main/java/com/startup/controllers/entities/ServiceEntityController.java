package com.startup.controllers.entities;

import com.startup.models.entities.ServiceEntity;
import com.startup.services.entities.ServiceEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/service-entities")
public class ServiceEntityController {

    private final ServiceEntityService serviceEntityService;

    @Autowired
    public ServiceEntityController(ServiceEntityService serviceEntityService) {
        this.serviceEntityService = serviceEntityService;
    }

    @PostMapping
    public ServiceEntity createServiceEntity(@RequestBody ServiceEntity serviceEntity) {
        return serviceEntityService.saveServiceEntity(serviceEntity);
    }

    @GetMapping("/{entityName}")
    public Optional<ServiceEntity> getServiceEntity(@PathVariable String entityName) {
        return serviceEntityService.findByEntityName(entityName);
    }
}
