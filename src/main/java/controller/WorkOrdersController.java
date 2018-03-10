package controller;

import domain.Project;
import domain.WorkOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.WorkOrderService;

@Controller
public class WorkOrdersController {

    @Autowired
    private WorkOrderService workOrderService;

    @RequestMapping("toAdd")
    public String toAddWorkOrder(Integer projectId, Model model) {
        model.addAttribute("projectId", projectId);
        return "add";
    }

    @RequestMapping("add")
    public String addWorkOrder(String executor, String description, String orderLevel, String projectId) {
        WorkOrder workOrder = new WorkOrder();
        workOrder.setExecutor(executor);
        workOrder.setDescription(description);
        workOrder.setOrderLevel(Byte.parseByte(orderLevel));
        Project project = new Project();
        project.setId(Long.parseLong(projectId));
        workOrder.setProject(project);

        workOrderService.saveWorkOrder(workOrder);

        return "redirect:listWorkOrders";
    }

    @RequestMapping("listWorkOrders")
    public String listWorkOrders(Model model) {
        model.addAttribute("workOrders", workOrderService.listWorkOrders());
        return "list";
    }
}
