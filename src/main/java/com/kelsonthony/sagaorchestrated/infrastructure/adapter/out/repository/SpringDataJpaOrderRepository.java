package com.kelsonthony.sagaorchestrated.infrastructure.adapter.out.repository;

import com.kelsonthony.sagaorchestrated.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaOrderRepository extends JpaRepository<Order, Long> {

    //boolean existsByEmail(String email);

}