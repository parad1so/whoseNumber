package ru.seoweblab.whoseNumber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.seoweblab.whoseNumber.domain.Message;
import ru.seoweblab.whoseNumber.domain.User;
import ru.seoweblab.whoseNumber.repos.MessageRepo;


import java.math.BigInteger;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private MessageRepo messageRepo;


    @GetMapping("/")
    public String main(@RequestParam (required = false) BigInteger filter, Model model){
        Iterable<Message> messages =  messageRepo.findAll();

        if(filter != null){
            messages = messageRepo.findByPhoneNumber(filter);
        }
        else {
            messages = messageRepo.findAll();
        }

        model.addAttribute("messages", messages);
        model.addAttribute("filter", filter);

        return "main";
    }

    @PostMapping("/")
    public String add(
            @AuthenticationPrincipal User user,
            @RequestParam String text,
            @RequestParam BigInteger phoneNumber,
            Map<String, Object> model){
        Message message = new Message(text, phoneNumber, user);


        messageRepo.save(message);

        Iterable<Message> messages =  messageRepo.findAll();

        model.put("messages", messages);

        return "main";
    }



}