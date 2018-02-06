package info.volngo.www.tourguideapp;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class resturants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturants);
        ListView lv=(ListView) findViewById(R.id.list);
        int [] ArtImages={R.drawable.anaheimchili,R.drawable.brokeneggcafe,R.drawable.nicksristorante,};
        String[] ArtInformation={this.getString(R.string.chiliInfo),this.getString(R.string.brokenEggInfo),this.getString(R.string.nicksRistoranteInfo)};
        String [] ArtList={this.getString(R.string.chili),this.getString(R.string.brokenEgg),this.getString(R.string.nicksRistorante)};
        Info x = new Info(ArtInformation,ArtList,ArtImages);
        ArrayList<Info> loader = new ArrayList<Info>();
        loader.add(x);
        lv.setAdapter(new InfoAdapter(this,loader));
    }
}