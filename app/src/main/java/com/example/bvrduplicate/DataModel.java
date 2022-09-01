package com.example.bvrduplicate;

import android.widget.ImageView;

import com.squareup.picasso.RequestCreator;

public class DataModel {

   int image;
    String productName;

    public DataModel(int image, String productName){

        this.image = image;
        this.productName= productName;

    }


    public DataModel(RequestCreator load, String countertop_microwave_ovens) {

    }
}
