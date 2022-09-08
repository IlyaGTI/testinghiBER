package com.example.testing.service.impl;

import com.example.testing.model.Position;
import com.example.testing.repository.PositionRepo;
import com.example.testing.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;

public class PositionServiceImpl implements PositionService {
    @Autowired
    private final PositionRepo positionRepo;

    public PositionServiceImpl(PositionRepo positionRepo) {
        this.positionRepo = positionRepo;
    }

    @Override
    public Position createPosition(Position position) {
        return positionRepo.addPosition(position);
    }

    @Override
    public Position updatePosition(Position position) {
        return positionRepo.updatePosition(position);
    }

    @Override
    public void deletePosition(Long id) {
        Position position = positionRepo.findById(id);
        positionRepo.deletePosition(position);
    }
}
