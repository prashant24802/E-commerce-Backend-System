package com.demo.spring_boot.ecom_backend.ecom_backend_system.Repsitories;



import com.demo.spring_boot.ecom_backend.ecom_backend_system.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
