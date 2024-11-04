package com.example.minimarket.repository;

import com.example.minimarket.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    /** 특정 상품에 대한 모든 리뷰 검색 */
    List<Review> findByProductId(Long productId);

    /** 특정 사용자가 작성한 리뷰 검색 */
    List<Review> findByUserId(Long userId);
}
