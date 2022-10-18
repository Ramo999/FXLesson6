import java.util.ArrayList;
import java.util.Comparator;

public class Problem6 {
    public static void main(String[] args) {
        ArrayList<apartment> apartmentList = new ArrayList<>();
        apartment apartment= new apartment("1",5,6);
        apartment apartment1 = new apartment("3",5,9);
        apartment apartment2 = new apartment("14",5,6);

        apartmentList.add(apartment);
        apartmentList.add(apartment1);
        apartmentList.add(apartment2);

        for (apartment f : apartmentList) {
            if (f.getaroomNKvartal()<=2005){
                System.out.println(f);
            }
            if (f.getaroomNKvartal()>2005){
                break;
            }
        }
    }
}

class apartment{
    String aroomN;
    int apartment;
    int aroomNKvartal;

    public String getaroomN() {
        return aroomN;
    }

    public void setaroomN(String aroomN) {
        this.aroomN = aroomN;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public int getaroomNKvartal() {
        return aroomNKvartal;
    }

    public void setaroomNKvartal(int aroomNKvartal) {
        this.aroomNKvartal = aroomNKvartal;
    }

    public apartment(String aroomN , int apartment, int aroomNKvartal ) {
        this.aroomN = aroomN;
        this.apartment = apartment;
        this.aroomNKvartal = aroomNKvartal;
    }
    @Override
    public String toString() {
        return "apartment(" +
                "aroomN:" + aroomN +
                ", aroomNKvartal:" + aroomNKvartal +
                ", apartment:" + apartment +
                ")";
    }
}

class sapartment implements Comparator<apartment> {
    @Override
    public int compare(apartment s1, apartment s2){
        return s1.getaroomN().compareTo(s2.getaroomN());
    }
}

