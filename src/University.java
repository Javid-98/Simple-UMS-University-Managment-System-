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
public class University {

   
    
    private ArrayList<Lesson> listLesson = new ArrayList<>();
    public static ArrayList<Teacher> listTeacher = new ArrayList<>();

    public ArrayList<Teacher> getListTeacher() {
        return listTeacher;
    }

    public ArrayList<Lesson> getListLesson() {
        return listLesson;
    }

   
}
