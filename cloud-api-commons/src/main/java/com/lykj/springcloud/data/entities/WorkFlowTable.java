package com.lykj.springcloud.data.entities;

public class WorkFlowTable {
    private Integer id;

    private Integer templeId;

    private Integer createrId;

    private String nodeState;

    private Integer nodeTime;

    private String createTime;

    private String nodeNow;

    private String state;

    private String taskTableGroup;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTempleId() {
        return templeId;
    }

    public void setTempleId(Integer templeId) {
        this.templeId = templeId;
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public String getNodeState() {
        return nodeState;
    }

    public void setNodeState(String nodeState) {
        this.nodeState = nodeState == null ? null : nodeState.trim();
    }

    public Integer getNodeTime() {
        return nodeTime;
    }

    public void setNodeTime(Integer nodeTime) {
        this.nodeTime = nodeTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getNodeNow() {
        return nodeNow;
    }

    public void setNodeNow(String nodeNow) {
        this.nodeNow = nodeNow == null ? null : nodeNow.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getTaskTableGroup() {
        return taskTableGroup;
    }

    public void setTaskTableGroup(String taskTableGroup) {
        this.taskTableGroup = taskTableGroup == null ? null : taskTableGroup.trim();
    }
}