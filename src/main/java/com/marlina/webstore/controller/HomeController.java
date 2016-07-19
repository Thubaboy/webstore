package com.marlina.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "welcome to webstore");
		model.addAttribute("tagline", "The One and only amazing web store");
		return "welcome";
	}
}
