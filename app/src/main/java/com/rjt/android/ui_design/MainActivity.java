package com.rjt.android.ui_design;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.widget.EditText;

import static android.graphics.Color.GRAY;

public class MainActivity extends AppCompatActivity {
    SearchView mSearchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("");

        setSupportActionBar(toolbar);
       // getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationIcon(R.drawable.simicart2);
        mSearchView = findViewById(R.id.searchView);

        mSearchView.setQueryHint("Search");
      //  mSearchView.setBackground("#00");

//        SearchView mSearchView = findViewById(R.id.searchView);
//        mSearchView.setLayoutParams(new ActionBar.LayoutParams(Gravity.CENTER));
    }
}
