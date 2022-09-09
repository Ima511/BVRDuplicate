package com.example.bvrduplicate;

// This class belongs to recyclerView 2 of Homepage

public class DataModelTwo {

    String productName, numberOfReview;
    String image;

    // Constructor


    public DataModelTwo(String productName, String numberOfReview, String image) {
        this.productName = productName;
        this.numberOfReview = numberOfReview;
        this.image = image;
    }

    // Getter and Setter


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getNumberOfReview() {
        return numberOfReview;
    }

    public void setNumberOfReview(String numberOfReview) {
        this.numberOfReview = numberOfReview;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
