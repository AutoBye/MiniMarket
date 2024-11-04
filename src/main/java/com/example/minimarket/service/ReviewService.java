package com.example.minimarket.service;

import com.example.minimarket.model.Review;
import com.example.minimarket.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    /** 모든 리뷰 목록 가져오기 */
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    /** ID로 리뷰 조회하기 */
    public Optional<Review> getReviewById(Long id) {
        return reviewRepository.findById(id);
    }

    /** 새로운 리뷰 추가하기 */
    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    /** 리뷰 삭제하기 */
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
