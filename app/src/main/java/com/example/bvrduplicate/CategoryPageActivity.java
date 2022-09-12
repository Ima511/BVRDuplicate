package com.example.bvrduplicate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryPageActivity extends AppCompatActivity {
    Toolbar toolbarCategoryPage;
    RecyclerView recyclerView3;
    TextView tvFeatureThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_page);
        toolbarCategoryPage = (Toolbar) findViewById(R.id.toolBarCategoryPage);
        recyclerView3  = (RecyclerView) findViewById(R.id.recyclerView3_categoryPage);
        tvFeatureThree = (TextView) findViewById(R.id.tvFeature3);



        setSupportActionBar(toolbarCategoryPage);

//
//        ArrayList<DataModelThree> dataModelesThree = QueryUtilsRecThree.extractDataModelThree();
//        recyclerView3.setLayoutManager(new LinearLayoutManager(this));
//
//        RecyclerThreeCategoryAdapter adapter = new RecyclerThreeCategoryAdapter(this,dataModelesThree);
//        recyclerView3.setAdapter(adapter);

        ArrayList<DataModelThree> dataModelesThree = QueryUtilsRecThree.extractDataModelThree();
        recyclerView3.setLayoutManager( new LinearLayoutManager(CategoryPageActivity.this));

        RecyclerThreeCategoryAdapter adapterThree = new RecyclerThreeCategoryAdapter(CategoryPageActivity.this,dataModelesThree);
        recyclerView3.setAdapter(adapterThree);



    }
}