package com.ivonunes.exercisessb.repositories;
import com.ivonunes.exercisessb.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {


}
