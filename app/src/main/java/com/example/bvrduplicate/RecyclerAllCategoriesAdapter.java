package com.example.bvrduplicate;

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

    ArrayList<DataModel> arrDataModel;
    Context context;
    RecyclerAllCategoriesAdapter(Context context, ArrayList<DataModel> arrDataModel){
        this.context = context;
        this.arrDataModel = arrDataModel;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      View view =  LayoutInflater.from(context).inflate(R.layout.list_allcategories_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            final DataModel listItem = arrDataModel.get(position);
        holder.sampleText.setText(arrDataModel.get(position).productName);

       Picasso.get().load(listItem.getImage()).into(holder.pic);



    }

    @Override
    public int getItemCount() {
        return arrDataModel.size();
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
