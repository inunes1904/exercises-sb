package com.ivonunes.exercisessb.controllers;

import com.ivonunes.exercisessb.models.Product;
import com.ivonunes.exercisessb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @PostMapping(path="/new")
  public @ResponseBody Product newProduct( @Valid Product p ){
    return productRepository.save(p);
  }


}
