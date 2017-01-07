/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Person extends University {

    private ArrayList<Student> getListStudent = new ArrayList<>();
    private ArrayList<Admin> adminList = new ArrayList<>();
    private String name;
    private String surname;
    private int id;
    private String password;

    public ArrayList<Student> getListStudent123() {
        return getListStudent;
    }
 
    public ArrayList<Admin> getPersonList()  {
       return adminList; 
    }
    

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public Person() {

    }

    public Person(String name, String surname, int id, String password) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String LogIn() {
        System.out.println("Choose login type:");
        System.out.println("1.Admin");
        System.out.println("2.Student");
        
        Scanner type = new Scanner(System.in);
        int answer = type.nextInt();
        Scanner password1 = new Scanner(System.in);
        Scanner id1 = new Scanner(System.in);
        System.out.println("ID: ");
        id = id1.nextInt();
        System.out.println("Password: ");
        password = password1.next();
        while (true) {
            if (answer == 1) {
               
                if (password.equals("javid123") && id == 123) {
                    System.out.println();
               
                }
                String answer1 = new Scanner(System.in).next();
                System.out.println("Do you wanna log out?: ");
                if (!answer1.equals("yes")) {
                    break;
                } else {
                    return LogIn();
                }
            }
            if (answer == 2) {
                if (password.equals("admin123") && id == 999) {
                    return getName();
                }
                String answer1 = new Scanner(System.in).next();
                System.out.println("Do you wanna log out?: ");
                if (!answer1.equals("yes")) {
                    break;
                }else {
                    return LogIn();
                }
            }
            if (answer == 3) {
                if (password.equals("teacher123") && id == 555) {
                    return getName();
                }
                String answer1 = new Scanner(System.in).next();
                System.out.println("Do you wanna log out?: ");
                if (!answer1.equals("yes")) {
                    break;
                }else {
                    return LogIn();
                }
            }

        }
        return "Choose correct variant!";
    }
}
