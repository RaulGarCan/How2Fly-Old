package org.example.pojo;

import pojo.Flights;

import java.util.ArrayList;

public class OtherFlight {
    private ArrayList<pojo.Flights> flights;

    public OtherFlight() {
    }

    public OtherFlight(ArrayList<Flights> flights) {
        this.flights = flights;
    }

    public ArrayList<Flights> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flights> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "OtherFlight{" +
                "flights=" + flights +
                '}';
    }
}
