package com.ivonunes.exercisessb.controllers;

import com.ivonunes.exercisessb.entities.Client;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/clients")
public class ClientController {

  @GetMapping(path="/test")
  public Client getClient(){
    return new Client(1,"Ivo","111111111");
  }

  @GetMapping("/{id}")
  public Client getClientById(@PathVariable int id){
    return new Client(id, "Pedro", "222222222");
  }
  @GetMapping
  public Client getClientById2(@RequestParam int id){
    return new Client(id, "Pedro", "222222222");
  }
}
