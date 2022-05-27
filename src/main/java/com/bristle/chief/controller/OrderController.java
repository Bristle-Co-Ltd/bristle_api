package com.bristle.chief.controller;

import com.bristle.chief.model.Order;
import com.bristle.chief.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1")
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getAllOrders")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @PutMapping("/addOrder")
    public void addOrder(
            @RequestParam(required = true) String order_id,
            @RequestParam(required = true) String order_id_pr
    ) {
        orderService.addOrder(order_id, order_id_pr);
    }
}
