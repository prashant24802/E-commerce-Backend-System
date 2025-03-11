package com.demo.spring_boot.ecom_backend.ecom_backend_system.Services;



import com.demo.spring_boot.ecom_backend.ecom_backend_system.Entities.User;
import com.demo.spring_boot.ecom_backend.ecom_backend_system.Repsitories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
