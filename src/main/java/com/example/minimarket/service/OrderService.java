package com.example.minimarket.service;

import com.example.minimarket.model.Order;
import com.example.minimarket.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /** 모든 주문 목록 가져오기 */
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    /** ID로 주문 조회하기 */
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    /** 새로운 주문 추가하기 */
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    /** 주문 삭제하기 */
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
