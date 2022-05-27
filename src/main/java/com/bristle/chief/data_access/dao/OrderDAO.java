package com.bristle.chief.DataAccessLayer.dao;

import com.bristle.chief.Model.Order;
import com.bristle.chief.Utility.Constants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDAO extends JpaRepository<Order, Long> {
    @Query("SELECT * FROM orders")
    List<Order> getAll();
}
