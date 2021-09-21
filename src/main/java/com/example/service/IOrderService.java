package com.example.service;

import java.time.LocalDate;
import java.util.List;

import com.example.entities.Order;

public interface IOrderService {
     public Order addOrder(Order order);
     public Order updateOrder(Order order);
     public Order removeOrder(Order order);
     public Order viewOrder(Order order);
     public List<Order> viewAllOrders(LocalDate date);
     public List<Order> viewAllOrdersByLocation(String loc);
     public List<Order> viewAllOrdersByUserId(String userid);
}
