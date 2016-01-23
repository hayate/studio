package io.biv.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrea on 1/23/16.
 */
public class BeerExpert {

    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
