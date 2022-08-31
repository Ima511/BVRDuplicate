package com.example.bvrduplicate;

import android.view.View;

public class MainData {

    public String sampleText;
    public int sampleImage;
    public View samplView;

    public MainData(String sampleText, int sampleImage, View samplView) {
        this.sampleText = sampleText;
        this.sampleImage = sampleImage;
        this.samplView = samplView;
    }

    public String getSampleText() {
        return sampleText;
    }

    public void setSampleText(String sampleText) {
        this.sampleText = sampleText;
    }

    public int getSampleImage() {
        return sampleImage;
    }

    public void setSampleImage(int sampleImage) {
        this.sampleImage = sampleImage;
    }

    public View getSamplView() {
        return samplView;
    }

    public void setSamplView(View samplView) {
        this.samplView = samplView;
    }
}
