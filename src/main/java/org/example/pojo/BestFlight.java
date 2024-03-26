package org.example.pojo;

import pojo.Flights;

import java.util.ArrayList;

public class BestFlight {
    private ArrayList<pojo.Flights> flights;
    public BestFlight() {
    }
    public BestFlight(ArrayList<Flights> flights) {
        this.flights = flights;
    }

    public void setFlights(ArrayList<Flights> flights) {
        this.flights = flights;
    }

    public ArrayList<Flights> getFlights() {
        return flights;
    }

    @Override
    public String toString() {
        return "BestFlight{" +
                "flights=" + flights +
                '}';
    }
}
