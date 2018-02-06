package info.volngo.www.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToArt(View view){
        Intent x = new Intent(this,art.class);
        startActivity(x);
    }
    public void goToNature(View view){
        Intent x = new Intent(this,nature.class);
        startActivity(x);
    }
    public void goToUrban(View view){
        Intent x = new Intent(this,urban.class);
        startActivity(x);
    }
    public void goToRestaurants(View view){
        Intent x = new Intent(this, resturants.class);
        startActivity(x);
    }


}
