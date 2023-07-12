package com.ivonunes.exercisessb.controllers;

import com.ivonunes.exercisessb.models.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/clients")
public class ClientController {

  @GetMapping(path="/test")
  public Client getClient(){
    return new Client(1,"Ivo","111111111");
  }
}
