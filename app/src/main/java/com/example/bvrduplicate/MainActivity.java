package com.example.bvrduplicate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    ImageView imageView;

ArrayList<DataModel> arrDataModel = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imgMicrowave);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);


//
//            DataModel dataModel1 = new DataModel(Picasso.get().load("https://d1wi0fywfu3s5z.cloudfront.net/media/countertop-microwave-oven/images/countertop-microwave-oven_transparent-count_ygeZ8Ej.png"),"Countertop Microwave Ovens");
//            DataModel dataModel2 = new DataModel(Picasso.get().load("https://d1wi0fywfu3s5z.cloudfront.net/media/steam-mops/images/Steam-Mops.png"),"Steam Mops");
//            DataModel dataModel3 = new DataModel(Picasso.get().load("https://d1wi0fywfu3s5z.cloudfront.net/media/stand-up-paddleboards/images/stand-up-paddleboards.png"),"Stand-Up Paddleboards");
//            DataModel dataModel4 = new DataModel(Picasso.get().load("https://d1wi0fywfu3s5z.cloudfront.net/media/portable-air-conditioners/images/portable-air-conditioners.png"),"Portable Air Conditioners");
//            DataModel dataModel5 = new DataModel(Picasso.get().load("https://d1wi0fywfu3s5z.cloudfront.net/media/inkjet-printers/images/inkjet-printers.png"),"Inkjet Printers");
//            DataModel dataModel6 = new DataModel(Picasso.get().load("https://d1wi0fywfu3s5z.cloudfront.net/media/computer-monitors/images/computer-monitors.png"),"Computer Monitors");
//            DataModel dataModel7 = new DataModel(Picasso.get().load("https://d1wi0fywfu3s5z.cloudfront.net/media/exercise-bike/images/Exercise_Bike_small.png"),"Exercise Bikes");
//            DataModel dataModel8 = new DataModel(Picasso.get().load("https://d1wi0fywfu3s5z.cloudfront.net/media/laptop/images/laptop_transparent-laptop_small.png"),"Laptops");
//            DataModel dataModel9 = new DataModel(Picasso.get().load("https://d1wi0fywfu3s5z.cloudfront.net/media/video-projector/images/video-projector.png"),"Video Projectors");
//            DataModel dataModel10 = new DataModel(Picasso.get().load("https://d1wi0fywfu3s5z.cloudfront.net/media/air-fryers/images/airfryers_transparent-air-fryers_small.png"),"Air Fryers");
//            DataModel dataModel11 = new DataModel(Picasso.get().load("https://d1wi0fywfu3s5z.cloudfront.net/media/treadmill/images/treadmill_transparent-treadmill_bdfpM2g_small.png"),"Treadmills");
//            DataModel dataModel12 = new DataModel(Picasso.get().load("https://d1wi0fywfu3s5z.cloudfront.net/media/smart-tv/images/smart-tv.png"),"Smart TVs");


        DataModel dataModel1 = new DataModel(R.drawable.a,"Countertop Microwave owen");
        DataModel dataModel2 = new DataModel(R.drawable. b, "Steam Mops");
        DataModel dataModel3 = new DataModel(R.drawable.c, "Stand-Up Paddleboards");
        DataModel dataModel4 = new DataModel(R.drawable.d, "Portable Air Conditioners");
        DataModel dataModel5 = new DataModel(R.drawable. b, "Inkjet Printers");
        DataModel dataModel6 = new DataModel(R.drawable. b, "Computer Monitors");
        DataModel dataModel7 = new DataModel(R.drawable. b, "Exercise Bikes");
        DataModel dataModel8 = new DataModel(R.drawable. b, "Laptops");
        DataModel dataModel9 = new DataModel(R.drawable. b, "Video Projectors");
        DataModel dataModel10 = new DataModel(R.drawable. b, "Air Fryers");
        DataModel dataModel11 = new DataModel(R.drawable. b, "Treadmills");
        DataModel dataModel12 = new DataModel(R.drawable. b, "Smart TVs");

        arrDataModel.add(dataModel1);
        arrDataModel.add(dataModel2);
        arrDataModel.add(dataModel3);
        arrDataModel.add(dataModel4);

        arrDataModel.add(dataModel5);
        arrDataModel.add(dataModel6);
        arrDataModel.add(dataModel7);
        arrDataModel.add(dataModel8);
        arrDataModel.add(dataModel9);
        arrDataModel.add(dataModel10);
        arrDataModel.add(dataModel11);
        arrDataModel.add(dataModel12);

        // added data from arraylist to adapter class.
        RecyclerAllCategoriesAdapter adapter = new RecyclerAllCategoriesAdapter(this,arrDataModel);



        GridLayoutManager layoutManager = new GridLayoutManager(this,4){
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };



//        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//            @Override
//            public int getSpanSize(int position) {
//                if (position > 4)
//                    return 1;
//                else
//                    return 2;
//            }
//        });

        recyclerView.setLayoutManager(layoutManager);



        recyclerView.setAdapter(adapter);


    }


}