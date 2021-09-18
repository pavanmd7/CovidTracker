package com.test.repository;

import com.test.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRespository extends JpaRepository<Admin,Long> {
}
