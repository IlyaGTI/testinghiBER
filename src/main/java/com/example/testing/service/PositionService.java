package com.example.testing.service;

import com.example.testing.model.Position;
import com.example.testing.model.Project;

public interface PositionService {

    Position createPosition(Position position);

    Position updatePosition(Position position);

    void deletePosition(Long id);
}
