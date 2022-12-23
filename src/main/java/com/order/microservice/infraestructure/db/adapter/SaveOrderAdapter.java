package com.order.microservice.infraestructure.db.adapter;

import com.order.microservice.domain.Order;
import com.order.microservice.domain.port.SaveOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class SaveOrderAdapter implements SaveOrderRepository {

  @Override
  public Order save(Order order) {
    return null;
  }
}
