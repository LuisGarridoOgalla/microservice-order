package com.order.microservice.domain;

import java.util.List;

import com.order.microservice.infraestructure.db.entity.CustomerEntity;
import com.order.microservice.infraestructure.db.entity.ProductEntity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Order {

  private Long orderId;

  private String amount;

  private Long customerId;

  private List<ProductEntity> products;
}

