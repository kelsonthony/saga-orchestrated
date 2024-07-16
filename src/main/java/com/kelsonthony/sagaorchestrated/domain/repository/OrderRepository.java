package com.kelsonthony.sagaorchestrated.domain.repository;

import com.kelsonthony.sagaorchestrated.domain.model.Order;

import java.util.Optional;

public interface OrderRepository {
    Order save(Order order);
    Optional<Order> findById(Long id);
    void update(Order order);
}