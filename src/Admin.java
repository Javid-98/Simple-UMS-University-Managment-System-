
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Admin extends Person {

    public Admin(String name, String surname, int id, String password) {
        super(name, surname, id, password);
        this.getPersonList().add(this);
    }

// this method start program. 
    public void start() {
        while (true) {
            System.out.println("Choose type of person:" + "\n1.Admin" + "\n2.Student" + "\n3.Teacher");
            String choice = new Scanner(System.in).next();
            // this try, catch exeption that any posibility outside from this method   
            try {
                try {
                    // if choice equals one of type then it can go inside if
                    if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
                        //when admin selected we add student, teacher, lesson and other method that inside admin
                        switch (choice) {
                            case "1":
                                System.out.println("Enter ID: ");
                                int idA = Integer.parseInt(new Scanner(System.in).nextLine());
                                for (int z = 0; z < 3; z++) {
                                    System.out.println("Enter password: ");
                                    String passwordA = new Scanner(System.in).next();
                                    if (this.findAdminById(idA).getPassword().equals(passwordA)) {
                                        System.out.println("You are an admin. \nWhat do you want?" + "\n1.Add student to database."
                                                + "\n2.Add lesson to database."
                                                + "\n3.Add teacher to database." + "\n4.Add lesson to student." + "\n5.Set lesson to teacher." + "\n6.Delete student.");
                                        String choice2 = new Scanner(System.in).next();
                                        if (choice2.equals("1") || choice2.equals("2") || choice2.equals("3") || choice2.equals("4") || choice2.equals("5") || choice2.equals("6")) {
                                            switch (choice2) {
                                                case "1":
                                                    System.out.println("Add student to database: ");
                                                    addStudentToDatabase();
                                                    break;
                                                case "2":
                                                    System.out.println("Add lesson to database: ");
                                                    addLessonToDatabase();
                                                    break;
                                                case "3":
                                                    System.out.println("Add teacher to database: ");
                                                    addTeacherToDatabase();
                                                    break;
                                                case "4":
                                                    System.out.println("Add lesson to student: ");
                                                    addLessonToStudent();
                                                    break;
                                                case "5":
                                                    System.out.println("Set lesson to teacher: ");
                                                    addLessonToTeacher();
                                                    break;
                                                case "6":
                                                    System.out.println("Delete student: ");
                                                    deleteStudent();
                                                    break;
                                            }
                                            break;
                                        } else {
                                            System.out.println("Uncorrect choice!");
                                        }
                                    } else {
                                        System.out.println("Uncorrect password! Try Again!");
                                    }
                                }
                                System.out.println("Do you wanna log out?: ");
                                String answer = new Scanner(System.in).next();
                                // log out answer checking
                                if (!(answer.equals("yes"))) {
                                    break;
                                } else {
                                    return;
                                }
                            case "2":
                                System.out.println("Enter ID:");
                                int idS = Integer.parseInt(new Scanner(System.in).nextLine());

                                System.out.println("Student is: " + this.findStudentById(idS).getName() + " " + this.findStudentById(idS).getSurname());
                                for (int i = 0; i < 3; i++) {
                                    System.out.println("Enter password: ");
                                    String passwordS = new Scanner(System.in).next();
                                    if (this.findStudentById(idS).getPassword().equals(passwordS)) {
                                        System.out.println(this.findStudentById(idS).printTranscript());
                                        break;
                                    } else {
                                        System.out.println("Uncorrect Password! Try again!");
                                    }
                                }
                                System.out.println("Do you wanna log out?:");
                                String answer1 = new Scanner(System.in).next();
                                //log out answer checking
                                if (!(answer1.equals("yes"))) {
                                    break;
                                } else {
                                    return;
                                }
                            case "3":
                                // this try, catch number format eception that we cant write any string member inside "id"
                                System.out.println("Enter teacher ID: ");
                                int idT = Integer.parseInt(new Scanner(System.in).nextLine());
                                System.out.println("Teacher is: " + this.findTeacher(idT).getName() + " " + this.findTeacher(idT).getSurname());
                                for (int j = 0; j < 3; j++) {
                                    System.out.println("Enter password: ");
                                    String passwordT = new Scanner(System.in).next();
                                    if (this.findTeacher(idT).getPassword().equals(passwordT)) {
                                        System.out.println(this.findTeacher(idT).printTranscriptT());
                                        break;
                                    } else {
                                        System.out.println("Uncorrect password! Try Again! ");
                                    }
                                }
                                System.out.println("Do you wanna log out?:");
                                String answer2 = new Scanner(System.in).next();
                                //log out answer checking
                                if (!answer2.equals("yes")) {
                                    break;
                                } else {
                                    return;
                                }
                        }
                    } else {
                        System.out.println("Choose correct person!");
                    }
                } catch (NullPointerException e) {
                    System.out.println("Uncorrect ID! Person doesn't exist!");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please insert number!");
            }

        }
    }

    public Student findStudentById(int id) {
        for (Student s : getListStudent123()) {
            if (s != null && s.getId() == id) {
                return s;
//return s.getName() + " " + s.getSurname();
            }
        }
        return null;
    }

    public Lesson findLessonByCode(String code) {
        for (Lesson l : getListLesson()) {
            if (l != null && l.getCode().equals(code)) {
                return l;
            }
        }
        return null;
    }

    public void addTeacherToDatabase() {
        while (true) {
            System.out.println("Dou you wanna add teacher?: ");
            String answer = new Scanner(System.in).next();
            if (!answer.equals("yes")) {
                break;
            }
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter teacher ID: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println("Enter teacher name: ");
                String name = sc.nextLine();
                System.out.println("Enter teacher surname: ");
                String surname = sc.nextLine();
                System.out.println("Set password for teacher: ");
                String password = sc.nextLine();
                this.addTeacher(new Teacher(name, surname, id, password));
            } catch (NumberFormatException e) {
                System.out.println("Please insert number!");
                addTeacherToDatabase();
            }
        }
    }

    public Teacher findTeacher(int id) {

        for (Teacher t : getListTeacher()) {
            if (t != null && t.getId() == id) {
                return t;
            }
        }

        return null;
    }

    public Admin findAdminById(int id) {
        for (Admin a : getPersonList()) {
            if (a != null && a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public void addTeacher(Teacher t) {
        if (!this.isExistT(t)) {
            getListTeacher().add(t);
        } else {
            System.out.println("Already added"
                    + t);
        }
    }

    public void addLessonToTeacher() {
        while (true) {
            try {
                System.out.println("Dou you wanna add one more lesson to teacher?: ");
                String answer = new Scanner(System.in).next();
                if (!answer.equals("yes")) {
                    break;
                }
                System.out.println("Enter lesson code: ");
                String code = new Scanner(System.in).nextLine();
                System.out.println("Lesson is " + this.findLessonByCode(code).getName());
                try {
                    System.out.println("Enter teacher ID: ");
                    int id = Integer.parseInt(new Scanner(System.in).nextLine());
                    System.out.println("Teacher is " + this.findTeacher(id).getName());
                    this.findTeacher(id).getLessonListTeacher().add(this.findLessonByCode(code));
                    this.findLessonByCode(code).setTeacher(this.findTeacher(id));
                } catch (NumberFormatException e) {
                    System.out.println("Please insert number!");
                    addLessonToTeacher();
                }
            } catch (NullPointerException e) {
                System.out.println("Teacher or Lesson doesn't exist!");
            }
        }
    }

    public void addLessonToStudent() {

        while (true) {
            try {
                try {
                    System.out.println("Do you wanna add one more lesson to student?: ");
                    String answer = new Scanner(System.in).next();
                    if (!answer.equals("yes")) {
                        break;
                    }
                    System.out.println("Enter student ID: ");
                    int id = Integer.parseInt(new Scanner(System.in).nextLine());
                    System.out.println("Student is " + this.findStudentById(id).getName());
                    System.out.println("Enter lesson code: ");
                    String code = new Scanner(System.in).nextLine();
                    System.out.println("Lesson is " + this.findLessonByCode(code).getName());
                    System.out.println("How many points student got from this lesson?: ");
                    int note = new Scanner(System.in).nextInt();
                    this.findLessonByCode(code).setNote(note);
                    this.findStudentById(id).getLessonList().add(this.findLessonByCode(code));
                } catch (NumberFormatException e) {
                    System.out.println("Please insert number!");
                    addLessonToStudent();
                }
            } catch (NullPointerException e) {
                System.out.println("Student or Lesson doesn't exist!");
            }

        }
    }

    public void addStudent(Student s) {
        if (!this.isExistS(s)) {
            getListStudent123().add(s);
        } else {
            System.out.println("Already added" + s);
        }
    }

    public void addStudentToDatabase() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Enter student ID: ");
                int id = Integer.parseInt(sc.nextLine());

                System.out.println("Enter student name: ");
                String name = sc.nextLine();
                System.out.println("Enter student surname: ");
                String surname = sc.nextLine();
                System.out.println("Set password for student: ");
                String password = sc.nextLine();
                this.addStudent(new Student(name, surname, id, password));
            } catch (NumberFormatException e) {
                System.out.println("Please insert number!");
                addStudentToDatabase();
            }
            System.out.println("Do you wanna add one more student to univetsity?: ");
            String answer = sc.next();
            if (!(answer.equals("yes"))) {
                break;
            }
        }
    }

    public void addLessonToDatabase() {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter lesson code: ");
            String code = sc.nextLine();
            System.out.println("Enter lesson name: ");
            String name = sc.nextLine();
            System.out.println("Enter lesson credit: ");
            try {
                int credit = sc.nextInt();
                this.addLesson(new Lesson(code, name, credit));
            } catch (InputMismatchException e) {
                System.out.println("Please insert number!");
                addLessonToDatabase();
            }
            System.out.println("Do you wanna add one more lesson to univetsity?: ");
            String answer = sc.next();
            if (!answer.equals("yes")) {
                break;
            }
        }
    }

    public boolean isExist(Lesson l) {
        for (int j = 0; j < getListLesson().size(); j++) {
            if (this.getListLesson().get(j).getCode().equals(l.getCode())) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistS(Student s) {
        for (int j = 0; j < getListStudent123().size(); j++) {
            if (this.getListStudent123().get(j).getId() == (s.getId())) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistT(Teacher t) {
        for (int j = 0; j < getListTeacher().size(); j++) {
            if (this.getListTeacher().get(j).getId() == (t.getId())) {
                return true;
            }
        }
        return false;
    }

    public void addLesson(Lesson l) {
        if (!this.isExist(l)) {
            getListLesson().add(l);
        } else {
            System.out.println("Already added ->" + l);
        }
    }

    public int findStudentIndex(Student s) {
        for (int i = 0; i < getListStudent123().size(); i++) {
            if (getListStudent123().get(i).equals(s)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteStudent() {
        System.out.println("Enter student id: ");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());

        Student s = this.findStudentById(id);
        if (s != null) {

            getListStudent123().remove(s);
            System.out.println("Student " + s.getName() + " Deleted!");
        } else {
            System.out.println("Student doesn't exist! ");
        }
    }
}
