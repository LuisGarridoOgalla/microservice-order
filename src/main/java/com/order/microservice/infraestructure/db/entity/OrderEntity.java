package com.order.microservice.infraestructure.db.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "OrderEntity")
@Table(name = "demand")
@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "orderid", unique = true, nullable = false)
  private Long orderId;

  @Column(name = "amount", nullable = false)
  private String amount;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "customerid")
  private CustomerEntity customerEntity;

/*  @ManyToMany(cascade={CascadeType.ALL})
  @JoinTable(name="order_product", joinColumns=@JoinColumn(name="orderid"),
      inverseJoinColumns=@JoinColumn(name="productid"))
  List<ProductEntity> products;*/

}

