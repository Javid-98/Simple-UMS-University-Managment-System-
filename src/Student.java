
import java.util.ArrayList;

public class Student extends Person {

    public ArrayList<Lesson> lessonList;

    @Override
    public String LogIn() {
        return super.LogIn(); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Lesson> getLessonList() {
        return lessonList;
    }
   
   
    public Student(String name, String surname, int id, String password) {
        super(name, surname, id, password);
        lessonList = new ArrayList<>();
        this.getListStudent123().add(this);

    }

    public double gpa() {
        double result = 0.0;
        double totalCredits = 0;
        for (int i = 0; i < lessonList.size(); i++) {
            if (lessonList.get(i).getNote() >= 60) {
                result += lessonList.get(i).getNote() * lessonList.get(i).getCredit();
                totalCredits += lessonList.get(i).getCredit();
            }
        }
        return Math.round(result / totalCredits);
    }

    public  String printTranscript() {

        return "Student{" + getName() + " " + getSurname() + " Lessons { " + lessonList + "}" + " Your gpa is: " + gpa();

    }
    public String toString() {

        return "Student{ " + " Name: " + getName()+ "," + " Surname: " + getSurname() + "," +   " ID: " + getId() + " | ";

    }

}
