package com.UST.InterviewSchedule.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class InterviewscheduleDTO  {
    private Long id;
    private String name;
    private String email;
    private String phnumber;
    private String skills;
    private String experience;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    private Date date;
    private String time;
    private String link;
    private String poc;

    public InterviewscheduleDTO() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }

    public String getPhnumber() {
        return this.phnumber;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getSkills() {
        return this.skills;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getExperience() {
        return this.experience;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public java.util.Date getDate() {
        return this.date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return this.time;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return this.link;
    }

    public void setPoc(String poc) {
        this.poc = poc;
    }

    public String getPoc() {
        return this.poc;
    }
}