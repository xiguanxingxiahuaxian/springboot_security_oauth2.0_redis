
package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;



/**
 * Created by lxg
 * on 2017/2/21.
 */
public interface UserService {

    User findByUsername(String name);

    List<User> findAll();

}
