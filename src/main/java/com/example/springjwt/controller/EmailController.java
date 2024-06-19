//package com.example.springjwt.controller;
//
//import data.service.EmailService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//@ResponseBody
//public class EmailController {
//
//    private final EmailService emailService;
//
//    @PostMapping("/emailConfirm")
//    public String mailConfirm(@RequestBody JoinRequest joinRequest) {
//        int num = emailService.sendEmail(joinRequest.getID());
//
//        return "코드 발급" + num;
//    }
//}
