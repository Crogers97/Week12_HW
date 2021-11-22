package Instruments;

import MusicShop.Instruments;
import MusicShop.ShopInstruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before(){
        drum = new Drum(5.50,10.00, "Bang", 2);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(5.50, drum.getBuyingPrice(),0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(10.00, drum.getSellingPrice(),0.0);
    }

    @Test
    public void hasNoOfSymbols(){
        assertEquals(2,drum.getNoOfSymbols());
    }

    @Test
    public void canPlay(){
        assertEquals("Bang", drum.play(drum));
    }

    @Test
    public void canGetMarkUpPrice(){
        assertEquals(4.50, drum.calculateMarkup(drum),0.0);
    }

}
