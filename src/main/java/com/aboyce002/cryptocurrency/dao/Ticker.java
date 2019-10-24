package com.aboyce002.cryptocurrency.dao;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticker {

    private String base;
    private String target;
    private double price;
    private double volume;
    private double change;

    public Ticker() {
    }

    public Ticker(String base, String target, double price, double volume, double change) {
        this.base = base;
        this.target = target;
        this.price = price;
        this.volume = volume;
        this.change = change;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "base='" + base + '\'' +
                ", target='" + target + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", change=" + change +
                '}';
    }
}
