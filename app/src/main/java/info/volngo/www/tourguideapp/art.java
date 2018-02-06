package info.volngo.www.tourguideapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class art extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);
        Context context = this;
        ListView lv = (ListView) findViewById(R.id.list);
        ArrayList<Info> loader = new ArrayList<Info>();
        int[] ArtImages = {R.drawable.bigspringpark, R.drawable.weedenhousemuseum, R.drawable.childrenshistorymuseum};
        String[] ArtInformation = {this.getString(R.string.museumOfArtInfo), this.getString(R.string.weedenHouseMuseumInfo), this.getString(R.string.childrenHistoryMuseumInfo)};
        String[] ArtList = {this.getString(R.string.museumOfArt), this.getString(R.string.weedenHouseMuseum), this.getString(R.string.childrenHistoryMuseum)};
        Info x = new Info(ArtInformation, ArtList, ArtImages);
        loader.add(x);
        lv.setAdapter(new InfoAdapter(this, loader));
    }
}