package com.example.bvrduplicate;

// This class belongs to recyclerView of Categorypage.

public class DataModelThree {

    int  tvRankValue;
    double tvFeatureOneRatings,
            tvFeatureTwoRatings,
            tvFeatureThreeRatings,
            tvFeatureFourRatings,
            overAllRatings;
    String tvProductHeading,
            tvFeatureOne,
            tvFeatureTwo,
            tvFeatureThree,
            tvFeatureFour,
            tvPros1,tvPros2,
            tvPros3,
            tvCons1,
            tvReviews,
            ivProductImageCategoryPage;



    public DataModelThree(int tvRankValue,
                          String tvProductHeading,
                          String tvFeatureOne,
                          String tvFeatureTwo,
                          String tvFeatureThree,
                          String tvFeatureFour,
                          String tvReviews,
                          String ivProductImageCategoryPage,
                          double tvFeatureOneRatings,
                          double tvFeatureTwoRatings,
                          double tvFeatureThreeRatings,
                          double tvFeatureFourRatings,
                          double overAllRatings,
                          String tvPros1,
                          String tvPros2,
                          String tvPros3,
                          String tvCons1
                          ) {
        this.tvRankValue = tvRankValue;
        this.tvProductHeading = tvProductHeading;
        this.tvFeatureOne = tvFeatureOne;
        this.tvFeatureTwo = tvFeatureTwo;
        this.tvFeatureThree = tvFeatureThree;
        this.tvFeatureFour = tvFeatureFour;
        this.tvPros1 = tvPros1;
        this.tvPros2 = tvPros2;
        this.tvPros3 = tvPros3;
        this.tvCons1 = tvCons1;
        this.tvReviews = tvReviews;
        this.tvFeatureOneRatings = tvFeatureOneRatings;
        this.tvFeatureTwoRatings = tvFeatureTwoRatings;
        this.tvFeatureThreeRatings = tvFeatureThreeRatings;
        this.tvFeatureFourRatings  = tvFeatureFourRatings;
        this.overAllRatings = overAllRatings;
        this.ivProductImageCategoryPage = ivProductImageCategoryPage;
    }



    public int getTvRankValue() {
        return tvRankValue;
    }

    public void setTvRankValue(int tvRankValue) {
        this.tvRankValue = tvRankValue;
    }

    public String getTvProductHeading() {
        return tvProductHeading;
    }

    public void setTvProductHeading(String tvProductHeading) {
        this.tvProductHeading = tvProductHeading;
    }
//
    public String getTvFeatureOne() {
        return tvFeatureOne;
    }

    public void setTvFeatureOne(String tvFeatureOne) {
        this.tvFeatureOne = tvFeatureOne;
    }

    public String getTvFeatureTwo() {
        return tvFeatureTwo;
    }

    public void setTvFeatureTwo(String tvFeatureTwo) {
        this.tvFeatureTwo = tvFeatureTwo;
    }

    public String getTvFeatureThree() {
        return tvFeatureThree;
    }

    public void setTvFeatureThree(String tvFeatureThree) {
        this.tvFeatureThree = tvFeatureThree;
    }

    public String getTvFeatureFour() {
        return tvFeatureFour;
    }

    public void setTvFeatureFour(String tvFeatureFour) {
        this.tvFeatureFour = tvFeatureFour;
    }
//
    public String getTvPros1() {
        return tvPros1;
    }

    public void setTvPros1(String tvPros1) {
        this.tvPros1 = tvPros1;
    }

    public String getTvPros2() {
        return tvPros2;
    }

    public void setTvPros2(String tvPros2) {
        this.tvPros2 = tvPros2;
    }

    public String getTvPros3() {
        return tvPros3;
    }

    public void setTvPros3(String tvPros3) {
        this.tvPros3 = tvPros3;
    }
//
//    public String getTvCons1() {
//        return tvCons1;
//    }
//
//    public void setTvCons1(String tvCons1) {
//        this.tvCons1 = tvCons1;
//    }
//
    public double getTvFeatureOneRatings() {
        return tvFeatureOneRatings;
    }

    public void setTvFeatureOneRatings(double tvFeatureOneRatings) {
        this.tvFeatureOneRatings = tvFeatureOneRatings;
    }

    public double getTvFeatureTwoRatings() {
        return tvFeatureTwoRatings;
    }

    public void setTvFeatureTwoRatings(double tvFeatureTwoRatings) {
        this.tvFeatureTwoRatings = tvFeatureTwoRatings;
    }

    public double getTvFeatureThreeRatings() {
        return tvFeatureThreeRatings;
    }

    public void setTvFeatureThreeRatings(double tvFeatureThreeRatings) {
        this.tvFeatureThreeRatings = tvFeatureThreeRatings;
    }

    public double getTvFeatureFourRatings() {
        return tvFeatureFourRatings;
    }



    public double getOverAllRatings() {
        return overAllRatings;
    }

    public void setOverAllRatings(double overAllRatings) {
        this.overAllRatings = overAllRatings;
    }
    public String getTvReviews() {
        return tvReviews;
    }

    public void setTvReviews(String tvReviews) {
        this.tvReviews = tvReviews;
    }

    public String getIvProductImageCategoryPage() {
        return ivProductImageCategoryPage;
    }

    public void setIvProductImageCategoryPage(String ivProductImageCategoryPage) {
        this.ivProductImageCategoryPage = ivProductImageCategoryPage;
    }
}
