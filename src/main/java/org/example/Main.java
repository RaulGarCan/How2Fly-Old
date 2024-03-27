package org.example;

import com.google.gson.Gson;
import org.example.pojo.BestFlights;
import org.example.pojo.OtherFlights;
import org.example.pojo.Response;
import org.example.pojo.frontend.FlightDetails;

import java.io.*;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //peticionAPI();
        String json = leerJSON();
        Response response = parsearJSON(json);
        //System.out.println(response);
        ArrayList<BestFlights> bestFlights = response.getBest_flights();
        ArrayList<OtherFlights> otherFlights = response.getOther_flights();

        ArrayList<FlightDetails> flightDetails = getFrontEndDetails(bestFlights, otherFlights);
        for(FlightDetails details : flightDetails){
            System.out.println(details);
        }
    }
    public static void peticionAPI(){
        try {
            String username = "raulgarcanmyt@gmail.com";
            String password = "Raulius2";
            Authenticator auth = new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password.toCharArray());
                }
            };

            String departureId = "PEK";
            String arrivalId = "AUS";
            String departureDate = "2024-03-27";
            String engine = "google_flights";
            String currency = "EUR";
            String api_key = "cb86689dbb1f68e6363ba7c5ecf4604177d0e21cd801037bd8e35ef77a43e271";

            URL url = new URL("https://serpapi.com/search.json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //conn.setRequestMethod("GET");
            //conn.setRequestProperty("Accept", "application/json");
            conn.addRequestProperty("api_key", api_key);
            conn.addRequestProperty("engine", engine);
            conn.addRequestProperty("hl", "en");
            conn.addRequestProperty("gl", "us");
            conn.addRequestProperty("departure_id", departureId);
            conn.addRequestProperty("arrival_id", arrivalId);
            conn.addRequestProperty("outbound_date", departureDate);
            //conn.addRequestProperty("return_date", "2024-04-02");
            conn.addRequestProperty("currency", currency);
            //conn.setAuthenticator(auth);
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String output;
            String result = "";
            while ((output = br.readLine()) != null) {
                result += output;
            }
            System.out.println(result);
            guardarJSON(result);
            conn.disconnect();
        } catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }
    }
    public static void guardarJSON(String data){
        String ruta = "./src/main/java/org/example/data/data.json";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Response parsearJSON(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Response.class);
    }
    public static String leerJSON(){
        String ruta = "./src/main/java/org/example/data/example.json";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String line;
            String result = "";
            while((line=reader.readLine())!=null){
                result+=line;
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<FlightDetails> getFrontEndDetails(ArrayList<BestFlights> bestFlights, ArrayList<OtherFlights> otherFlights){
        ArrayList<FlightDetails> flightDetails = new ArrayList<>();
        for(BestFlights flights : bestFlights){
            flightDetails.add(new FlightDetails(flights));
        }
        for(OtherFlights flights : otherFlights){
            flightDetails.add(new FlightDetails(flights));
        }
        return flightDetails;
    }
}