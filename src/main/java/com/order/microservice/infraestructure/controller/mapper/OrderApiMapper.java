package com.order.microservice.infraestructure.controller.mapper;


import java.util.List;

import com.order.microservice.api.model.OrderCreateDTO;
import com.order.microservice.api.model.OrderDTO;
import com.order.microservice.api.model.ProductDTO;
import com.order.microservice.domain.Order;
import com.order.microservice.domain.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderApiMapper {

  Order toDomain(OrderCreateDTO orderCreateDTO);
  ProductDTO toDomain(Product product);
  List<ProductDTO> toDomain(List<Product> product);
  OrderDTO toApi(Order order);
}
