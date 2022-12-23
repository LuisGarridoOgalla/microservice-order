package com.order.microservice.infraestructure.controller;

import java.util.List;

import com.order.microservice.api.OrderApi;
import com.order.microservice.api.model.OrderCreateDTO;
import com.order.microservice.api.model.OrderDTO;
import com.order.microservice.application.AddOrder;
import com.order.microservice.infraestructure.controller.mapper.OrderApiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController implements OrderApi {

  @Autowired
  AddOrder addOrder;

  @Autowired
  OrderApiMapper orderApiMapper;

  @Override
  public ResponseEntity<Void> deleteOrder(Long orderId) {
    return OrderApi.super.deleteOrder(orderId);
  }

  @Override
  public ResponseEntity<OrderDTO> generateOrder(OrderCreateDTO orderCreateDTO) {

    var response =addOrder.run(orderApiMapper.toDomain(orderCreateDTO));
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(orderApiMapper.toApi(response));
  }

  @Override
  public ResponseEntity<List<OrderDTO>> getOrder(Long orderId) {
    return OrderApi.super.getOrder(orderId);
  }

  @Override
  public ResponseEntity<OrderDTO> updateOrder(Long orderId, OrderCreateDTO orderCreateDTO) {
    return OrderApi.super.updateOrder(orderId, orderCreateDTO);
  }
}
