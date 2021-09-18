package com.test.service;

import com.test.entity.Risk;
import com.test.entity.SelfAssessment;
import com.test.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User addUser(User user);

    public Risk getResult(SelfAssessment selfAssessment);
}
