package com.youranimalworld.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.youranimalworld.models.User;

@Repository
public interface IUser extends CrudRepository<User, Integer> {

}
