package io.biv.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    private BeerExpert mBeerExpert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        // Get reference to the TextView
        TextView brands = (TextView)findViewById(R.id.brands);
        // Get reference to the Spinnder
        Spinner color = (Spinner)findViewById(R.id.color);
        // Get selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandNames = mBeerExpert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand: brandNames) {
            brandsFormatted.append(brand).append("\n");
        }

        // Display beers
        brands.setText(brandsFormatted);
    }
}
