package com.marlina.webstore.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marlina.webstore.domain.Product;

@Controller
public class ProductController {

	@RequestMapping("/product")
	public String list(Model model) {
		Product iphone = new Product("p0001", "iPhone 5s", new BigDecimal(500));
		iphone.setCategory("smart phone");
		iphone.setManufacturer("Apple");
		iphone.setUnitInStock(1000);

		model.addAttribute("product", iphone);
		return "products";
	}
}
