package com.UST.InterviewSchedule.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Interviewschedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhnumber() {
        return phnumber;
    }

    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPoc() {
        return poc;
    }

    public void setPoc(String poc) {
        this.poc = poc;
    }

    public Interviewschedule(Long id, String name, String email, String phnumber, String skills, String experience, Date date, String time, String link, String poc) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phnumber = phnumber;
        this.skills = skills;
        this.experience = experience;
        this.date = date;
        this.time = time;
        this.link = link;
        this.poc = poc;
    }
    public Interviewschedule(){

    }
}
