package me.christ9979.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User currentUser() {
        User user = new User();
        user.setAge(27);
        user.setHeight(183);
        user.setName("JYC");

        return user;
    }
}
