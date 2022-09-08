package com.example.bvrduplicate;

// This Adapter class belong to recyclerView1 (All categories product portion)

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerAllCategoriesAdapter extends RecyclerView.Adapter<RecyclerAllCategoriesAdapter.ViewHolder> {



    ArrayList<DataModel> dataModels;
    Context context;
    RecyclerAllCategoriesAdapter(Context context, ArrayList<DataModel> dataModels){
        this.context = context;
        this.dataModels = dataModels;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      View view =  LayoutInflater.from(context).inflate(R.layout.list_allcategories_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            final DataModel listItem = dataModels.get(position);
        holder.sampleText.setText(dataModels.get(position).productName);

       try{
           Picasso.get().load(listItem.getImage()).into(holder.pic);
       } catch (Exception e) {
           e.printStackTrace();
       }


    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView sampleText;
        ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            sampleText = (TextView) itemView.findViewById(R.id.textView5);
            pic = (ImageView) itemView.findViewById(R.id.imgMicrowave);

        }
    }
}
