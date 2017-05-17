package com.example.isoldealfaro.cs499;

/**
 * Created by isoldealfaro on 5/15/17.
 */

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class LocationItemArrayAdapter extends ArrayAdapter<LocationItem> {

    private Context context;
    private int layoutResource;
    private List<LocationItem> locationItemList;

    public LocationItemArrayAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<LocationItem> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layoutResource = resource;
        this.locationItemList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(layoutResource, parent, false);

        TextView textView = (TextView) view.findViewById(R.id.locationItemTextView);
        textView.setText(locationItemList.get(position).getName());

        return view;
    }
}
