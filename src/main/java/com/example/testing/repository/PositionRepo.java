package com.example.testing.repository;

import com.example.testing.model.Position;

public interface PositionRepo {

    Position addPosition(Position position);

    Position updatePosition(Position position);

    void deletePosition(Position position);

    Position findById(Long id);

}
