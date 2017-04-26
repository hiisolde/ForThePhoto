package com.example.isoldealfaro.cs499;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ImageButton imageExample = (ImageButton) findViewById(R.id.mic);
        imageExample.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent exIntent = new Intent(view.getContext(), LocationItem.class);
                startActivityForResult(exIntent, 0);
            }

        });

        ImageButton search = (ImageButton) findViewById(R.id.searchbutton);
        search.setOnClickListener(new View.OnClickListener() {
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

}
