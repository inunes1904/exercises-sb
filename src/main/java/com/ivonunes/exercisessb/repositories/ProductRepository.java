package com.ivonunes.exercisessb.repositories;
import com.ivonunes.exercisessb.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

  public Iterable<Product> findByNameContainingIgnoreCase(String partOfName);
}
