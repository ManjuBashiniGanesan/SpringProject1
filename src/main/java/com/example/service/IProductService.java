package com.example.service;

import java.util.List;

import com.example.entities.Product;

public interface IProductService {
	public List<Product> viewAllProducts();
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public Product viewProduct(int id);
	public List<Product> viewProductByCategory(String cname);
	public Product removeProduct(int pid);
}
