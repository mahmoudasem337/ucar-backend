package com.graduationproject.asem.Review;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;
    private String carModel;
    private String brand;
    private int year;
    private String carReview;

    public Review(Long reviewId, String carModel, String brand, int year, String carReview) {
        this.reviewId = reviewId;
        this.carModel = carModel;
        this.brand = brand;
        this.year = year;
        this.carReview = carReview;
    }

    public Review() {

    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCarReview() {
        return carReview;
    }

    public void setCarReview(String carReview) {
        this.carReview = carReview;
    }
}

