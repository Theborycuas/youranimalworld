package com.youranimalworld.interfaceServices;


import java.util.List;
import java.util.Optional;

import com.youranimalworld.models.User;

public interface IuserService {
	public List<User>listar();
	public Optional<User>listarId(int id);
	public int save(User u);
	public void delete(int id);
}
 