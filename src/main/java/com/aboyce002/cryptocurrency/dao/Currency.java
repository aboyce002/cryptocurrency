package com.aboyce002.cryptocurrency.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency {

    private Ticker ticker;
    private int timeStamp;
    private boolean success;
    private String error;

    public Currency(){

    }

    public Currency(Ticker ticker, int timeStamp, boolean success, String error) {
        this.ticker = ticker;
        this.timeStamp = timeStamp;
        this.success = success;
        this.error = error;
    }

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "ticker=" + ticker +
                ", timeStamp=" + timeStamp +
                ", success=" + success +
                ", error='" + error + '\'' +
                '}';
    }
}
