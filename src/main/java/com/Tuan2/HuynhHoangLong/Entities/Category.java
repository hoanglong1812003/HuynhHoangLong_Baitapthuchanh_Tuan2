package com.Tuan2.HuynhHoangLong.Entities;

public class Category {
    private long id;
    private String name;

    // Constructors
    public Category() {
    }

    public Category(long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters và Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
