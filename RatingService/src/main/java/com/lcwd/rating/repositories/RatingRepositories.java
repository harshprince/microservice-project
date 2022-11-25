package com.lcwd.rating.repositories;

import com.lcwd.rating.entities.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepositories extends JpaRepository<Ratings,String> {

    //custom finder methods
    List<Ratings> findByUserId(String userId);
    List<Ratings> findByHotelId(String hotelId);
}
