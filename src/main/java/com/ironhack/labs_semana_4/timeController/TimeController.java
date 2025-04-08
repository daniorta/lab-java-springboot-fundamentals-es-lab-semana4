package com.ironhack.labs_semana_4.timeController;

import com.ironhack.labs_semana_4.timeService.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController

public class TimeController {

    public TimeService timeService;

    public TimeController(TimeService timeService){
        this.timeService = timeService;
    }

    // /time → Retorna la hora actual.
    @GetMapping("/time")
    public String getTyme(){
        return timeService.getTime();
    }

    // /date → Retorna la fecha actual.
    @GetMapping("/date")
    public String getDate(){
        return timeService.getDate();
    }

    //day → Retorna el día actual de la semana.
    @GetMapping("/day")
    public String getDay(){
        return timeService.getDay();
    }

//Obtener toda la informacion de temporal;/all → Retorna toda la información temporal en una sola respuesta.
    @GetMapping("/all")
    public Map<String, Object> getAllDate() {
        Map<String, Object> allDate = new HashMap<>();
        String time = timeService.getTime();
        String date = timeService.getDate();
        String day = timeService.getDay();

        allDate.put("time", time);
        allDate.put("date", date);
        allDate.put("day", day);

        return allDate;
    }

}
