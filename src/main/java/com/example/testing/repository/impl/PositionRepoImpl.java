package com.example.testing.repository.impl;

import com.example.testing.config.HiberConfig;
import com.example.testing.model.Position;
import com.example.testing.model.Project;
import com.example.testing.repository.PositionRepo;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PositionRepoImpl implements PositionRepo {

    Transaction transaction = null;

    Session session = HiberConfig.getSessionFactory().openSession();

    @Override
    public Position addPosition(Position position) {
        transaction = session.beginTransaction();
        session.save(position);
        transaction.commit();
        return position;
    }

    @Override
    public Position updatePosition(Position position) {
        transaction = session.beginTransaction();
        session.refresh(position);
        transaction.commit();
        return position;
    }

    @Override
    public void deletePosition(Position position) {
        transaction = session.beginTransaction();
        session.delete(position);
        transaction.commit();
    }

    @Override
    public Position findById(Long id) {
        Position position = session.get(Position.class, new Long(id));
        return position;
    }
}
