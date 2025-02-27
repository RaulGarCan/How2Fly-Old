package org.example.pojo;

public class Airport {
    private String name;
    private String id;
    private String time;

    public Airport() {
    }

    public Airport(String name, String id, String time) {
        this.name = name;
        this.id = id;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
