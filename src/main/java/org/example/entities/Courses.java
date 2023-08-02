package org.example.entities;

public class Courses {
    private String kursAdi;
    private int price;


    public Courses(){

    }

    public Courses(String kursAdi, int price) {
        this.kursAdi = kursAdi;
        this.price = price;
    }

    public String getKursAdi() {
        return kursAdi;
    }

    public void setKursAdi(String kursAdi) {
        this.kursAdi = kursAdi;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
