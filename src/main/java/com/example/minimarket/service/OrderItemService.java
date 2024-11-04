package com.example.minimarket.service;

import com.example.minimarket.model.OrderItem;
import com.example.minimarket.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {

    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    /** 모든 주문 항목 목록 가져오기 */
    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    /** ID로 주문 항목 조회하기 */
    public Optional<OrderItem> getOrderItemById(Long id) {
        return orderItemRepository.findById(id);
    }

    /** 새로운 주문 항목 추가하기 */
    public OrderItem addOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    /** 주문 항목 삭제하기 */
    public void deleteOrderItem(Long id) {
        orderItemRepository.deleteById(id);
    }
}
