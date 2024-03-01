package com.teachmeskills.lesson16.fabric;

import com.teachmeskills.lesson16.entity.Order;

import java.util.ArrayList;

public class OrderFabric {
    public static ArrayList<Order> fillOrdersFirst() {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(11.1, "Order1"));
        orders.add(new Order(14.4, "Order2"));
        orders.add(new Order(15.9, "Order3"));
        return orders;
    }

    public static ArrayList<Order> fillOrdersSecond() {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(21.7, "Order1"));
        orders.add(new Order(24.2, "Order2"));
        orders.add(new Order(25.5, "Order3"));
        return orders;
    }

    public static ArrayList<Order> fillOrdersThird() {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(31.3, "Order1"));
        orders.add(new Order(34.6, "Order2"));
        orders.add(new Order(35.8, "Order3"));
        return orders;
    }
}
