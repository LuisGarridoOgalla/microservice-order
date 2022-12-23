package com.order.microservice.application;


import com.order.microservice.domain.Order;
import com.order.microservice.domain.port.SaveOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddOrderImpl implements AddOrder {

  @Autowired
  SaveOrderRepository saveOrderRepository;

  @Override
  public Order run(Order order) {
    return saveOrderRepository.save(order);
  }
}
