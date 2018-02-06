package info.volngo.www.tourguideapp;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class nature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);
        ListView lv=(ListView) findViewById(R.id.list);
        int [] ArtImages={R.drawable.bigspringpark,R.drawable.botanicalgarden,R.drawable.burrittonthemountain,R.drawable.montesanomountain,R.drawable.montesanonaturepreserve};
        String[] ArtInformation={this.getString(R.string.bigSpringParkInfo),this.getString(R.string.botanicalGardenInfo),this.getString(R.string.BurrittInfo)};
        String [] ArtList={this.getString(R.string.bigSpringPark),this.getString(R.string.botanicalGarden),this.getString(R.string.Burritt)};
        Info x = new Info(ArtInformation,ArtList,ArtImages);
        ArrayList<Info> loader = new ArrayList<Info>();
        loader.add(x);
        lv.setAdapter(new InfoAdapter(this,loader));
    }
}
