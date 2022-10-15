import java.util.Arrays;
import java.util.Scanner;

class Abiturient {

    private int id;

    private String name;

    private String surname;

    private String middle_name;

    private String address;

    private String phone_number;

    private int[] evaluation;

    private int evaluation_sum=0;

    public Abiturient() {
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.middle_name = "";
        this.address = "";
        this.phone_number = "";
        this.evaluation = new int[0];
        evaluation_sum = 0;
    }

    public Abiturient(int id, String name, String middle_name, String surname, String address, String phone_number, int[] evaluation) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middle_name = middle_name;
        this.address = address;
        this.phone_number = phone_number;
        this.evaluation = evaluation;
        for (int i : evaluation) {
            evaluation_sum+=i;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int[] getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int[] evaluation) {
        this.evaluation = evaluation;
    }

    public int getEvaluation_sum() {
        return evaluation_sum;
    }

    public void setEvaluation_sum(int evaluation_sum) {
        if(evaluation_sum>=0) {
            this.evaluation_sum = evaluation_sum;
        } else System.out.println("Sum of marks cant be less than 0");
    }

    @Override
    public String toString() {
        return "Abiturient --- " +
                "id =" + id +
                ", Last Name =" + surname+
                ", Name =" + name  +
                ", Middle Name=" + middle_name  +
                ", Address =" + address  +
                ", Phone Number =" + phone_number  +
                ", Marks =" + Arrays.toString(evaluation) +
                ", Sum of Marks =" + evaluation_sum;
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Abiturient[] abiturients_list = abiturients_list();
        System.out.println("a) Output list of abiturients that have unsatisfied marks (2 or 1)");
        abiturient_check_bad_evaluation(abiturients_list);

        System.out.println("b) Output list of abiturients that have satisfied marks;");
        System.out.print("Enter sum of marks : ");
        abiturient_check_evaluation_sum(abiturients_list,scanner.nextInt());

        System.out.println("");

        System.out.println("c) Select a given number of n - applicants with the highest score (also display the full list of applicants with a semi-pass sum).");
        System.out.print("Enter number of abituriets (n) : ");
        int r = scanner.nextInt();
        System.out.print("Enter the semi-through amount : ");
        abiturient_check_evaluation(abiturients_list,r,scanner.nextInt());
    }

    static Abiturient[] abiturients_list(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter number of abiturients : ");
        Abiturient[] abiturients = new Abiturient[scanner1.nextInt()];
        for (int i=0; i<abiturients.length; i++) {
            abiturients[i]=new Abiturient();
            System.out.println();
            System.out.print("Enter id: ");
            abiturients[i].setId(scanner1.nextInt());
            System.out.print("Enter Last Name : ");
            abiturients[i].setSurname(scanner1.next());
            System.out.print("Enter First Name : ");
            abiturients[i].setName(scanner1.next());
            System.out.print("Enter Middle Name : ");
            abiturients[i].setMiddle_name(scanner1.next());
            System.out.print("Enter Address : ");
            abiturients[i].setAddress(scanner1.next());
            System.out.print("Enter Phone Number : ");
            abiturients[i].setPhone_number(scanner1.next());
            System.out.print("Enter number of marks : ");
            int summa=0,n=scanner1.nextInt();
            int[] mass=new int[n];
            for (int j=0; j<n;j++){
                System.out.print("Enter mark number : " + (j+1) + ": ");
                mass[j]=scanner1.nextInt();
            }
            abiturients[i].setEvaluation(mass);
            for (int mas : mass) {
                summa+=mas;
            }
            abiturients[i].setEvaluation_sum(summa);
        }
        return abiturients;
    }

    static Abiturient[] abit(){
        Abiturient[] abiturients = new Abiturient[3];
        int[] mass = {1,2,3,4,3};
        abiturients[0] = new Abiturient(0,"Ramo","Abayuly","Koshekbay","7.35.58","87077988632",mass);
        mass = new int[]{4, 5, 5, 4, 5};
        abiturients[1] = new Abiturient(1,"Dias","Bolatuly","Orisbek","11.35.58","87077988658",mass);
        mass = new int[]{2, 3, 4, 3, 2};
        abiturients[2] = new Abiturient(2,"Madi","Myqyshov","Berikkazy","Merki","87077988652",mass);

        return abiturients;
    }

    static void abiturient_check_bad_evaluation(Abiturient[] abiturients){
        for (Abiturient abiturient : abiturients) {
            for (int i : abiturient.getEvaluation()) {
                if(i<3) {
                    System.out.println(abiturient.toString());
                    break;
                }
            }
        }
        System.out.println();
    }

    static void abiturient_check_evaluation_sum(Abiturient[] abiturients,int summa){
        for (Abiturient abiturient : abiturients) {
            if (abiturient.getEvaluation_sum()>summa)
                System.out.println(abiturient.toString());
        }
        System.out.println();
    }

    static void abiturient_check_evaluation(Abiturient[] abiturients, int n,int b){
        for (int i =0; i<abiturients.length;i++) {
            for (int j = i; j < abiturients.length; j++) {
                if(abiturients[i].getEvaluation_sum()<abiturients[j].getEvaluation_sum()){
                    Abiturient abiturient = abiturients[j];
                    abiturients[j] = abiturients[i];
                    abiturients[i] = abiturient;
                }
            }
        }
        System.out.println();
        System.out.println("1)List of abiturients that have highest marks :");
        for (int i=0; i<n; i++) {
            System.out.println(abiturients[i].toString());
        }
        System.out.println();

        System.out.println("2)List of abiturients that have semi-through marks :");
        for (Abiturient abiturient : abiturients) {
            if(abiturient.getEvaluation_sum()>b)
                System.out.println(abiturient.toString());
        }
    }
}
