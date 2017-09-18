package com.example.burge.dictionary;

/**
 * Created by Burge on 17.09.2017.
 */

public class Film {

    String name;
    double rating;
    String description;

    public Film(String name, double rating, String description) {
        this.name = name;
        this.rating = rating;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
