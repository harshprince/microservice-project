
package com.lcwd.rating.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.annotation.Documented;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ratings {

    @Id
    @GeneratedValue
    private int ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;



}

