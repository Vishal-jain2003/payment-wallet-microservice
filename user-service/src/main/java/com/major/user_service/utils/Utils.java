package com.major.user_service.utils;

import com.major.user_service.dto.CreateUserRequest;
import com.major.user_service.models.User;

public class Utils {

    public static User convertUserCreateRequest(CreateUserRequest createUserRequest){
        return User.builder()
                .username(createUserRequest.getMobileNumber())
                .password(createUserRequest.getPassword())
                .name(createUserRequest.getName())
                .email(createUserRequest.getEmail())
                .age(createUserRequest.getAge()).build();


    }



}
