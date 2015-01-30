package com.binarybalkara.mycart.service;

import java.util.List;

import com.binarybalkara.mycart.dao.Product;
import com.binarybalkara.mycart.dao.ShoppingCart;

public interface CartService {
	
	ShoppingCart getShoppingCart();
	
	List<Product> getProducts();
	
	List<Product> getRecommendations();
	
	Product getProduct(long productId);
	
	List<String> getShippingOptions();
	
	void submitOrderForPayment();
}
