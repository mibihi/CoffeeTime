package tut.mib.com.coffeetime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINK_NUM = "drinkno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        int drinkno = (Integer) getIntent().getExtras().get(EXTRA_DRINK_NUM);
        Drink drink = Drink.drinks[drinkno];

        TextView tvname = (TextView) findViewById(R.id.name);
        TextView tvdesc = (TextView) findViewById(R.id.description);
        ImageView photo = (ImageView) findViewById(R.id.photo);
        tvname.setText(drink.getName());
        tvdesc.setText(drink.getDescription());
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
}
