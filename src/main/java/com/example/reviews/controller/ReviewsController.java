package com.example.reviews.controller;

import com.example.reviews.model.Review;
import com.example.reviews.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewsController {
    RatingService ratingService;

    @Autowired
    ReviewsController(RatingService r) {
        ratingService = r;
    }

    @CrossOrigin
    @GetMapping("/reviews/{productId}")
    public ResponseEntity<List<Review>> bookReviewsById(@PathVariable("productId") int productId) {
        return ResponseEntity.ok(ratingService.getReviews(productId));
    }
}
