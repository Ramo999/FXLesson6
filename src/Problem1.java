import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private static int nextId=0;
    private String firstName;
    private String middlefirstName;
    private String dateOfBirth;
    private String lastName;
    private String phoneNumber;
    private String faculty;
    private String course;
    private String group;
    public Student( String firstName , String middlefirstName , String lastName , String dateOfBirth ,  String phoneNumber , String faculty , String course , String group) {
        this.firstName=firstName;
        this.middlefirstName=middlefirstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;
        this.phoneNumber=phoneNumber;
        this.faculty=faculty;
        this.course=course;
        this.group=group;
        id=nextId++;
        setfirstName(firstName);
        setMiddlefirstName(middlefirstName);
        setlastName(lastName);
        setDateOfBirth(dateOfBirth);
        setPhoneNumber(phoneNumber);
        setFaculty(faculty);
        setCourse(course);
        setGroup(group);}

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddlefirstName() {
        return firstName;
    }

    public void setMiddlefirstName(String middlefirstName) {
        this.middlefirstName = middlefirstName;
    }
    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Student{"+" id " +id+
                ", firstName='" + firstName + '\'' +
                ", middlefirstName='" + middlefirstName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
    public String fullfirstName(){
        return lastName+" "+middlefirstName+" "+firstName;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ramazan", "Abayuly", "Koshekbay", "20.10.2005", "87077988632", "IT", "3", "3E");
        Student st2 = new Student("Madi", "Mykyshov", "Berikkazy", "12.08.2004", "38044555667713", "Translater", "2", "321");
        Student st3 = new Student("Ramazan", "Abayuly", "Koshekbay", "20.10.2005", "87077988632", "IT", "3", "3E");
        Student st4 = new Student("Madi", "Mykyshov", "Berikkazy", "12.08.2004", "38044555667713", "Translater", "2", "321");
        Student st5 = new Student("Ramazan", "Abayuly", "Koshekbay", "20.10.2005", "87077988632", "IT", "3", "3E");
        Student st6 = new Student("Madi", "Mykyshov", "Berikkazy", "12.08.2004", "38044555667713", "Translater", "2", "321");
        Student st7 = new Student("Ramazan", "Abayuly", "Koshekbay", "20.10.2005", "87077988632", "IT", "3", "3E");
        Student st8 = new Student("Madi", "Mykyshov", "Berikkazy", "12.08.2004", "38044555667713", "Translater", "2", "321");
        Student st9 = new Student("Ramazan", "Abayuly", "Koshekbay", "20.10.2005", "87077988632", "IT", "3", "3E");
        Student st10 = new Student("Madi", "Mykyshov", "Berikkazy", "12.08.2004", "38044555667713", "Translater", "2", "321");
        Student st11 = new Student("Ramazan", "Abayuly", "Koshekbay", "20.10.2005", "87077988632", "IT", "3", "3E");
        Student st12 = new Student("Madi", "Mykyshov", "Berikkazy", "12.08.2004", "38044555667713", "Translater", "2", "321");

        StudentList newList=new StudentList();
        newList.addStudent(st1);
        newList.addStudent(st1);
        newList.addStudent(st2);
        newList.addStudent(st3);
        newList.addStudent(st4);
        newList.addStudent(st5);
        newList.addStudent(st6);
        newList.addStudent(st7);
        newList.addStudent(st8);
        newList.addStudent(st9);
        newList.addStudent(st10);
        newList.addStudent(st11);
        newList.addStudent(st12);
        newList.facultyPrint("IT");//список студентов заданного факультета
        newList.groupPrint("3E");//список учебной группы
        newList.yearOfBirthPrint("2000");//список студентов, родившихся после заданного года;
        newList.facultyCoursePrint("IT","1");//списки студентов для каждого факультета и курса;
    }
}

class StudentList {
    private List<Student>studentsList= new ArrayList<>();
    public void addStudent(Student a){
        studentsList.add(a);
    }
    public void facultyPrint(String faculty){
        System.out.println("List of student in current faculty "+faculty);
        for(Student st:studentsList){
            if(st.getFaculty().equals(faculty)){
                System.out.println(st.toString());
            }
        }
    }
    public void groupPrint(String group){
        System.out.println("List of students in group "+group);
        for(Student st:studentsList){
            if(st.getGroup().equals(group)){
                System.out.println(st.toString());
            }
        }
    }
    public void yearOfBirthPrint(String year){
        System.out.println("Students that borned after "+year+" year");
        for(Student st:studentsList){
            if(parseYear(st.getDateOfBirth().substring(6))>parseYear(year)){
                System.out.println(st.toString());}
        }
    }

    public void facultyCoursePrint(String faculty,String course){
        System.out.println("List of students "+faculty+" course "+course);
        for(Student st:studentsList){
            if(st.getFaculty().equals(faculty)&st.getCourse().equals(course)){
                System.out.println(st.toString());}
        }
    }

    public void facultyCoursePrint(String faculty) {
        System.out.println("List of students " + faculty + "of all courses ");
        for (Student st : studentsList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st.toString());
            }
        }
    }

    public void facultyCoursePrint(int course){
        System.out.println("List of all students of course "+course);
        for(Student st:studentsList){
            if(Integer.parseInt(st.getCourse())==course){
                System.out.println(st.toString());}
        }
    }

    public int parseYear(String years) {
        return Integer.parseInt(years);
    }
}