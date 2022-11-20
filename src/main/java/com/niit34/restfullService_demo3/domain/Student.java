/*
 *Author Name: Aman Singh
 *Date:18-11-2022
 *Created With: Intellij IDEA Community Edition
 */
package com.niit34.restfullService_demo3.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private int sid;
    private String sname;
    private String saddress;
    private int smark;

    public Student() {
    }

    public Student(int sid, String sname, String saddress, int smark) {
        this.sid = sid;
        this.sname = sname;
        this.saddress = saddress;
        this.smark = smark;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public int getSmark() {
        return smark;
    }

    public void setSmark(int smark) {
        this.smark = smark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", saddress='" + saddress + '\'' +
                ", smark=" + smark +
                '}';
    }
}
