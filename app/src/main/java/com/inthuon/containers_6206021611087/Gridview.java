package com.inthuon.containers_6206021611087;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Gridview extends AppCompatActivity implements AdapterView.OnItemClickListener{
    GridView gridView;
    String [] items = {"arsenal", "chelsea", "leicester", "liverpool",
            "manchester_city", "manchester_united" };
    Integer [] logo = {

            R.drawable.arsenal_logo_s, R.drawable.chelsea_logo_s,
            R.drawable.leicester_logo_s, R.drawable.liverpool_logo_s,
            R.drawable.manchester_city_logo_s, R.drawable.manchester_united_logo_s};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);

        CustomAdapter adapter = new CustomAdapter(this,items, logo);
        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter( adapter);
        gridView.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent,View view,int position,long id)
    {
        String itemValue = (String) gridView.getItemAtPosition(position);
        Toast.makeText(this,itemValue, Toast.LENGTH_SHORT).show();
    }
}

class CustomAdapter1 extends ArrayAdapter<String> {
    private final Context context;
    private final String [] items;
    private final Integer [] logo;
    public CustomAdapter1 (Context ctx, String []items, Integer [] logo) {
        super(ctx,R.layout.custom_layout, items);
        this.context = ctx;
        this.items = items;
        this.logo = logo;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.custom_layout,null,true);
        TextView title =(TextView) rowView.findViewById(R.id.textView);
        ImageView image = (ImageView) rowView.findViewById(R.id.imageView);
        title.setText(items[position]);
        image.setImageResource(logo[position]);
        return rowView;
    }
}