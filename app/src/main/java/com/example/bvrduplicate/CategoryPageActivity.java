package com.example.bvrduplicate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class CategoryPageActivity extends AppCompatActivity {
    Toolbar toolbarCategoryPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_page);
        toolbarCategoryPage = (Toolbar) findViewById(R.id.toolBarCategoryPage);

        setSupportActionBar(toolbarCategoryPage);





    }
}