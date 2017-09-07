package Tests;

import Store.Book;
import Store.Service;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.*;

import java.util.HashMap;
import java.util.Map;


public class TestSuite {

    @BeforeClass
    public static void beforeClass() {


    }

    @Before
    public void beforeTest() {

    }

    @Test
    public void genreTest(){
        Service Store = new Service();
        Store.addBook(1, "JK Rowling", "Harry Potter", "Fiction");
        Store.addBook(2, "David Donaghy", "Animal Farm", "Fiction");
        Store.addBook(3, "Adam Shahzad", "Party Pooper", "Factual");

        Assert.assertEquals(2, Store.getNoFiction());
        Assert.assertEquals(1, Store.getNoFactual());


    }

    @Test
    public void addBookTest() {
        Service Store = new Service();
        int mapSize = 0;
        Store.addBook(1, "JK Rowling", "Harry Potter", "Fiction");

        mapSize = Store.getMap().size();

        Assert.assertEquals(1, mapSize);

    }

    @After
    public void afterTest() {
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Tests Complete.");

    }

}

