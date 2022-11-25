package com.lcwd.rating.services;

import com.lcwd.rating.entities.Ratings;

import java.util.List;

public interface RatingService {

//create
    Ratings create(Ratings ratings);

//get all ratings
    List<Ratings> getRatings();


 //get ratings by userId
 List<Ratings> getRatingsByUserId(String UserId);


 //get all by hotel
    List<Ratings> getRatingByHotelId(String hotelId);



}
