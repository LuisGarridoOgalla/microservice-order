package com.order.microservice.domain.port;

import com.order.microservice.domain.Order;

public interface SaveOrderRepository {
  Order save(Order order);
}
