package com.lcwd.rating.services.impl;

import com.lcwd.rating.entities.Ratings;
import com.lcwd.rating.repositories.RatingRepositories;
import com.lcwd.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepositories ratingRepositories;

    @Override
    public Ratings create(Ratings ratings) {
        return ratingRepositories.save(ratings);
    }

    @Override
    public List<Ratings> getRatings() {
        return ratingRepositories.findAll();
    }

    @Override
    public List<Ratings> getRatingsByUserId(String UserId) {
        return ratingRepositories.findByUserId(UserId);
    }

    @Override
    public List<Ratings> getRatingByHotelId(String hotelId) {
        return ratingRepositories.findByHotelId(hotelId);
    }
}
