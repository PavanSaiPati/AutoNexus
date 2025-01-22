package com.startup.controllers;

import com.startup.models.entities.Customer;
import com.startup.models.entities.User;
import com.startup.services.customers.CustomerService;
import com.startup.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    private final UserService userService;
    private final CustomerService customerService;

    @Autowired
    public TestController(UserService userService, CustomerService customerService) {
        this.userService = userService;
        this.customerService = customerService;
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/user/{username}")
    public User getUser(@PathVariable String username) {
        return userService.findByUsername(username).orElse(null);
    }

    @GetMapping("/customer/{username}")
    public Customer getCustomer(@PathVariable String username) {
        return customerService.findByUsername(username).orElse(null);
    }
}
