package com.bristle.chief.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Orders {

    @Id
    @Column(name = "order_id")
    String orderId;

    @Column(name = "order_id_pr")
    String orderIdPR;

    @Column(name = "order_date")
    Date orderDate;

    public Orders() {

    }

    public Orders(String orderId, String orderIdPR, Date orderDate) {
        this.orderId = orderId;
        this.orderIdPR = orderIdPR;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderIdPR() {
        return orderIdPR;
    }

    public void setOrderIdPR(String orderIdPR) {
        this.orderIdPR = orderIdPR;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
