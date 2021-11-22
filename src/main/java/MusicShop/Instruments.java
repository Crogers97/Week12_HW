package MusicShop;

public abstract class Instruments {
    private double buyingPrice;
    private double sellingPrice;
    private String sound;

    public Instruments(double buyingPrice, double sellingPrice, String sound){
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.sound=sound;
    }


    public String getSound() {
        return sound;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
