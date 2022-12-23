package com.order.microservice.infraestructure.db.repository;

import com.order.microservice.infraestructure.db.entity.DemandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<DemandEntity, Long> {

}
