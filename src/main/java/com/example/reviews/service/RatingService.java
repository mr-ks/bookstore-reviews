package com.example.reviews.service;

import com.example.reviews.model.Rating;
import com.example.reviews.model.Review;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RatingService {
    public List<Review> getReviews(int productId) {
        var reviews = new ArrayList<Review>();
        for (int i = 0; i < 60; i++) {
            var r = new Review();

            var rating = new Rating();
            rating.setColor("red");
            rating.setStars(i % 6);

            r.setRating(rating);
            r.setText("First Rating " + i);
            r.setReviewer("John Doe");
            reviews.add(r);
        }

        return reviews;
    }
}
