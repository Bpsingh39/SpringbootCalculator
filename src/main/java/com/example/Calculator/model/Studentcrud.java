package com.example.Calculator.model;

public class Studentcrud {
    String name;
    int id;
    int year;
    String branch;
    //perameterized constuctor


    public Studentcrud(String name, int id, int year, String branch) {
        this.name = name;
        this.id = id;
        this.year = year;
        this.branch = branch;
    }
    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
