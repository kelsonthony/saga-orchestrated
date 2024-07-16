package com.kelsonthony.sagaorchestrated.infrastructure.kafka.consumer;

import com.kelsonthony.sagaorchestrated.domain.model.Order;
import com.kelsonthony.sagaorchestrated.domain.repository.OrderRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderEventConsumer {

    private final OrderRepository orderRepository;

    public OrderEventConsumer(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @KafkaListener(topics = "orders", groupId = "order_group")
    public void consumeOrderEvent(Order order) {
        // Processar a ordem (por exemplo, atualizar o status)
        order.setStatus("PROCESSED");
        orderRepository.update(order);
    }
}