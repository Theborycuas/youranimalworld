package com.youranimalworld.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/add-user")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		return "users/create";
	}
	
	@PostMapping("/save")
	public String save(@Valid User user, Model model) {
		service.save(user);
		return "redirect:/index";
		
	}
	
}
