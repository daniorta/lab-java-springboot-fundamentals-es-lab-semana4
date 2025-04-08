package com.ironhack.labs_semana_4.weatherService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    //Nos da una temperatura aleatoria
    public int currentTemperature(){
        try {
        int min = -10;
        int max = 40;
        int tem = (int) ( min + Math.random() * (max - min));

        System.out.println("Tenemos una temperatura de " + tem);
        return tem;

        }catch (Exception e){
            System.err.println("Error de temperatura. " + e.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    //Obtenemos aleatoriamente una condicion climatologica
    public String conditionClimatic() {
        try {
        List<String> conditionClimatic = new ArrayList<>();

        conditionClimatic.add("Sunny");
        conditionClimatic.add("Rainy");
        conditionClimatic.add("Cloudy");
        conditionClimatic.add("Windy");

        int size = conditionClimatic.size();
        int randonIndex = (int) (Math.random() * size);

        return conditionClimatic.get(randonIndex) ;

        }catch (Exception e){
            System.err.println("Error de condiciones meteorologicas. " + e.getMessage());
            return "Error de condiciones meteorologicas." ;
        }
    }

    public int getWindy(){
        try {
        int velMin = 0;
        int velMax = 100;
        return (int) (velMin + Math.random() * (velMax - velMin));

        }catch (Exception e){
            System.err.println("Error al medir velocidad del viento");
            return Integer.MIN_VALUE;
        }
    }


}
