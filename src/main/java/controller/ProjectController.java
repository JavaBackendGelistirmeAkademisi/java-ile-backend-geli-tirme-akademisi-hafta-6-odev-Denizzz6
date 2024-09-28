package controller;
import model.Project;
import model.request.ProjectRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.ProjectService;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService){
        this.projectService=projectService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Project createProject(@Valid @RequestBody ProjectRequestDTO projectRequestDTO){
        Project project=new Project();
        project.setName(projectRequestDTO.getName());
        project.setNote(projectRequestDTO.getNote());
        return projectService.createProject(project);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public List<Project> getAllProject(){
        return projectService.getAllProject();
    }

}
