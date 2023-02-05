package com.example.resturant.model;

public class Restaurant {


    private int id;
    private String name;
    private double rating;
    private  String location;
    private int totalStaff;

    private Boolean certified;

    public Restaurant(){

    }

    public Restaurant(int id,String name, double rating, String location, int totalStaff, Boolean certified) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.location = location;
        this.totalStaff = totalStaff;
        this.certified = certified;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public Boolean getCertified() {
        return certified;
    }

    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", location='" + location + '\'' +
                ", totalStaff=" + totalStaff +
                ", certified=" + certified +
                '}';
    }
}
