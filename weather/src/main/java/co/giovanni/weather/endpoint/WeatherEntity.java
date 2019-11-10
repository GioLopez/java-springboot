package co.giovanni.weather.endpoint;


public class WeatherEntity {

    private String location;
    private double temperature;

    public WeatherEntity(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String getLocation() {
        return location;
    }

    public double getTemperature() {
        return temperature;
    }
}
