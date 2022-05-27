package com.bristle.chief.data_access.dao;

import com.bristle.chief.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderDAO extends JpaRepository<Order, Long> {
    @Query(value = "SELECT * FROM orders", nativeQuery = true)
    List<Order> getAll();
}
