package com.major.user_service.service;

import com.major.user_service.dao.UserRepository;
import com.major.user_service.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username);
    }


    public void create(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setAuthorities("usr");
        userRepository.save(user);

//        JSONObject jsonObject = new JSONObject();

    }
}
