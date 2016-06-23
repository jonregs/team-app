package com.rega.teamup;

/**
 * Created by Jon on 6/21/2016.
 */
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.rega.teamup.model.Flower;

import java.util.List;

public class FlowerArrayAdapter extends ArrayAdapter<Flower> {

    private Context context;
    private List<Flower> flowerList;

    public FlowerArrayAdapter(Context context, int resource, List<Flower> objects) {
        super(context, resource, objects);
        this.context = context;
        this.flowerList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_flower, null);


        Flower flower = flowerList.get(position);
        TextView tv = (TextView) view.findViewById(R.id.textView1);
        tv.setText(flower.getName());


        return view;
    }

}