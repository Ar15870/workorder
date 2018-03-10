package service.impl;

import domain.WorkOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.WorkOrderRepository;
import service.WorkOrderService;

import java.util.List;

@Service
@Transactional
public class WorkOrderServiceImpl implements WorkOrderService {

    @Autowired
    private WorkOrderRepository workOrderRepository;

    @Override
    public void saveWorkOrder(WorkOrder workOrder) {
        workOrderRepository.saveWorkOrder(workOrder);
    }

    @Override
    public List<WorkOrder> listWorkOrders() {
        return workOrderRepository.listWorkOrders();
    }
}
