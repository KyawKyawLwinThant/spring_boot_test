/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kyawkyawlwin
 */
@RestController
public class WelcomeController {
    @GetMapping("/")
    public String welcome(){
        return "welcome spring controller";
    }
}
