package com.example.testing.service;

import com.example.testing.model.Employee;
import com.example.testing.model.Project;

public interface ProjectService {

    Project createProject(Project project);

    Project updateProject(Project project);

    void deleteProject(Long id);
}
