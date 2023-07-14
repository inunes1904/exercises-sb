package com.ivonunes.exercisessb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

  @GetMapping("/sum")
  public int getSum(@RequestParam int value1, @RequestParam  int value2){
    return value1+value2;
  }

  @GetMapping("/sub/{value1}/{value2}")
  public int getSub(@PathVariable int value1, @PathVariable int value2){
    return value1-value2;
  }
}
