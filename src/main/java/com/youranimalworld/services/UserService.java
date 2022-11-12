package com.youranimalworld.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youranimalworld.interfaceServices.IuserService;
import com.youranimalworld.interfaces.IUser;
import com.youranimalworld.models.User;

@Service
public class UserService implements IuserService {
	
	@Autowired
	private IUser dataIUser;
	
	@Override
	public List<User> listar() {
		// TODO Auto-generated method stub
		return (List<User>)dataIUser.findAll();
	}
	

	@Override
	public Optional<User> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(User u) {
		// TODO Auto-generated method stub
		int res = 0;
		User user = dataIUser.save(u);
		if (!user.equals(null)) {
			
			res=1;
			
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
