package com.amdrejr.springlojabackend.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.amdrejr.springlojabackend.entities.Order;
import com.amdrejr.springlojabackend.entities.User;
import com.amdrejr.springlojabackend.entities.enums.OrderStatus;
import com.amdrejr.springlojabackend.repositories.OrderRepository;
import com.amdrejr.springlojabackend.repositories.UserRepository;

@Configuration
@Profile("test") // mesmo nome do arquivo 'application-"test".properties'
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Júlia", "999-999", "julia@mail.com", "123123");
        User u2 = new User(null, "Maria", "111-999", "maria@mail.com", "321321");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u2, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.now(), u2, OrderStatus.WAITING_PAYMENT);

        orderRepository.saveAll(Arrays.asList(o1, o2));
    }
   
}

