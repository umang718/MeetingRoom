package com.meetingroom.Services;


import com.meetingroom.model.User;
import com.meetingroom.repository.UserRespository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class UserServices 
{
    private final UserRespository userRespository;
    public UserServices(UserRespository userRespository)
    {
        this.userRespository=userRespository;
    }
    public void SaveMyUser(User user)
    {
        userRespository.save(user);
    }


}
