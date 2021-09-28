package com.example.halloworldspring.controllers;

import com.example.halloworldspring.services.CalculateDayOfTheWeek;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloWorldSpringController {
  
@GetMapping("/hallo")
  public String HalloWorld(){
  System.out.println("I'm inside this method");
    return "Hallo World";
  }

  @GetMapping("/parameter")
  public String parameter(@RequestParam String name){
  return name + " " + ":)";
  }

  @GetMapping("/echo")
  public String input(String input){
  return input;
  }

  @GetMapping("/day")
  public String isItFriday(){
  return CalculateDayOfTheWeek.day();
  }
}
