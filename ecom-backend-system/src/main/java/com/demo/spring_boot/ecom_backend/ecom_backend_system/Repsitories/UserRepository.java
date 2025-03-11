package com.demo.spring_boot.ecom_backend.ecom_backend_system.Repsitories;



import com.demo.spring_boot.ecom_backend.ecom_backend_system.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
