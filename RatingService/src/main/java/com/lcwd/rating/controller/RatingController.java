package com.lcwd.rating.controller;

import com.lcwd.rating.entities.Ratings;
import com.lcwd.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;
    //create ratings
    @PostMapping
    public ResponseEntity<Ratings> create(@RequestBody Ratings rating){
        return  ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    //get all ratings by userId
    @GetMapping("/users{userId}")
    public ResponseEntity<List<Ratings>> getRatingsByUserId(@PathVariable  String userId){
        return ResponseEntity.ok(ratingService.getRatingsByUserId(userId));
    }

    //get all hotels by hotelId
    @GetMapping("/hotels{hotelId}")
    public ResponseEntity<List<Ratings>> getRatingsByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }

}
