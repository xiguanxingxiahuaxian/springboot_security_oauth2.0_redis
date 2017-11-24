package com.example.demo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserRoleRepository;
import com.example.demo.service.UserRoleService;

import java.util.List;

/**

 * on 2017/2/21.
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    public UserRoleRepository userRoleRepository;
    @Override
    public List<String> findRoles(int uid) {

        List<String> list = userRoleRepository.findRoleName(uid);

        return list;
    }
}
