package com.test.service;

import com.test.entity.Admin;
import com.test.repository.AdminRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminRespository adminRespository;

    @Override
    public Admin registerAdmin(Admin admin) {
        return this.adminRespository.save(admin);
    }
}
