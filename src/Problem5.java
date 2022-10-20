import java.util.ArrayList;
import java.util.Comparator;

public class Problem5 {
    public static void main(String[] args) {
        ArrayList<Book> BookList = new ArrayList<>();
        Book Book= new Book("Ramo Koshekbay" , "Avatar" , "Avatar 8" , 2001);
        Book Book1 = new Book("Madi Berikkazy" ,"Avater 2","Abay Zholy" , 2002);
        Book Book2 = new Book("Dias Orisbek" ,"Avatar 3","Tarih" , 2000);

        BookList.add(Book);
        BookList.add(Book1);
        BookList.add(Book2);

        for (Book f : BookList) {
            if (f.getrYear()<=2005){
                System.out.println(f);
            }
            if (f.getrYear()>2005){
                break;
            }
        }
    }
}

class Book{
    String author;
    String book;
    String book2;
    int rYear;

    public String getName() {
        return author;
    }
    public void setName(String name) {
        this.author = name;
    }
    public String getbook() {
        return book;
    }
    public void setbook(String book) {
        this.book = book;
    }
    public String getbook2() {
        return book2;
    }
    public void setbook2(String book2) {
        this.book2 = book2;
    }
    public int getrYear() {
        return rYear;
    }
    public void setrYear(int rYear) {
        this.rYear = rYear;
    }

    public Book(String author , String book , String book2 ,int rYear ) {
        this.author = author;
        this.book = book;
        this.book2 = book2;
        this.rYear = rYear;
    }
    @Override
    public String toString() {
        return "Book(" +
                "author:" + author +
                ", release year:" + rYear +
                ", book:" + book +
                ", book2 :" + book2 +
                ")";
    }
}

class sBook implements Comparator<Book> {
    @Override
    public int compare(Book s1, Book s2){
        return s1.getName().compareTo(s2.getName());
    }
}


