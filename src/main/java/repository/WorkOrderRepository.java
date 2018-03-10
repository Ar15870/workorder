package repository;

import domain.WorkOrder;

import java.util.List;

public interface WorkOrderRepository {

    void saveWorkOrder(WorkOrder workOrder);
    List<WorkOrder> listWorkOrders();

}
