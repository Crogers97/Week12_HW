package MusicShop;

import MusicShop.ShopInstruments.ISell;

import java.util.ArrayList;

public class Shop implements ISell {
    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public void addStock(ISell stockToAdd){
        this.stock.add(stockToAdd);

    }

    public void removestock(ISell stockToRemove){
        this.stock.remove(stockToRemove);
    }

    public int getStock(){
        return this.stock.size();
    }







    @Override
    public double calculateMarkup(Instruments instruments) {
        return 0;
    }
}
