package MusicShop.ShopInstruments;

import MusicShop.Instruments;

public class Drum extends Instruments implements IPlay, ISell{
    private int noOfSymbols;

    public Drum(double buyingPrice, double sellingPrice, String sound, int noOfSymbols) {
        super(buyingPrice, sellingPrice, sound);

        this.noOfSymbols=noOfSymbols;
    }

    public int getNoOfSymbols() {
        return noOfSymbols;
    }

    @Override
    public String play(Instruments instruments) {
        return instruments.getSound();
    }

    @Override
    public double calculateMarkup(Instruments instruments) {
        return instruments.getSellingPrice()- instruments.getBuyingPrice();
    }
}
