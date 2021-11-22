package Instruments;


import MusicShop.ShopInstruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(20.00,40.00, "keys played",88);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(20.00, piano.getBuyingPrice(),0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(40.00, piano.getSellingPrice(),0.0);
    }
    @Test
    public void hasNoOfKeys(){
        assertEquals(88,piano.getNoOfKeys());
    }
    @Test
        public void canPlay(){
            assertEquals("keys played", piano.play(piano) );
        }

    @Test
    public void canGetMarkUpPrice(){
        assertEquals(20.00, piano.calculateMarkup(piano),0.0);
    }


}
