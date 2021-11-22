package MusicShop.ShopInstruments;

import MusicShop.Instruments;

public class Piano extends Instruments implements IPlay,ISell {

    private int noOfKeys;

    public Piano(double buyingPrice, double sellingPrice, String sound ,int noOfKeys) {
        super(buyingPrice, sellingPrice, sound);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }


    @Override
    public String play(Instruments instruments) {
        return instruments.getSound();
    }

    @Override
    public double calculateMarkup(Instruments instruments) {
        return getSellingPrice()-getBuyingPrice();
    }
}
