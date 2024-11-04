package com.example.minimarket.repository;

import com.example.minimarket.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    /** 특정 사용자의 모든 주문 검색*/
    List<Order> findByUserId(Long userId);

    /** 특정 상태의 주문 검색*/
    List<Order> findByStatus(Order.Status status);
}
