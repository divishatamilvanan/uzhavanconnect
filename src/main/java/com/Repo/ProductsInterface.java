package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Products;
@Repository
public interface ProductsInterface extends JpaRepository<Products,Long> {

} 