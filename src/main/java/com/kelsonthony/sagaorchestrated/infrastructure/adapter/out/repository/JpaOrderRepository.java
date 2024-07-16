package com.kelsonthony.sagaorchestrated.infrastructure.adapter.out.repository;

import com.kelsonthony.sagaorchestrated.domain.model.Order;
import com.kelsonthony.sagaorchestrated.domain.repository.OrderRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class JpaOrderRepository implements OrderRepository {

    private final SpringDataJpaOrderRepository springDataJpaOrderRepository;

    public JpaOrderRepository(SpringDataJpaOrderRepository springDataJpaOrderRepository) {
        this.springDataJpaOrderRepository = springDataJpaOrderRepository;
    }

    @Override
    public Order save(Order order) {
        return springDataJpaOrderRepository.save(order);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return springDataJpaOrderRepository.findById(id);
    }

    @Override
   public void update(Order order) {

    }
}

