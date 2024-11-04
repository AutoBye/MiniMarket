package com.example.minimarket.repository;

import com.example.minimarket.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    /** 이름으로 상품 검색 (부분 일치 검색 가능)*/
    List<Product> findByNameContaining(String name);

    /** 재고가 있는 상품만 검색*/
    List<Product> findByStockGreaterThan(Integer stock);
}
