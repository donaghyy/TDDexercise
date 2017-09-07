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

    public long getNoFiction(){
        return store.values().stream().filter(eachBook -> eachBook.getGenre().equals("Fiction")).count();
    }

    public long getNoFactual(){
        return store.values().stream().filter(eachBook -> eachBook.getGenre().equals("Factual")).count();

    }

}

