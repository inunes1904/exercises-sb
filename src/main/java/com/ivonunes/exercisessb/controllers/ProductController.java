package com.ivonunes.exercisessb.controllers;

import javax.transaction.Status;
import javax.validation.Valid;
import com.ivonunes.exercisessb.models.Product;
import com.ivonunes.exercisessb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.Optional;


@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT})
  public Product newOrChangeProduct( @Valid @RequestBody Product p ){
    return productRepository.save(p);
  }

  @GetMapping
  public Iterable<Product> getProducts(){
    return productRepository.findAll();
  }

  @GetMapping("/name/{partOfName}")
  public Iterable<Product> getProductsContainingName(@PathVariable String partOfName){
    return productRepository.findByNameContainingIgnoreCase(partOfName);
  }

  @GetMapping(path="/pages/{page}/{qtd}")
  public Iterable<Product> getProductsPaginate(@PathVariable int page, @PathVariable int qtd){
    if (qtd > 10) qtd = 10;
    Pageable p = PageRequest.of(page, qtd);
    return productRepository.findAll(p);
  }

  @GetMapping(path="/{id}")
  public Optional<Product> getProduct(@PathVariable Long id){
    return productRepository.findById(id);
  }

  @DeleteMapping(path="/{id}")
  public void deleteProduct(@PathVariable Long id){
    productRepository.deleteById(id);
  }



}
