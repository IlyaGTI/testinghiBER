package com.example.testing.service.impl;

import com.example.testing.model.Project;
import com.example.testing.repository.ProjectRepo;
import com.example.testing.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private final ProjectRepo projectRepo;

    public ProjectServiceImpl(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    @Override
    public Project createProject(Project project) {
        return projectRepo.addProject(project);
    }

    @Override
    public Project updateProject(Project project) {
        return projectRepo.updateProject(project);
    }

    @Override
    public void deleteProject(Long id) {
        Project project = projectRepo.findById(id);
        projectRepo.deleteProject(project);

    }
}
