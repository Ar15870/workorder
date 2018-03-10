package service;

import domain.WorkOrder;

import java.util.List;

public interface WorkOrderService {

    void saveWorkOrder(WorkOrder workOrder);
    List<WorkOrder> listWorkOrders();

}
