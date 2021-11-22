import MusicShop.Shop;
import MusicShop.ShopInstruments.Guitar;
import MusicShop.ShopInstruments.ISell;
import MusicShop.ShopInstruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;
    private ISell guitar;
    private ISell piano;

    @Before
    public void before() {
        shop= new Shop();
        guitar = new Guitar(20.00,30.00,"Strum",6);
        piano= new Piano(40.00,50.00,"keys played", 88);

        shop.addStock(guitar);
    }

    @Test
    public void canAddStock(){
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canRemoveStock(){
        shop.removestock(guitar);
        assertEquals(0, shop.getStock());
    }

}
