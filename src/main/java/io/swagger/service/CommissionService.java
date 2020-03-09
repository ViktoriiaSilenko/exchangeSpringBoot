package io.swagger.service;

import io.swagger.repository.CommissionRepository;
import io.swagger.repository.entity.CommissionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommissionService {
    @Autowired
    private CommissionRepository repository;

    // TODO: repository.findAll
}
