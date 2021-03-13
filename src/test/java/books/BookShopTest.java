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
}