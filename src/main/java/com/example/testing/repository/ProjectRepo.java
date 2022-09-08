package com.example.testing.repository;

import com.example.testing.model.Position;
import com.example.testing.model.Project;

public interface ProjectRepo {

    Project addProject(Project project);

    Project updateProject(Project project);

    void deleteProject(Project project);

    Project findById(Long id);
}
