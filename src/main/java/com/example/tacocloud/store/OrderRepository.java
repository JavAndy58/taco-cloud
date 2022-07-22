package com.example.tacocloud.store;

import com.example.tacocloud.model.Order;

public interface OrderRepository {
    Order save(Order order);
}
