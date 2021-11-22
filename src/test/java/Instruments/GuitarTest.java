package Instruments;

import MusicShop.ShopInstruments.Drum;
import MusicShop.ShopInstruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(6.50,12.00,"Strum",6);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(6.50, guitar.getBuyingPrice(),0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(12.00, guitar.getSellingPrice(),0.0);
    }
    @Test
    public void hasnoOfStrings(){
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Strum", guitar.play(guitar));
    }

    @Test
    public void canGetMarkUpPrice(){
        assertEquals(5.50, guitar.calculateMarkup(guitar),0.0);
    }

}
