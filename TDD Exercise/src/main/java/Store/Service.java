package Store;


import java.util.HashMap;
import java.util.Map;

public class Service {
    private Map<Integer, Book> store = new HashMap<Integer, Book>();

    public Map getMap(){
        return store;
    }

    public void addBook(Integer key, String author, String title, String genre )
    {
        Book newBook = new Book(author, title, genre);
        store.put(key, newBook);
    }

    public void removeBook(Integer key){
    		store.remove(key);
    }

    public int getNoFiction(){
        int fict =0;

        for (Map.Entry<Integer, Book> book : store.entrySet()) {
            if (book.getValue().getGenre() == "Fiction"){
                fict++;
            }
        }

        return fict;
    }

    public int getNoFactual(){
        int fact =0;

        for (Map.Entry<Integer, Book> book : store.entrySet()) {
            if (book.getValue().getGenre() == "Factual"){
                fact++;
            }
        }

        return fact;
    }

    public void printAll(){
    		store.forEach((key, book) ->
    		{
            System.out.print("ID: " + key + "\n" + "The author is: " + book.getAuthor() + "\n"
            		+ "The books title is: " + book.getTitle() + "\nThe Genre is: " + book.getGenre() + "\n\n");

        });
    }

}

