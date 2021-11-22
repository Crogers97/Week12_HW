package MusicShop.ShopInstruments;

import MusicShop.Instruments;

public class Guitar extends Instruments implements IPlay,ISell{
    private int noOfStrings;

    public Guitar(double buyingPrice, double sellingPrice, String sound, int noOfStrings) {
        super(buyingPrice, sellingPrice, sound);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
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
