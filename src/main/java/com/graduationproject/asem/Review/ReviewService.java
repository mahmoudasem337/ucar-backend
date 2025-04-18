package com.graduationproject.asem.Review;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    private final ReviewRepository repository;
    public ReviewService(ReviewRepository repository) {
        this.repository = repository;
    }

    public List<Review> getAllReviews() {
        return repository.findAll();
    }

    public Optional<Review> getReviewById(Long id) {
        return repository.findById(id);
    }

    public Review createReview(Review review) {
        return repository.save(review);
    }

    public void deleteReview(Long id) {
        repository.deleteById(id);
    }

    public Review updateReview(Long id, Review updatedReview) {
        return repository.findById(id).map(review -> {
            review.setCarModel(updatedReview.getCarModel());
            review.setBrand(updatedReview.getBrand());
            review.setYear(updatedReview.getYear());
            review.setCarReview(updatedReview.getCarReview());
            return repository.save(review);
        }).orElse(null);
    }
}
