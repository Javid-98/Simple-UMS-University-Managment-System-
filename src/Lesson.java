/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Student
 */
public class Lesson extends University {

    private String code;
    private String name;
    private int credit;
    private double note= 0.0;
    private Teacher teacher;
    public Lesson() {
    }

    public void setTeacher(Teacher t) {
        this.teacher = t;
    }
    
    public Lesson(String code, String name, int credit) {
       
        this.name = name;
        this.credit = credit;
        this.code= code;
        this.getListLesson().add(this);
    }

    public boolean equals(Lesson l) {
        if (this.code.equals(l.code) && this.name.equals(l.name) && this.credit == credit) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "L {" + "code:" + this.code + ", name:" + this.name + ", credit:" + this.credit + ", note:" + this.note + "  " + this.teacher + " }";
    }

    //-----------------------------
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

}
