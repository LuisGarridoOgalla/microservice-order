package com.order.microservice.infraestructure.db.adapter.mapper;


import com.order.microservice.api.model.OrderDTO;
import com.order.microservice.domain.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

  OrderDTO toApi(Order order);
}
