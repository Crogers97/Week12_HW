package Instruments;


import MusicShop.ShopInstruments.Saxaphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    Saxaphone saxaphone;

    @Before
    public void before(){
        saxaphone = new Saxaphone(15.00,20.00, "Saxaphone noise",2);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(15.00, saxaphone.getBuyingPrice(),0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(20.00, saxaphone.getSellingPrice(),0.0);
    }

    @Test
    public void hasNoOfKeys(){
        assertEquals(2,saxaphone.getNoOfKeys());
    }
    @Test
    public void canPlay(){
        assertEquals("Saxaphone noise", saxaphone.play(saxaphone));
    }

    @Test
    public void canGetMarkUpPrice(){
        assertEquals(5.00, saxaphone.calculateMarkup(saxaphone),0.0);
    }


}

