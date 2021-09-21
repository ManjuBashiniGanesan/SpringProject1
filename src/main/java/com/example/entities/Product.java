package com.example.entities;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

public class Product {
        private String productid;
        private String productName;
        private double price;
        private String color;
        private String dimension;
        private String specification;
        private String manufacturer;
        @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private Category category;
		public String getProductid() {
			return productid;
		}
		public void setProductid(String productid) {
			this.productid = productid;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getDimension() {
			return dimension;
		}
		public void setDimension(String dimension) {
			this.dimension = dimension;
		}
		public String getSpecification() {
			return specification;
		}
		public void setSpecification(String specification) {
			this.specification = specification;
		}
		public String getManufacturer() {
			return manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
        
}