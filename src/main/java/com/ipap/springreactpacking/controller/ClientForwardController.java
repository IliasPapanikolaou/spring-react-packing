//package com.ipap.springreactpacking.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class ClientForwardController {
//
//    // Special mapping for the frontend to talk to backend
//    // process everything except things that start with . dot
//    @GetMapping(value = "/**/{path:[^\\.]*}")
//    public String forward() {
//        return "forward:/";
//    }
//}
