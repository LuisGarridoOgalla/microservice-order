package com.order.microservice.infraestructure.controller.mapper;


import java.util.List;

import com.order.microservice.api.model.OrderCreateDTO;
import com.order.microservice.api.model.OrderDTO;
import com.order.microservice.api.model.ProductDTO;
import com.order.microservice.domain.Customer;
import com.order.microservice.domain.Order;
import com.order.microservice.domain.Product;
import com.order.microservice.infraestructure.db.entity.CustomerEntity;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderApiMapper {

/*
  @Mapping(target = "products", expression = "(java(toDomain(orderCreateDTO.getProduct()))")
*/
  Order toDomain(OrderCreateDTO orderCreateDTO);

  List<ProductDTO> toDomain(List<Product> product);
  ProductDTO toDomain(Product product);

  OrderDTO toApi(Order order);
}
