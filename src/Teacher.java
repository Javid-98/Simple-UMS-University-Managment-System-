/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Teacher extends Person {

    private ArrayList<Lesson> lessonListTeacher;

    public ArrayList<Lesson> getLessonListTeacher() {
        return lessonListTeacher;
    }

    public ArrayList<Lesson> getLessonList() {
        return lessonListTeacher;
    }

    @Override
    public String toString() {
        return "Teacher is: " + getName() + getSurname();
    }

    public ArrayList<Lesson> listTeacher() {
        return listTeacher();
    }

    public Teacher(String name, String surname, int id, String password) {
        super(name, surname, id, password);
        lessonListTeacher = new ArrayList<>();
      }

    public String printTranscriptT() {

        return " Your lessons are { " + lessonListTeacher + "}";

    }

    
}
