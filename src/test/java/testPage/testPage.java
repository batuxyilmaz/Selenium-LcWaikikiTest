package testPage;

import base.baseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testPage extends baseTest {
    steps stepspage;


    @Before
    public void before() {
        stepspage= new steps(baseTest.getWebDriver());

    }

    @Test
    public void test() {
        stepspage.moveToCategory().clickProduct().chooseProduct().chooseSize().addToBasket().myBasket().mainPage();

    }

   @After
    public void after() {

   }




}
