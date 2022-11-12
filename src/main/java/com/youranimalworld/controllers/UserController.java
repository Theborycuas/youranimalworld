package com.youranimalworld.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.youranimalworld.interfaceServices.IuserService;
import com.youranimalworld.models.User;

@Controller
@RequestMapping
public class UserController {
	
	@Autowired
	private IuserService service;
	
	@GetMapping("/index")
	public String listar(Model model) {	
		List<User>users = service.listar();
		model.addAttribute("users", users);
		return "index";
	}
	
}
