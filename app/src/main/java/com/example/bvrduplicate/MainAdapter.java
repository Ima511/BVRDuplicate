package com.example.bvrduplicate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    ArrayList<MainData> dataArrayList;
    Context activity;

    public MainAdapter(ArrayList<MainData> dataArrayList, Context activity) {
        this.dataArrayList = dataArrayList;
        this.activity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity)
                .inflate(R.layout.list_allcategories_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        MainData data = dataArrayList.get(position);



    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        View sampleView;
        ImageView sampleImage;
        TextView sampleText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            sampleView = itemView.findViewById(R.id.viewImgMicrowave);
            sampleImage = itemView.findViewById(R.id.imgMicrowave);
            sampleText = itemView.findViewById(R.id.textView5);


        }
    }
}
