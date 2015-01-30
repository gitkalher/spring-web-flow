package com.binarybalkara.mycart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.binarybalkara.mycart.service.CartService;

@Controller
public class CartController {

	private CartService cartService;
	
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping("/home.xhtml")
	public ModelMap doHome() {
		ModelMap model = new ModelMap();
		model.addAttribute("shoppingCart", cartService.getShoppingCart());
		model.addAttribute("products", cartService.getProducts());
		return model;
	}
}
