/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Driver {

    public static void main(String[] args) {
        // University u1= new University();
        Student s1 = new Student("Javid", "Mahmudov", 123, "javid123");
        Admin a1 = new Admin("Admin", "Admin", 999, "admin123");
        //Lesson comp = new Lesson("CMS101", "Fundamentals of Programming", 4);
        //Lesson comp1 = new Lesson("CMS102", "Fundamentals of Programming", 4);
        Teacher t1 = new Teacher("Rashad", "Khaliqov", 555, "asd123");
//        
        // Person p1 = new Person("Person", "Person", 555, "person123");
//      
       a1.addStudent(s1);
        a1.start();
//       
//        a1.getListLesson();
    }

}
