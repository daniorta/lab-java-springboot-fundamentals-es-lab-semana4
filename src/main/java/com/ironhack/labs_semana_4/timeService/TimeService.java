package com.ironhack.labs_semana_4.timeService;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class TimeService {

    //Obtener la hora actual
    public String getTime(){
        try{
            LocalTime currentTme = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

            return currentTme.format(formatter);

        }catch (Exception e){
            System.err.println("Error al obtener la fecha " + e.getMessage());
            return "error al obtener la fecha";
        }

    }

    //Obtener la fecha actual
    public String getDate(){
        try {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return currentDate.format(formatter);

        }catch (Exception e){
            System.out.println("Error al obtener la fecha: " + e.getMessage());
            return "Error al obtener la fecha";
        }
    }

    //Obtener el día actual de la semana.
    public String getDay(){
        try {

            LocalDate currentDay = LocalDate.now();
            DayOfWeek dayOfWeek = currentDay.getDayOfWeek();
            return dayOfWeek.toString();//toString(): Convierte el DayOfWeek a su forma textual, por ejemplo, "MONDAY", "TUESDAY", etc

        }catch (Exception e){
            System.out.println("Error al obtener el dia actual de la semana." + e.getMessage());
            return "Error al obtener el dia actual de la semana.";
        }
    }


}
