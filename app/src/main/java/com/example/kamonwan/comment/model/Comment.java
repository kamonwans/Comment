package com.example.kamonwan.comment.model;

public class Comment {
    private String name;
    private String date;
    private String msg;
    private int imageUrl;

    public Comment(String name, String date, String msg, int imageRes) {
        this.name = name;
        this.date = date;
        this.msg = msg;
        this.imageUrl = imageRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageRes) {
        this.imageUrl = imageRes;
    }
}
