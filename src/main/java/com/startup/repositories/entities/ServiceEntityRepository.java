package com.startup.repositories.entities;

import com.startup.models.entities.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServiceEntityRepository extends JpaRepository<ServiceEntity, Long> {
    Optional<ServiceEntity> findByEntityName(String entityName);
    Optional<ServiceEntity> findByEmail(String email);
}
