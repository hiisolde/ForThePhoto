package com.example.isoldealfaro.cs499;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SearchResults extends AppCompatActivity {

    private List<LocationItem> locationItemList;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        initLocationItems();

        listView = (ListView) findViewById(R.id.locationItemListView);

        LocationItemArrayAdapter liaa = new LocationItemArrayAdapter(this, R.layout.listview_location_view, locationItemList);

        listView.setAdapter(liaa);
    }

    private void initLocationItems() {

        LocationItem moic = new LocationItem("Museum of Ice Cream", "DTLA", "Now - August 2017", "$30");
        LocationItem lacma = new LocationItem("LACMA", "DTLA", "Permanent", "~$15");
        LocationItem broad = new LocationItem("The Broad", "DTLA", "Permanent", "Free");

        locationItemList = new ArrayList<LocationItem>();
        locationItemList.add(moic);
        locationItemList.add(lacma);
        locationItemList.add(broad);
    }
}
