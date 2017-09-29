package tut.mib.com.coffeetime;

/**
 * Created by mibihi on 9/29/17.
 */

public class Drink {
private String name;
private String description;
private  int   imageResourceId;

    //drinks is an array of Drinks
    public static final Drink[] drinks = {
            new Drink("Latte","A Couple of Espresso shots with Steamed Milk",R.drawable.latte),
            new Drink("Cappucino","Espresso ,Hot Milk and Steamed Milk Foam",R.drawable.cappuccino),
            new Drink("Filter","Highest Quality beans Roasted and Brewed fresh ",R.drawable.filter)

};
    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
