package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */

public class BookShopTest {

    /**
     * TODO : Put your test here
     */

    @Test
    public void myFirstTest(){
        BookShop Shop = new BookShop("BookShop");
        int[] Basket = {4,2,1,1,1};
        assertEquals(58,Shop.cost(Basket));
    }

    @Test
    public void mySecondTest(){
        BookShop Shop = new BookShop("BookShop");
        int[] Basket = {1,2,1,1,0};
        assertEquals(31.04,Shop.cost(Basket));
    }

    @Test
    public void myThirdTest(){
        BookShop Shop = new BookShop("BookShop");
        int[] Basket = {1,1,1,0,0};
        assertEquals(20.64,Shop.cost(Basket));
    }

    @Test
    public void myFourthTest(){
        BookShop Shop = new BookShop("BookShop");
        int[] Basket = {5,2,0,0,0};
        assertEquals(54.88,Shop.cost(Basket));
    }
}