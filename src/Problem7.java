import java.util.ArrayList;
import java.util.Comparator;

public class Problem7 {
    public static void main(String[] args) {
        ArrayList<Phone> PhoneList = new ArrayList<>();
        Phone Phone= new Phone("Ramo" ,"Koshekbay","Abayuly",2005,"87077988632","Graph Design",3,"3E");
        Phone Phone1 = new Phone("Madi" ,"Berikkazy","Myqyshov",2004,"87077988652","Java",3,"3E");
        Phone Phone2 = new Phone("Dias" ,"Orisbek","Boladuly",2004,"87077988642","UI / UX Design",3,"3E");

        PhoneList.add(Phone);
        PhoneList.add(Phone1);
        PhoneList.add(Phone2);

        for (Phone f : PhoneList) {
            if (f.getBirth()<=2005){
                System.out.println(f);
            }
            if (f.getBirth()>2005){
                break;
            }
        }
    }
}

class Phone{
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

    public Phone(String fName,String lName,
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
        return "Phone(" +
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

class sPhone implements Comparator<Phone> {
    @Override
    public int compare(Phone s1, Phone s2){
        return s1.getfName().compareTo(s2.getfName());
    }
}

