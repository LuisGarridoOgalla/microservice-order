CREATE SCHEMA IF NOT EXISTS "order";

-- Customer
create TABLE "order".customer (
    customerid BIGSERIAL,
    name varchar(255) NOT NULL,
    CONSTRAINT pk_customer PRIMARY KEY (customerid)
    );

-- demand
create TABLE "order".demand (
    orderid BIGSERIAL ,
    amount varchar(255) NOT NULL,
    customerid BIGSERIAL NOT NULL,
    CONSTRAINT pk_order_id PRIMARY KEY (orderid),
    CONSTRAINT FK_CUSTOMER FOREIGN KEY (customerid) REFERENCES "order".customer(customerid)
    );

-- product
create TABLE "order".product (
    productid BIGSERIAL,
    name varchar(255) NOT NULL,
    CONSTRAINT pk_product_id PRIMARY KEY (productid)
    );

-- Order_Product
create TABLE "order".demand_product (
    orderid bigint NOT NULL,
    productid bigint NOT NULL,
    CONSTRAINT pk_order_product PRIMARY KEY (orderid, productid),
    CONSTRAINT FK_ORDER_PRODUCT FOREIGN KEY (orderid) REFERENCES "order".demand (orderid),
    CONSTRAINT FK_PRODUCT_ORDER FOREIGN KEY (productid) REFERENCES "order".product (productid)
);

INSERT INTO "order".customer(
	customerid, name)
	VALUES (1, 'luis');

INSERT INTO "order".product(
	productid, name)
	VALUES (1, 'Tablet');