package com.example.bvrduplicate;

import android.widget.ImageView;

import com.squareup.picasso.RequestCreator;

// This class belongs to recycler view 1 of Homepage

public class DataModel {

    String image;
    String productName;


    public DataModel(String image, String productName){

        this.image = image;
        this.productName= productName;

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }






}
