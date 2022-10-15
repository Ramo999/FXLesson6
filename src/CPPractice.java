import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Task
/*
class student {
    String name;
    int age;
    long pNumber;
    int grade;

    public student (String name , int age , long pNumber , int grade) {
        this.name = name;
        this.age = age;
        this.pNumber = pNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getpNumber() {
        return pNumber;
    }

    public void setpNumber(long pNumber) {
        this.pNumber = pNumber;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ",ages=" + age +
                ",phoneNumber=" + pNumber +
                ",grades= " + grade +
                '}';
    }
}
public class CPPractice {
    public static void main (String[] args) {
        student Student = new student("Arman" , 27 , 87077988632L , 95);
        System.out.println(Student.getName());
        System.out.println("Old Info : " + Student);
        Student.setName("Arsen");
        Student.setAge(28);
        Student.setpNumber(87077988636L);
        Student.setGrade(96);
        System.out.println(Student);
    }
}
*/

//Task 2
/*
public class CPPractice {
    public static void main(String[] args) {
        ArrayList<student> studentArrayList = new ArrayList<>();
        student Student1 = new student("Arman", 27, 87077988632L, 95);
        student Student2 = new student("Roberto", 27, 87077988632L, 95);
        student Student3 = new student("Richard", 27, 87077988632L, 95);

        studentArrayList.add(Student1);
        studentArrayList.add(Student2);
        studentArrayList.add(Student3);
        System.out.println(studentArrayList);

        for (student s:studentArrayList) {
            System.out.println(s);
        }
    }
}
*/

//Task 3
/*
public class CPPractice {
    public static void main(String[] args) {
        ArrayList<student> studentArrayList = new ArrayList<>();
        student Student1 = new student("Arman", 27, 87077988632L, 95);
        student Student2 = new student("Roberto", 21, 87077988632L, 79);
        student Student3 = new student("Richard", 17, 87077988632L, 75);

        studentArrayList.add(Student1);
        studentArrayList.add(Student2);
        studentArrayList.add(Student3);
        System.out.println("Old List : " + studentArrayList);

        System.out.println(studentArrayList.get(0));
        Collections.sort(studentArrayList, new SortByAge());
        System.out.println("Sorted By Age : " + studentArrayList);

        Collections.sort(studentArrayList, new SortByGrade());
        System.out.println("Sorted By Grade : " + studentArrayList);

        Collections.sort(studentArrayList, new SortByName());
        System.out.println("Sorted By Name : " + studentArrayList);
    }
}

class SortByAge implements Comparator<student> {
    @Override
    public int compare(student s1 , student s2) {
        if (s1.getAge() == s2.getAge())
            return 0;

        if (s1.getAge() > s2.getAge())
            return 1;

        else
            return -1;
    }
}

class SortByGrade implements Comparator<student> {
    @Override
    public int compare(student s1 , student s2) {
        if (s1.getGrade() == s2.getGrade())
            return 0;

        if (s1.getGrade() > s2.getGrade())
            return 1;

        else
            return -1;
    }
}

class SortByName implements Comparator<student> {
    @Override
    public int compare(student s1 , student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

//Task 4
public class CPPractice {
    public static void main(String[] args) {
        ArrayList<student> studentArrayList = new ArrayList<>();
        student Student1 = new student("Arman", 27, 87077988632L, 95);
        student Student2 = new student("Roberto", 21, 87077988632L, 79);
        student Student3 = new student("Richard", 17, 87077988632L, 75);

        studentArrayList.add(Student1);
        studentArrayList.add(Student2);
        studentArrayList.add(Student3);
        student s = getStudentByAge(studentArrayList , 27);
        System.out.println(s);
    }

    public static student getStudentByAge(ArrayList<student> list, int age) {
        student result = null;
        for (student s:list) {
            if (s.getAge() == age) {
                result = s;
            }
        }
        return result;
    }
}
*/

