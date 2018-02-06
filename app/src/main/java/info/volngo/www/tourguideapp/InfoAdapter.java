package info.volngo.www.tourguideapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class InfoAdapter extends BaseAdapter{
    String [] prgmName;
    String[] prgmInfo;
    Context context;
    int [] prgmImage;
    private static LayoutInflater inflater=null;
    public InfoAdapter(Context mainActivity, ArrayList<Info> info) {
        // TODO Auto-generated constructor stub
        prgmName=info.get(0).getmName();
        context=mainActivity;
        prgmInfo = info.get(0).getmInfo();
        prgmImage=info.get(0).getmImages();
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return prgmName.length;
    }
    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }
    public class Holder
    {
        TextView tv;
        TextView tv2;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.list_item, null);
        holder.tv=(TextView) rowView.findViewById(R.id.textView1);
        holder.tv2=(TextView)rowView.findViewById(R.id.textView2);
        holder.img=(ImageView) rowView.findViewById(R.id.imageView1);
        holder.tv.setText(prgmName[position]);
        holder.tv2.setText(prgmInfo[position]);
        holder.img.setImageResource(prgmImage[position]);
        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, prgmInfo[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }
}