package com.example.flightfx;

public class DataModelR {
    String Time,Aircraft,Airline;

    public DataModelR(String time, String aircraft, String airline) {
        this.Time = time;
        this.Aircraft = aircraft;
        this.Airline = airline;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        Time = Time;
    }

    public String getAircraft() {
        return Aircraft;
    }

    public void setAircraft(String Aircraft) {
        Aircraft = Aircraft;
    }

    public String getAirline() {
        return Airline;
    }

    public void setAirline(String airline) {
        Airline = Airline;
    }
}