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
        LocationItem HW = new LocationItem("Hauser & Wirth", "DTlA", "Permanent", "Free");
        LocationItem ft = new LocationItem("Fourteenth Factory", "DTlA", "Permanent", "Free");
        LocationItem MOCA = new LocationItem("Museum of Contemporary Art", "DTlA", "Permanent", "Free");
        LocationItem MOT = new LocationItem("Museum of Tolerance", "DTlA", "Permanent", "Free");
        LocationItem MOBR = new LocationItem("Museum of Broken Relationships", "DTlA", "Permanent", "Free");
        LocationItem NHM = new LocationItem("National History Museum", "DTlA", "Permanent", "Free");
        LocationItem LB = new LocationItem("La Brea Tar Pits & Museum", "DTlA", "Permanent", "Free");
        LocationItem CF = new LocationItem("Craft & Folk Art Museum", "DTlA", "Permanent", "Free");
        LocationItem W = new LocationItem("Hollywood Wax Museum", "DTlA", "Permanent", "Free");
        LocationItem G = new LocationItem("GRAMMY Museum at LA Live", "DTlA", "Permanent", "Free");




        locationItemList = new ArrayList<LocationItem>();
        locationItemList.add(moic);
        locationItemList.add(lacma);
        locationItemList.add(broad);
        locationItemList.add(HW);
        locationItemList.add(ft);
        locationItemList.add(MOCA);
        locationItemList.add(MOT);
        locationItemList.add(MOBR);
        locationItemList.add(NHM);
        locationItemList.add(LB);
        locationItemList.add(CF);
        locationItemList.add(W);
        locationItemList.add(G);








    }
}
