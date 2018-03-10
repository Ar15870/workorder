package controller;

import domain.Project;
import domain.WorkOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ProjectService;
import service.WorkOrderService;

@Controller
public class ProjectsController {

    @Autowired
    private ProjectService projectService;



    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute(
                "projects",
                projectService.listProjects());
        return "home";
    }


}
