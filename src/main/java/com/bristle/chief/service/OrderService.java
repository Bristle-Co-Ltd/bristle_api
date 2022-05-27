package com.bristle.chief.service;

import com.bristle.chief.data_access.dao.OrderDAO;
import com.bristle.chief.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class OrderService {

    private final OrderDAO orderDAO;

    @Autowired
    public OrderService(OrderDAO orderDAO){
        this.orderDAO = orderDAO;
    }

    @Transactional
    public void addOrder(String order_id, String order_pr) {
        orderDAO.save(new Order(order_id, order_pr, Date.valueOf(LocalDate.now())));
    }

    public List<Order> getOrders(){
        return orderDAO.getAll();
    }
}
