package com.ivonunes.exercisessb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

  @RequestMapping(method = RequestMethod.GET, path="/hello")
  public String Hello(){
    return "Hello Spring";
  }
}
