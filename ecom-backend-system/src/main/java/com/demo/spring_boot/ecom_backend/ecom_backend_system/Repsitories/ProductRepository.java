package com.demo.spring_boot.ecom_backend.ecom_backend_system.Repsitories;



import com.demo.spring_boot.ecom_backend.ecom_backend_system.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
