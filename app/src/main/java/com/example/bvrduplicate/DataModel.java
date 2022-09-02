package com.example.bvrduplicate;

import android.widget.ImageView;

import com.squareup.picasso.RequestCreator;

public class DataModel {
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

    String image;
    String productName;

    public DataModel(String image, String productName){

        this.image = image;
        this.productName= productName;

    }


    public DataModel(RequestCreator load, String countertop_microwave_ovens) {

    }
}
