package de.tub.av.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.tub.av.models.User;
import de.tub.av.repos.UserRepository;

import java.util.Optional;

@RestController
public class HelloController {

    private UserRepository userRepository;

    @Autowired
    public HelloController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public ResponseEntity<?> answerAndRegister(@RequestParam(value = "user", defaultValue = "AnwSys Student") String username) {
        Optional<User> foundUser = userRepository.findByName(username);

        if (foundUser.isPresent()) {
            return ResponseEntity.ok(String.format("Welcome back, %s. How are your studies going?", foundUser.get().getName()));
        } else {
            User u = new User(username);
            userRepository.save(u);
            return ResponseEntity.ok(String.format("Welcome new User %s!", u.getName()));
        }
    }
}