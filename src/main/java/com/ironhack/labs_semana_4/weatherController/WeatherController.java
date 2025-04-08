package com.ironhack.labs_semana_4.weatherController;

import com.ironhack.labs_semana_4.weatherService.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class WeatherController {

    public WeatherService weatherService;

    public WeatherController(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    //Obtener la temperatura.
    @GetMapping("/weather/temperature")
    public int currentTemperature(){
        return weatherService.currentTemperature();
    }

    //obtener la condicion climatologica
    @GetMapping("/weather/condition")
    public String getConditionClimac(){
        return weatherService.conditionClimatic();
    }

    //Nos retorna la velocidad del viento
    @GetMapping("/weather/wind")
    public int getWind(){
        return weatherService.getWindy();
    }

    @GetMapping("/weather/all")
    public Map<String, Object> getAllInfo(){
        Map<String, Object> weatherInfo = new HashMap<>();

        int temperature = weatherService.currentTemperature();
        String conditionClimact = weatherService.conditionClimatic();
        int wind = weatherService.getWindy();

        weatherInfo.put("temperature", temperature);
        weatherInfo.put("conditionClimac", conditionClimact);
        weatherInfo.put("wind", wind);
        return weatherInfo;
    }
}
