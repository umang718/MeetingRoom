package com.meetingroom.repository;
import com.meetingroom.model.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRespository extends CrudRepository<User,Integer>
{

}
