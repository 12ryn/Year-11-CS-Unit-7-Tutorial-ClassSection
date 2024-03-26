import java.util.ArrayList;
public class ClassSection {

    // prop.
    public String subject;
    public int capacity;
    public int yearLevel;
    public ArrayList<Student> students;

    // cons.

    public ClassSection(String subject, int capacity, int yearLevel){

        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        this.students = new ArrayList<>();

    }

    // methods

    public String getSubject(){

        return subject;

    }

    public void setSubject(String subject){

        this.subject = subject;

    }

    public int getCapacity(){

        return capacity;

    }

    public void setCapacity(int capacity){

        this.capacity = capacity;

    }

    public int getYearLevel(){

        return yearLevel;

    }

    public void setYearLevel(int yearLevel){

        this.yearLevel = yearLevel;

    }

    public ArrayList<Student> getStudents(){

        return students;

    }

    public void addStudent(Student student){

        if(!students.contains(student) && student.getYearLevel() == yearLevel){

            students.add(student);

        }

    }

    public void removeStudent(Student removed){

       students.remove(removed);

    }

    public boolean isStudentEnrolled(Student check){

        return students.contains(check);

    }

    public String toString() {

        return ("ClassSection{subject='"+subject+"', capacity=" + capacity+", yearLevel="+yearLevel+", students=" + students.toString()+"}");

    }
}
