package com.test.service;

import com.test.entity.Risk;
import com.test.entity.SelfAssessment;
import com.test.entity.User;
import com.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return  this.userRepository.save(user);
    }

    @Override
    public Risk getResult(SelfAssessment selfAssessment) {

        if (!selfAssessment.getSymptoms().isEmpty()){
            if(selfAssessment.isConactHistory() || selfAssessment.isTravelHistory()){
                Risk risk = new Risk(50);
                return risk;
            }
        }

        if(selfAssessment.getSymptoms().size()<=2 && selfAssessment.getSymptoms().size()>0){
            if(selfAssessment.isTravelHistory() || selfAssessment.isConactHistory()){
                Risk risk = new Risk(75);
                return risk;
            }
        }

        if(selfAssessment.getSymptoms().size()>2){
            if(selfAssessment.isTravelHistory()|| selfAssessment.isConactHistory()){
                Risk risk = new Risk(95);
                return risk;
            }
        }

        return new Risk(5);
    }
}
