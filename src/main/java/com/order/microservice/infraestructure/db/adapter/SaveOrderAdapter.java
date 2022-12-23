package com.order.microservice.infraestructure.db.adapter;

import com.order.microservice.domain.Order;
import com.order.microservice.domain.port.SaveOrderRepository;
import com.order.microservice.infraestructure.db.adapter.mapper.OrderMapper;
import com.order.microservice.infraestructure.db.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveOrderAdapter implements SaveOrderRepository {

  @Autowired
  OrderMapper orderMapper;
  @Autowired
  OrderRepository orderRepository;

  @Override
  public Order save(Order order) {
    var entity = orderRepository.save(orderMapper.toEntity(order));
    return orderMapper.toDomain(entity);
  }
}
