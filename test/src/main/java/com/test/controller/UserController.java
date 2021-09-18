package com.test.controller;

import com.test.entity.Risk;
import com.test.entity.SelfAssessment;
import com.test.entity.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@Valid @RequestBody User user){
        User registerdUser = this.userService.addUser(user);
        return new ResponseEntity<User>(registerdUser,HttpStatus.CREATED);
    }

    @PostMapping("/register/admin")
    public ResponseEntity<User> registerAdmin(@Valid @RequestBody User user){
        User registerdUser = this.userService.addUser(user);
        return new ResponseEntity<User>(registerdUser,HttpStatus.CREATED);
    }

    @PostMapping("/assessment")
    public Risk getSelfAssesmentResult(@RequestBody SelfAssessment selfAssessment){
        return this.userService.getResult(selfAssessment);
    }

//    @PostMapping("/admin/register")
//    public Risk (@RequestBody SelfAssessment selfAssessment){
//        return this.userService.getResult(selfAssessment);
//    }





}
