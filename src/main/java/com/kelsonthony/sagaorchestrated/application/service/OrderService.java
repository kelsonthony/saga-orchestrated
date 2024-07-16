package com.kelsonthony.sagaorchestrated.application.service;

import com.kelsonthony.sagaorchestrated.application.dto.OrderDTO;
import com.kelsonthony.sagaorchestrated.domain.model.Order;
import com.kelsonthony.sagaorchestrated.domain.repository.OrderRepository;
import com.kelsonthony.sagaorchestrated.infrastructure.kafka.producer.OrderEventProducer;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    private final OrderEventProducer orderEventProducer;

    public OrderService(OrderRepository orderRepository, OrderEventProducer orderEventProducer) {
        this.orderRepository = orderRepository;
        this.orderEventProducer = orderEventProducer;
    }

    public Order createOrder(OrderDTO orderDTO) {
        Order order = new Order(null, orderDTO.getProduct(), orderDTO.getQuantity(), "CREATED");
        Order savedOrder = orderRepository.save(order);
        orderEventProducer.sendOrderEvent(savedOrder);
        return savedOrder;
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }
}