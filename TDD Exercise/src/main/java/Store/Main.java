package Store;

import java.io.IOException;
import java.util.Map;

public class Main {

    public static void main(String [] args) {
        Service Store = new Service();

        Store.addBook(1, "JK Rowling", "Harry Potter", "Fiction");
        Store.addBook(2, "David Donaghy", "Animal Farm", "Fiction");
        Store.addBook(3, "Adam Shahzad", "Party Pooper", "Factual");

        System.out.println(Store.getNoFiction());


    }
}
