package Tests;

import ExamplePackage.ExampleClass;
import org.junit.*;


public class AddSuite {

    @BeforeClass
    public static void beforeClass() {
    }

    @Before
    public void beforeTest() {

    }

    @Test
    public void exampleTest(){


        Assert.assertEquals(1, 1);
    }

    @After
    public void afterTest() {
    }

    @AfterClass
    public static void afterClass() {

    }

}

