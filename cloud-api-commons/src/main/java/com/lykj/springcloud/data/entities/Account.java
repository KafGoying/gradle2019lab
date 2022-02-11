package com.lykj.springcloud.data.entities;

import java.util.Date;

public class Account {
    private Integer id;

    private String ly_code;

    private String name;

    private String state;

    private String gender;

    private Integer age;

    private String company;

    private String department_one;

    private String department_two;

    private String department_three;

    private String post;

    private Date join_time;

    private String place;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLy_code() {
        return ly_code;
    }

    public void setLy_code(String ly_code) {
        this.ly_code = ly_code == null ? null : ly_code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getDepartment_one() {
        return department_one;
    }

    public void setDepartment_one(String department_one) {
        this.department_one = department_one == null ? null : department_one.trim();
    }

    public String getDepartment_two() {
        return department_two;
    }

    public void setDepartment_two(String department_two) {
        this.department_two = department_two == null ? null : department_two.trim();
    }

    public String getDepartment_three() {
        return department_three;
    }

    public void setDepartment_three(String department_three) {
        this.department_three = department_three == null ? null : department_three.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public Date getJoin_time() {
        return join_time;
    }

    public void setJoin_time(Date join_time) {
        this.join_time = join_time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }
}