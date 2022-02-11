package com.lykj.springcloud.data.entities;

import java.util.Date;

public class TaskTable {
    private Integer id;

    private Integer owner_id;

    private String owner_name;

    private String taskInfo;

    private Date beginTime;

    private String state;

    private String progress;

    private String risk;

    private Integer taskSenderId;

    private String taskSenderName;

    private Date expectedCompletionTime;

    private Date closeTime;

    private String remarks;

    private Integer projectId;

    private Integer taskTempleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name == null ? null : owner_name.trim();
    }

    public String getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(String taskInfo) {
        this.taskInfo = taskInfo == null ? null : taskInfo.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress == null ? null : progress.trim();
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk == null ? null : risk.trim();
    }

    public Integer getTaskSenderId() {
        return taskSenderId;
    }

    public void setTaskSenderId(Integer taskSenderId) {
        this.taskSenderId = taskSenderId;
    }

    public String getTaskSenderName() {
        return taskSenderName;
    }

    public void setTaskSenderName(String taskSenderName) {
        this.taskSenderName = taskSenderName == null ? null : taskSenderName.trim();
    }

    public Date getExpectedCompletionTime() {
        return expectedCompletionTime;
    }

    public void setExpectedCompletionTime(Date expectedCompletionTime) {
        this.expectedCompletionTime = expectedCompletionTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getTaskTempleId() {
        return taskTempleId;
    }

    public void setTaskTempleId(Integer taskTempleId) {
        this.taskTempleId = taskTempleId;
    }
}