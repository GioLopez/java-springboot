package co.giovanni.weather.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/boundary/weather")
public class WeatherBoundary {

    @Autowired
    @Qualifier("weatherControl")
    private  WeatherService weatherservice;

    @GetMapping
    public WeatherEntity get(@RequestParam String location){
        return weatherservice.getWeather(location);
//        return new WeatherEntity(location, 12.5);
    }


}
