import java.util.Scanner;

class Patient {

    private int id;

    private String fName;

    private String lName;

    private String mName;

    private String address;

    private String pnumber;

    private int med_card;

    private String diagnosis;

    public Patient(){
        this.id = 0;
        this.fName = "";
        this.lName = "";
        this.mName = "";
        this.address = "";
        this.med_card = 0;
        this.pnumber = "";
        this.diagnosis = "";
    }

    public Patient(int id, String fName, String mName, String lName,String address, String pnumber, int med_card, String diagnosis) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.mName = mName;
        this.address = address;
        this.med_card = med_card;
        this.pnumber = pnumber;
        this.diagnosis = diagnosis;
    }

    void setId(int id){
        this.id = id;
    }

    int getId(){
        return id;
    }

    void setName(String fName){
        this.fName =fName;
    }

    String getName(){
        return fName;
    }

    void setlName(String lName){
        this.lName = lName;
    }

    String getlName(){
        return lName;
    }

    void setmName(String mName){
        this.mName = mName;
    }

    String getmName(){
        return mName;
    }

    void setAddress(String address){
        this.address =address;
    }

    String getAddress(){
        return address;
    }

    void setpnumber(String pnumber){
        this.pnumber =pnumber;
    }

    String getpnumber(){
        return pnumber;
    }

    void setMed_card(int med_card){
        if(med_card>0) {
            this.med_card = med_card;
        } else System.out.println("Number of medicine card can't be minus or null");
    }

    int getMed_card(){
        return med_card;
    }

    void setDiagnosis(String diagnosis){
        this.diagnosis =diagnosis;
    }

    String getDiagnosis(){
        return diagnosis;
    }

    @Override
    public String toString() {
        return "Patient --- " +
                "id=" + id +
                ", Last Name ='" + lName +
                ", First Name =" + fName  +
                ", Middle Name =" + mName +
                ", Address ='" + address +
                ", Phone Number ='" + pnumber +
                ", Number of Medicine Card =" + med_card +
                ", Diagnosis ='" + diagnosis;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient[] patients_list = patients_list();
        System.out.print("Enter diagnosis for find out people : ");
        String diagnosis = scanner.next();
        check_diagnosis(patients_list, diagnosis);
        System.out.println("Enter diapason for find med card : ");
        System.out.print("From : ");
        int a = scanner.nextInt();
        System.out.print("Till : ");
        int b = scanner.nextInt();
        check_med_card(patients_list, a, b);
    }

    static Patient[] patients_list(){

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter patients number : ");
        Patient[] patients = new Patient[scanner1.nextInt()];
        for (int i=0; i<patients.length; i++) {
            patients[i]=new Patient();
            System.out.println();
            System.out.print("Enrer ID : ");
            patients[i].setId(scanner1.nextInt());
            System.out.print("Enter Last Name: ");
            patients[i].setlName(scanner1.next());
            System.out.print("Enter First Name: ");
            patients[i].setName(scanner1.next());
            System.out.print("Enter Middle Name: ");
            patients[i].setmName(scanner1.next());
            System.out.print("Enter Address : ");
            patients[i].setAddress(scanner1.next());
            System.out.print("Enter Phone Number : ");
            patients[i].setpnumber(scanner1.next());
            System.out.print("Enter number of medicine card : ");
            patients[i].setMed_card(scanner1.nextInt());
            System.out.print("Enter diagnosis : ");
            patients[i].setDiagnosis(scanner1.next());
        }
        return patients;
    }

    static Patient[] pat(){
        Patient[] mass= new Patient[3];

        mass[0]= new Patient(0,"Ramo","Abayuly","Koshekbay","7.35.58","87077988632",75612,"Cold");
        mass[1]= new Patient(1,"Dias","Bolatuly","Orisbek","11.56.58","87077988654",14267,"Headache");
        mass[2]= new Patient(2,"Dias","Bolatuly","Orisbek","11.56.58","87077988654",14267,"Stomach Ache");

        return mass;
    }

    static void check_diagnosis(Patient[] patients,String diagnosis){
        for(Patient patient:patients){
            if(patient.getDiagnosis().equals(diagnosis)){
                System.out.println(patient.toString());
            }
        }
        System.out.println();
    }

    static void check_med_card(Patient[] patients,int a, int b){
        for(Patient patient:patients){
            if(patient.getMed_card()>=a && patient.getMed_card()<=b){
                System.out.println(patient.toString());
            }
        }
    }
}