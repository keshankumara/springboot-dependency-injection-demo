package com.ruhuna.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreRestController {

  /*
    // this is hardway

    CricketCoach Sangakkara = new CricketCoach();

    @GetMapping("/getDailyWorkout")
    ResponseEntity<String> getDailyWorkOut(){

        String workout = sangakkara.getDailyWorkout();

        return new ResponseEntity<>(workout, HttpStatusCode.valueOf(200));
   */


    /* this is called constructor based dependency injection
    when constructer asked for type of coach object it is retrieving that object from
    Spring container
    Springcontainer have all the object which are annotated with @component */

    private ICoach coach;

    @Autowired
    /*public CoreRestController(@Qualifier("basketBallCoach")ICoach coach){
        this.coach = coach;
    } */

    public CoreRestController(@Qualifier("basketBallCoach")ICoach coach){
        this.coach = coach;
    }

    @GetMapping("/getDailyWorkout")
    ResponseEntity<String> getDailyWorkOut(){

        String workout = coach.getDailyWorkout();
        return new ResponseEntity<>(workout, HttpStatusCode.valueOf(200));

    }

}
