package com.example.isoldealfaro.cs499;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.content.Intent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.places.Places;

import android.support.v4.app.FragmentActivity;

public class MainMenu extends FragmentActivity implements OnConnectionFailedListener {

    //private GoogleApiClient mGoogleApiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        Button topSearch = (Button) findViewById(R.id.topsearch);
        topSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent searchIntent = new Intent(view.getContext(), SearchResults.class);
                startActivityForResult(searchIntent, 0);
            }

        });

        ImageButton imageExample = (ImageButton) findViewById(R.id.mic);
        imageExample.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent exIntent = new Intent(view.getContext(), LocationExample.class);
                startActivityForResult(exIntent, 0);
            }

        });

        ImageButton bottomSearch = (ImageButton) findViewById(R.id.searchbutton);
        bottomSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent searchIntent = new Intent(view.getContext(), SearchScreen.class);
                startActivityForResult(searchIntent, 0);
            }

        });

        ImageButton bookmark = (ImageButton) findViewById(R.id.bookmarkbutton);
        bookmark.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent bookmarkIntent = new Intent(view.getContext(), BookmarksScreen.class);
                startActivityForResult(bookmarkIntent, 0);
            }

        });
    }

    @Override
    public void onConnectionFailed(ConnectionResult result) {
        // An unresolvable error has occurred and a connection to Google APIs
        // could not be established. Display an error message, or handle
        // the failure silently

        System.out.print("Connection failed");
    }

}
