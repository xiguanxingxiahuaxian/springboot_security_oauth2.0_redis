package com.example.demo.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

/**
 * Created by lxg
 * on 2017/2/20.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String name);

}
