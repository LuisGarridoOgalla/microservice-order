package com.order.microservice.infraestructure.db.adapter.mapper;


import com.order.microservice.domain.Customer;
import com.order.microservice.domain.Order;
import com.order.microservice.domain.Product;
import com.order.microservice.infraestructure.db.entity.CustomerEntity;
import com.order.microservice.infraestructure.db.entity.DemandEntity;
import com.order.microservice.infraestructure.db.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

  Order toDomain(DemandEntity orderEntity);
  Product toDomain(ProductEntity product);
  List<Product> toDomain(List<ProductEntity> product);
  Customer toDomain(CustomerEntity customerEntity);

  DemandEntity toEntity(Order order);
  ProductEntity toEntity(Product product);
  List<ProductEntity> toEntity(List<Product> product);
  CustomerEntity toEntity(Customer customerEntity);

}
