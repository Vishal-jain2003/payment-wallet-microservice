package com.major.user_service.dao;

import com.major.user_service.models.User;
import org.springframework.data.repository.CrudRepository;

//dao (Data Access Object)
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String phone);
}
