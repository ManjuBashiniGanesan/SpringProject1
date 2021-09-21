package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    String catId;
    String categoryName;
		public String getCatId() {
		return catId;
		}
		public void setCatId(String catId) {
		this.catId = catId;
		}
		public String getCategoryName() {
		return categoryName;
		}
		public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
		}
}
