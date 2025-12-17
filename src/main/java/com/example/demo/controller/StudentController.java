package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.
@RestController
public class StudentController {
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){

    }
}