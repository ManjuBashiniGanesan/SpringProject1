package com.example.entities;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String cartId;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Customer customer;
	Map products;
	public String getCartId() {
		return cartId;
		}
		public void setCartId(String cartId) {
		this.cartId = cartId;
		}
		public Customer getCustomer() {
		return customer;
		}
		public void setCustomer(Customer customer) {
		this.customer = customer;
		}
		public Map getProducts() {
		return products;
		}
		public void setProducts(Map products) {
		this.products = products;
		}
}


