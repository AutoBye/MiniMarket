package com.example.minimarket.repository;

import com.example.minimarket.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    /** 특정 주문에 속한 모든 주문 항목 검색*/
    List<OrderItem> findByOrderId(Long orderId);
}
