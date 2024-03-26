package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RapidAPI {
    public static void main(String[] args) {
        String originAirport;
        String destinationAirport;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://sky-scrapper.p.rapidapi.com/api/v2/flights/searchFlights?originSkyId=LOND&destinationSkyId=NYCA&originEntityId=27544008&destinationEntityId=27537542&date=%3CREQUIRED%3E&adults=1&currency=USD&market=en-US&countryCode=US"))
                .header("X-RapidAPI-Key", "d35b7f590bmsh1e7831b971b2199p11b091jsn474356c9150f")
                .header("X-RapidAPI-Host", "sky-scrapper.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(response.body());
    }
}
