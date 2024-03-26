public class Student {

    // properties

    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public int yearLevel;
    public static int studentCount;

    // constructors

    public Student(String firstName, String lastName, int age, int yearLevel) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        this.id = ++studentCount;

    }

    // methods

    public int getId() {

        return id;

    }

    public String getFirstName() {

        return firstName;

    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public String getLastName() {

        return lastName;

    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

    public int getAge(){

        return age;

    }

    public void setAge(int age){

        this.age = age;

    }

    public int getYearLevel(){

        return yearLevel;

    }

    public void setYearLevel(int yearLevel){

        this.yearLevel = yearLevel;

    }

    public int getStudentCount(){

        return studentCount;

    }

    public boolean equals(Student other){

        return firstName.equals(other.firstName) && lastName.equals(other.lastName) && age == other.age && yearLevel == other.yearLevel;

    }

    public String toString() {
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "', age=" + age + ", yearLevel=" + yearLevel + "}";
    }
}
