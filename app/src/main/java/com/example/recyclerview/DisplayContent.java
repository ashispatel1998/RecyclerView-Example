package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayContent extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_content);

        // Get data from intent
        Intent intent = getIntent();
        String title=intent.getStringExtra("title_Id");

        // Toolbar is default ActionBar for this Activity
        toolbar=findViewById(R.id.toolbar);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        setSupportActionBar(toolbar);
        //mTitle.setText(toolbar.getTitle());
        mTitle.setText(title);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        // For Back Arrow -> change in manifest.xml (parentactivity)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

}
}