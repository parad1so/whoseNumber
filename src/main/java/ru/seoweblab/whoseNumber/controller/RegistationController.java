package ru.seoweblab.whoseNumber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.seoweblab.whoseNumber.domain.Role;
import ru.seoweblab.whoseNumber.domain.User;
import ru.seoweblab.whoseNumber.repos.UserRepo;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistationController {
    @Autowired
    private UserRepo userRepo;
    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user,  Map<String, Object> model){
        User userFromDb = userRepo.findByUsername(user.getUsername());

        if(userFromDb != null) {
            model.put("message", "User exist");
            return "registration";
        }

        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);

        return "redirect:/login";
    }
}
