import java.util.Objects;

/**
 * Class representing a Student with <b>firstName</b>,<b>lastName</b>,
 * <b>faculty</b>,<b>yearOfBirth</b>,<b>yearOfAdmission</b>,<b>identificationNumber</b>.
 * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
 * */
public class Student implements Cloneable{
    private String firstName;
    private String lastName;
    private String faculty;
    private int yearOfBirth;
    private int yearOfAdmission;
    private long identificationNumber;

    /**
     * Default constructor of Student class.
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public Student(){

    }

    /**
     * Constructor with parameters of Student class
     * @param firstName student's name
     * @param lastName student's last name
     * @param faculty student's faculty
     * @param yearOfBirth student's year of birth
     * @param yearOfAdmission student's year of admission
     * @param identificationNumber student's idnp
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public Student(String firstName, String lastName,
                   String faculty, int yearOfBirth,
                   int yearOfAdmission, long identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.yearOfBirth = yearOfBirth;
        this.yearOfAdmission = yearOfAdmission;
        this.identificationNumber = identificationNumber;
    }

    /**
     * Copy constructor of Student class
     * @param s an instance of Student class to copy from
     * @return instance of Student class with copied instance variable values
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public Student(Student s){
        this.firstName = s.firstName;
        this.lastName = s.lastName;
        this.faculty = s.faculty;
        this.yearOfBirth = s.yearOfBirth;
        this.yearOfAdmission = s.yearOfAdmission;
    }

    /**
     * Overrided clone method inherited from Object class
     * for being able to create clones of Students
     * @return cloned instance of Student class
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }

    //OR COULD CLONE IT IN THIS WAY
    /*
     * public Student copy(){
     *   return new Student(this);
     * }
     */


    /**
     * Overrided equals method which compares students based on their IDNP
     * @param o Student instance to compare with
     * @return true of false depending on student's indp
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return  identificationNumber == student.identificationNumber;
    }

    /**
     * Ovverided hashCode method which calculates hash code of a Student object based on its IDNP
     * @return object converted to its integer representation
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    @Override
    public int hashCode() {
        return Objects.hash(identificationNumber);
    }

    // METHOD TO READ/WRITE
    /**
     * Method to create student from provided fields as arguments
     * @return Student object
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public static Student create(String firstName, String lastName,
                                 String faculty, int yearOfBirth,
                                 int yearOfAdmission, long identificationNumber){
        return new Student(firstName,lastName,faculty,yearOfBirth,yearOfAdmission,identificationNumber);
    }

    /**
     * @return the value of first name field
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public String getFirstName() {
        return firstName;
    }


    /**
     * Set the value of first name field
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the value of last name field
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of last name field
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the value of faculty field
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public String getFaculty() {
        return faculty;
    }


    /**
     * Set the value of Faculty field
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * @return the value of YearOfBirth field
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Set the value of YearOfBirth field
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * @return the value of YearOfAdmission field
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    /**
     * Set the value of YearOfAdmission field
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    /**
     * @return the value of IdentificationNumber field
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public long getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Set the value of IdentificationNumber field
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public void setIdentificationNumber(long identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    /**
     * Overrided toString() method from Object class for better readability
     * @return string representation of Student object with all the fields
     * */
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", yearOfAdmission=" + yearOfAdmission +
                ", identificationNumber=" + identificationNumber +
                '}';
    }
}
