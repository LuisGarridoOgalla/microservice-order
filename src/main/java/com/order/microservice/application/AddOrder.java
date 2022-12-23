package com.order.microservice.application;

import com.order.microservice.domain.Order;

public interface AddOrder {

  Order run(Order order);
}
