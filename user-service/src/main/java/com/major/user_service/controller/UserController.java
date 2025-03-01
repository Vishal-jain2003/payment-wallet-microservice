package com.major.user_service.controller;

import com.major.user_service.dto.CreateUserRequest;
import com.major.user_service.service.UserService;
import com.major.user_service.utils.Utils;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    /**
     * Sign-up API

     */
      @PostMapping("/create")
      public void createUser(@RequestBody @Valid CreateUserRequest createUserRequest)
      {
            userService.create(Utils.convertUserCreateRequest(createUserRequest));
      }
}
