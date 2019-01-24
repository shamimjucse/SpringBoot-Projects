package com.test1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    private Integer roll;

    @Column(name = "name")
    private String name;

    @Column(name = "mark")
    private Integer mark;

    public Student() {
    }

    public Student(Integer roll, String name, Integer mark) {
        this.roll = roll;
        this.name = name;
        this.mark = mark;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}
