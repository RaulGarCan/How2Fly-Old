package org.example.pojo;

public class Response {
    private SearchMetadata search_metadata;
    private SearchParameters search_parameters;
    private BestFlight best_flights;
    private OtherFlight other_flights;

    public Response() {
    }

    public Response(SearchMetadata search_metadata, SearchParameters search_parameters, BestFlight best_flights, OtherFlight other_flights) {
        this.search_metadata = search_metadata;
        this.search_parameters = search_parameters;
        this.best_flights = best_flights;
        this.other_flights = other_flights;
    }

    public SearchMetadata getSearch_metadata() {
        return search_metadata;
    }

    public void setSearch_metadata(SearchMetadata search_metadata) {
        this.search_metadata = search_metadata;
    }

    public SearchParameters getSearch_parameters() {
        return search_parameters;
    }

    public void setSearch_parameters(SearchParameters search_parameters) {
        this.search_parameters = search_parameters;
    }

    public BestFlight getBest_flights() {
        return best_flights;
    }

    public void setBest_flights(BestFlight best_flights) {
        this.best_flights = best_flights;
    }

    public OtherFlight getOther_flights() {
        return other_flights;
    }

    public void setOther_flights(OtherFlight other_flights) {
        this.other_flights = other_flights;
    }

    @Override
    public String toString() {
        return "Response{" +
                "search_metadata=" + search_metadata +
                ", search_parameters=" + search_parameters +
                ", best_flights=" + best_flights +
                ", other_flights=" + other_flights +
                '}';
    }
}
