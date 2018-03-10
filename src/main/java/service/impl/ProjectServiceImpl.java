package service.impl;
import domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.ProjectRepository;
import service.ProjectService;

import java.util.List;
@Service //Component
@Transactional
public class ProjectServiceImpl
        implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> listProjects() {
        return projectRepository.listProjects();
    }
}
