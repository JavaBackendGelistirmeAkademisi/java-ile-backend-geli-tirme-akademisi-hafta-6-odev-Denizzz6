package service;
import exception.OutOfException;
import model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProjectRepository;
import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;
    private Project project;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project createProject(Project project){
        this.project = project;
        if (createProject(project)==null){
            throw new OutOfException("Proje bulunamadı.");
        }
        projectRepository.save(project);
        return project;
    }

    public List<Project> getAllProject(){
        return projectRepository.findAll();
    }

}
