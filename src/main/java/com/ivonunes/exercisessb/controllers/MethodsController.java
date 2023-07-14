package com.ivonunes.exercisessb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/method")
public class MethodsController {

  @GetMapping
  public String get(){
    return "Request get";
  }
  @PostMapping
  public String post(){
    return "Request post";
  }
  @PutMapping
  public String put(){
    return "Request put";
  }
  @PatchMapping
  public String patch(){
    return "Request patch";
  }
  @DeleteMapping
  public String delete(){
    return "Request delete";
  }
}
