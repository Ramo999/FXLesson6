import java.util.ArrayList;
import java.util.Comparator;

public class Problem8 {
    public static void main(String[] args) {
        ArrayList<Car> CarList = new ArrayList<>();
        Car Car= new Car("Ramo" ,"Koshekbay","Abayuly",2005,"87077988632","Graph Design",3,"3E");
        Car Car1 = new Car("Madi" ,"Berikkazy","Myqyshov",2004,"87077988652","Java",3,"3E");
        Car Car2 = new Car("Dias" ,"Orisbek","Boladuly",2004,"87077988642","UI / UX Design",3,"3E");

        CarList.add(Car);
        CarList.add(Car1);
        CarList.add(Car2);

        for (Car f : CarList) {
            if (f.getBirth()<=2005){
                System.out.println(f);
            }
            if (f.getBirth()>2005){
                break;
            }
        }
    }
}

class Car{
    String fName;
    String lName;
    String mName;
    int birth;
    String pNumber;
    String faculty;
    int course;
    String group;


    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getmName() {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }
    public int getBirth() {
        return birth;
    }
    public void setBirth(int birth) {
        this.birth = birth;
    }
    public String getPNumber() {
        return pNumber;
    }
    public void setPNumber(String pNumber) {
        this.pNumber = pNumber;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    public Car(String fName,String lName,
                 String mName,int birth,
                 String pNumber,String faculty,
                 int course,String group) {
        this.fName = fName;
        this.lName = lName;
        this.birth = birth;
        this.pNumber = pNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    @Override
    public String toString() {
        return "Car(" +
                "fName:" + fName +
                ", age:" + lName +
                ", link:" + birth +
                ", rating:" + pNumber +
                ", age:" + faculty +
                ", link:" + course +
                ", rating:" + group +
                ")";

    }
}

class sCar implements Comparator<Car> {
    @Override
    public int compare(Car s1, Car s2){
        return s1.getfName().compareTo(s2.getfName());
    }
}

