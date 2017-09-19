package com.example.burge.dictionary;

/**
 * Created by Burge on 17.09.2017.
 */

public class Film {

    int poster;
    String name;
    double rating;
    String description;

    public Film(int poster, String name, double rating, String description) {
        this.poster = poster;
        this.name = name;
        this.rating = rating;
        this.description = description;
    }
    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
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
