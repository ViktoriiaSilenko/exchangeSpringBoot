package io.swagger.repository;

import io.swagger.repository.entity.CommissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommissionRepository extends JpaRepository<CommissionEntity, Long> {

}
