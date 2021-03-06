package com.example.security.service;

import com.example.security.entity.Role;
import com.example.security.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by 程江涛 on 2019/4/13.
 */

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Page<Role> getRoles(String name, Pageable pageRequest) {
        return roleRepository.findByName(name, pageRequest);
    }
}
