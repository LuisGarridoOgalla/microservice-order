package com.order.microservice.infraestructure.db.entity;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "DemandEntity")
@Table(name = "demand")
@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DemandEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "orderid", unique = true, nullable = false)
  private Long orderId;

  @Column(name = "amount", nullable = false)
  private String amount;

  @ManyToOne
  @JoinColumn(name = "customerid")
  private CustomerEntity customerEntity;

  @ManyToMany(cascade={CascadeType.ALL})
  @JoinTable(name="order_product", joinColumns=@JoinColumn(name="orderid"),
      inverseJoinColumns=@JoinColumn(name="productid"))
  List<ProductEntity> products;

}

