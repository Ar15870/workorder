package domain;

import java.io.Serializable;
import java.sql.Date;

public class WorkOrder implements Serializable{

    private Long id;
    private Project project;
    private String executor;
    private String description;
    private Byte orderLevel;
    private java.sql.Date createDate;

    public WorkOrder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getOrderLevel() {
        return orderLevel;
    }

    public void setOrderLevel(Byte orderLevel) {
        this.orderLevel = orderLevel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "WorkOrder{" +
                "id=" + id +
                ", project=" + project +
                ", executor='" + executor + '\'' +
                ", description='" + description + '\'' +
                ", orderLevel=" + orderLevel +
                ", createDate=" + createDate +
                '}';
    }
}
