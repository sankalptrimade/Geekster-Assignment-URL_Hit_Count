package com.example.url_hit_counter.model;

public class Visit {
    private String username;
    private int count;
    public Visit() {
    }

    public Visit(String username, int count) {
        this.username=username;
        this.count = count;
    }


//    public Visit(int count) {
//        this.count = count;
//    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "username='" + username + '\'' +
                ", count=" + count +
                '}';
    }

//        @Override
//    public String toString() {
//        return "Visit{" +
//                "count=" + count +
//                '}';
//    }
}
