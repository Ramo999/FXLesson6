import java.util.Comparator;
import java.util.Arrays;
public class Problem2 {
    public static void main(String[] args) {
        Customer[] cust = new Customer[3];
        cust[0] = new Customer(1, "Ramo", "Koshekbay", "Abayuly", "7.35.58", 451891223, 56521);
        cust[1] = new Customer(2, "Dias", "Orisbek", "Bolatuly", "11.36.53", 22323134, 45545);
        cust[2] = new Customer(3, "Madi", "Berikkazy", "Myqyshov", "Merki", 6543564, 12357);

        Arrays.sort(cust, Comparator.comparing(Customer::getlName));
        for (int i = 0; i <= 2; i++) {
            System.out.println(cust[i]);
        }
    }
}

class Customer {
    int customerId;
    String fName;
    String lName;
    String mName;
    String address;
    long numberCreditCard;
    long numberBankCard;

    public Customer(int customerId, String fName, String lName, String mName, String address, long numberCreditCard, long numberBankCard) {
        this.customerId = customerId;
        this.fName = fName;
        this.lName = lName;
        this.mName = mName;
        this.address = address;
        this.numberCreditCard = numberCreditCard;
        this.numberBankCard = numberBankCard;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNumberCreditCard() {
        return numberCreditCard;
    }

    public void setNumberCreditCard(long numberCreditCard) {
        this.numberCreditCard = numberCreditCard;
    }

    public long getNumberBankCard() {
        return numberBankCard;
    }

    public void setNumberBankCard(long numberBankCard) {
        this.numberBankCard = numberBankCard;
    }

    @Override
    public String toString() {
        return "Id of customer : " + customerId + "\nFirst Name : " + fName + "\nLast Name : " + lName +
                "\nMiddle Name : " + mName + "\nNumber of Credit Card : " + numberCreditCard +
                "\nNumber of Bank Card : " + numberBankCard;
    }
}