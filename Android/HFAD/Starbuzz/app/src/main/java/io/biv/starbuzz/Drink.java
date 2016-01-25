package io.biv.starbuzz;

/**
 * Created by andrea on 1/26/16.
 */
public class Drink {
    private String mName;
    private String mDescription;
    private int mImageResourceId;

    // drink is an array of Drinks
    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with a steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    // Each Drink has a name, description and an image resource
    private Drink(String name, String description, int imageResourceId) {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String toString() {
        return this.mName;
    }
}
