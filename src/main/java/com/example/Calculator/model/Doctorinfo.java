package com.example.Calculator.model;

public class Doctorinfo {
    String name;
    int id;
    String section;
    float timmimg;
    //peramiterised constructor

    public Doctorinfo(String name, int id, String section, float timmimg) {
        this.name = name;
        this.id = id;
        this.section = section;
        this.timmimg = timmimg;
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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public float getTimmimg() {
        return timmimg;
    }

    public void setTimmimg(float timmimg) {
        this.timmimg = timmimg;
    }
}
