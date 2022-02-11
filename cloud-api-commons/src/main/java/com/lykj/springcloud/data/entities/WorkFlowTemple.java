package com.lykj.springcloud.data.entities;

public class WorkFlowTemple {
    private Integer id;

    private String taskGroup;

    private String name;

    private String taskOrder;

    private String taskTotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskGroup() {
        return taskGroup;
    }

    public void setTaskGroup(String taskGroup) {
        this.taskGroup = taskGroup == null ? null : taskGroup.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTaskOrder() {
        return taskOrder;
    }

    public void setTaskOrder(String taskOrder) {
        this.taskOrder = taskOrder == null ? null : taskOrder.trim();
    }

    public String getTaskTotal() {
        return taskTotal;
    }

    public void setTaskTotal(String taskTotal) {
        this.taskTotal = taskTotal == null ? null : taskTotal.trim();
    }
}