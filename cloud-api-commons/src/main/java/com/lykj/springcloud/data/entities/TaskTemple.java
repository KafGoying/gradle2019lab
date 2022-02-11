package com.lykj.springcloud.data.entities;

public class TaskTemple {
    private Integer id;

    private String type;

    private String brief;

    private String stage;

    private String link;

    private String charge;

    private String addPeopleId;

    private Integer complexity;

    private String details;

    private String upperTask;

    private String lowerLevelTask;

    private String associatedTask;

    private Integer cycleWeekday;

    private Integer cycleTimeHour;

    private String focus;

    private String attribute;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge == null ? null : charge.trim();
    }

    public String getAddPeopleId() {
        return addPeopleId;
    }

    public void setAddPeopleId(String addPeopleId) {
        this.addPeopleId = addPeopleId == null ? null : addPeopleId.trim();
    }

    public Integer getComplexity() {
        return complexity;
    }

    public void setComplexity(Integer complexity) {
        this.complexity = complexity;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getUpperTask() {
        return upperTask;
    }

    public void setUpperTask(String upperTask) {
        this.upperTask = upperTask == null ? null : upperTask.trim();
    }

    public String getLowerLevelTask() {
        return lowerLevelTask;
    }

    public void setLowerLevelTask(String lowerLevelTask) {
        this.lowerLevelTask = lowerLevelTask == null ? null : lowerLevelTask.trim();
    }

    public String getAssociatedTask() {
        return associatedTask;
    }

    public void setAssociatedTask(String associatedTask) {
        this.associatedTask = associatedTask == null ? null : associatedTask.trim();
    }

    public Integer getCycleWeekday() {
        return cycleWeekday;
    }

    public void setCycleWeekday(Integer cycleWeekday) {
        this.cycleWeekday = cycleWeekday;
    }

    public Integer getCycleTimeHour() {
        return cycleTimeHour;
    }

    public void setCycleTimeHour(Integer cycleTimeHour) {
        this.cycleTimeHour = cycleTimeHour;
    }

    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus == null ? null : focus.trim();
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }
}