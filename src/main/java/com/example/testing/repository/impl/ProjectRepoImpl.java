package com.example.testing.repository.impl;

import com.example.testing.config.HiberConfig;
import com.example.testing.model.Employee;
import com.example.testing.model.Position;
import com.example.testing.model.Project;
import com.example.testing.repository.ProjectRepo;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjectRepoImpl implements ProjectRepo {

    Transaction transaction = null;

    Session session = HiberConfig.getSessionFactory().openSession();

    @Override
    public Project addProject(Project project) {
        transaction = session.beginTransaction();
        session.refresh(project);
        transaction.commit();
        return project;
    }

    @Override
    public Project updateProject(Project project) {
        transaction = session.beginTransaction();
        session.refresh(project);
        transaction.commit();
        return project;
    }

    @Override
    public void deleteProject(Project project) {
        transaction = session.beginTransaction();
        session.delete(project);
        transaction.commit();

    }

    @Override
    public Project findById(Long id) {
        Project project = session.get(Project.class, new Long(id));
        return project;
    }
}
