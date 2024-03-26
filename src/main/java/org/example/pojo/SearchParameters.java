package org.example.pojo;

public class SearchParameters {
    private String engine;
    private String hl;
    private String gl;
    private String departure_id;
    private String arrival_id;
    private String outbound_data;
    private String return_date;
    private String currency;

    public SearchParameters() {
    }

    public SearchParameters(String engine, String hl, String gl, String departure_id, String arrival_id, String outbound_data, String return_date, String currency) {
        this.engine = engine;
        this.hl = hl;
        this.gl = gl;
        this.departure_id = departure_id;
        this.arrival_id = arrival_id;
        this.outbound_data = outbound_data;
        this.return_date = return_date;
        this.currency = currency;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getHl() {
        return hl;
    }

    public void setHl(String hl) {
        this.hl = hl;
    }

    public String getGl() {
        return gl;
    }

    public void setGl(String gl) {
        this.gl = gl;
    }

    public String getDeparture_id() {
        return departure_id;
    }

    public void setDeparture_id(String departure_id) {
        this.departure_id = departure_id;
    }

    public String getArrival_id() {
        return arrival_id;
    }

    public void setArrival_id(String arrival_id) {
        this.arrival_id = arrival_id;
    }

    public String getOutbound_data() {
        return outbound_data;
    }

    public void setOutbound_data(String outbound_data) {
        this.outbound_data = outbound_data;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "SearchParameters{" +
                "engine='" + engine + '\'' +
                ", hl='" + hl + '\'' +
                ", gl='" + gl + '\'' +
                ", departure_id='" + departure_id + '\'' +
                ", arrival_id='" + arrival_id + '\'' +
                ", outbound_data='" + outbound_data + '\'' +
                ", return_date='" + return_date + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}