package info.volngo.www.tourguideapp;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
public class urban extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urban);
         String[] UrbanInformation = {getResources().getString(R.string.USspacecamp),getResources().getString(R.string.USspacecampinfo),getResources().getString(R.string.railwayinfo)};
        int[] UrbanImages = {R.drawable.usspacerocket, R.drawable.usspacecamp, R.drawable.southernrailwaydsystemdepot};
        String[] UrbanList = {getResources().getString(R.string.USspacerocket),getResources().getString(R.string.USspacecamp),getResources().getString(R.string.railway)};
        Context context = this;
        ListView lv = (ListView) findViewById(R.id.list);
        Info x = new Info(UrbanInformation,UrbanList,UrbanImages);
        ArrayList<Info> loader = new ArrayList<Info>();
        loader.add(x);
        lv.setAdapter(new InfoAdapter(this,loader ));
    }
}