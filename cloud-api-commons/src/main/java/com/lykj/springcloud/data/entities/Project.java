package com.lykj.springcloud.data.entities;

import java.util.Date;

public class Project {
    private Integer id;

    private Integer PM_RD;

    private Integer PM_MK;

    private Integer PM_BU;

    private Integer PM_PU;

    private String state;

    private String stage;

    private String link;

    private Integer strOwner;

    private Integer testOwner;

    private Integer npiOwner;

    private Integer eleOwner;

    private Integer programOwner;

    private Integer authenticationOwner;

    private String wokFlowGroup;

    private String currentTaskGroup;

    private Date beginTime;

    private String PRO_CODE;

    private String PRO_NAME;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPM_RD() {
        return PM_RD;
    }

    public void setPM_RD(Integer PM_RD) {
        this.PM_RD = PM_RD;
    }

    public Integer getPM_MK() {
        return PM_MK;
    }

    public void setPM_MK(Integer PM_MK) {
        this.PM_MK = PM_MK;
    }

    public Integer getPM_BU() {
        return PM_BU;
    }

    public void setPM_BU(Integer PM_BU) {
        this.PM_BU = PM_BU;
    }

    public Integer getPM_PU() {
        return PM_PU;
    }

    public void setPM_PU(Integer PM_PU) {
        this.PM_PU = PM_PU;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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

    public Integer getStrOwner() {
        return strOwner;
    }

    public void setStrOwner(Integer strOwner) {
        this.strOwner = strOwner;
    }

    public Integer getTestOwner() {
        return testOwner;
    }

    public void setTestOwner(Integer testOwner) {
        this.testOwner = testOwner;
    }

    public Integer getNpiOwner() {
        return npiOwner;
    }

    public void setNpiOwner(Integer npiOwner) {
        this.npiOwner = npiOwner;
    }

    public Integer getEleOwner() {
        return eleOwner;
    }

    public void setEleOwner(Integer eleOwner) {
        this.eleOwner = eleOwner;
    }

    public Integer getProgramOwner() {
        return programOwner;
    }

    public void setProgramOwner(Integer programOwner) {
        this.programOwner = programOwner;
    }

    public Integer getAuthenticationOwner() {
        return authenticationOwner;
    }

    public void setAuthenticationOwner(Integer authenticationOwner) {
        this.authenticationOwner = authenticationOwner;
    }

    public String getWokFlowGroup() {
        return wokFlowGroup;
    }

    public void setWokFlowGroup(String wokFlowGroup) {
        this.wokFlowGroup = wokFlowGroup == null ? null : wokFlowGroup.trim();
    }

    public String getCurrentTaskGroup() {
        return currentTaskGroup;
    }

    public void setCurrentTaskGroup(String currentTaskGroup) {
        this.currentTaskGroup = currentTaskGroup == null ? null : currentTaskGroup.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public String getPRO_CODE() {
        return PRO_CODE;
    }

    public void setPRO_CODE(String PRO_CODE) {
        this.PRO_CODE = PRO_CODE == null ? null : PRO_CODE.trim();
    }

    public String getPRO_NAME() {
        return PRO_NAME;
    }

    public void setPRO_NAME(String PRO_NAME) {
        this.PRO_NAME = PRO_NAME == null ? null : PRO_NAME.trim();
    }
}