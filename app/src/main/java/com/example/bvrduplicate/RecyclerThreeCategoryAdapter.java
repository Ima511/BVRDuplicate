package com.example.bvrduplicate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerThreeCategoryAdapter extends RecyclerView.Adapter<RecyclerThreeCategoryAdapter.ViewHolder> {

    ArrayList<DataModelThree> dataModelesThree = new ArrayList<>();
    Context context;

    RecyclerThreeCategoryAdapter(Context context, ArrayList<DataModelThree>dataModelesThree ){
        this.context = context;
        this.dataModelesThree = dataModelesThree;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_categorypage_prodcut,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final DataModelThree listItemThree = dataModelesThree.get(position);
        holder.tvRankValue.setText(dataModelesThree.get(position).tvRankValue);
        holder.tvProductHeading.setText(dataModelesThree.get(position).tvProductHeading);
        holder.tvFeatureOne.setText(dataModelesThree.get(position).tvFeatureOne);
        holder.tvFeatureTwo.setText(dataModelesThree.get(position).tvFeatureTwo);
        holder.tvFeatureThree.setText(dataModelesThree.get(position).tvFeatureThree);
        holder.tvFeatureFour.setText(dataModelesThree.get(position).tvFeatureFour);
        holder.tvPros1.setText(dataModelesThree.get(position).tvPros1);
        holder.tvPros2.setText(dataModelesThree.get(position).tvPros2);
        holder.tvPros3.setText(dataModelesThree.get(position).tvPros3);
        holder.tvCons1.setText(dataModelesThree.get(position).tvCons1);
        holder.tvReviews.setText(dataModelesThree.get(position).tvReviews);


        Picasso.get().load(listItemThree.getIvProductImageCategoryPage()).into(holder.ivProductImageCategoryPage);

    }

    @Override
    public int getItemCount() {
        return dataModelesThree.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvRankValue, tvProductHeading, tvFeatureOne, tvFeatureTwo,
                tvFeatureThree, tvFeatureFour,tvPros1,tvPros2,tvPros3,tvCons1,tvReviews,
                tvFeatureOneRatings, tvFeatureTwoRatings, tvFeatureThreeRatings,tvFeatureFourRatings;
        ImageView ivProductImageCategoryPage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvRankValue = itemView.findViewById(R.id.tvRankValue);
            tvProductHeading = itemView.findViewById(R.id.tvProductHeading);
            tvFeatureOne = itemView.findViewById(R.id.tvFeatureOne);
            tvFeatureTwo = itemView.findViewById(R.id.tvFeatureTwo);
            tvFeatureThree = itemView.findViewById(R.id.tvFeature3);
            tvFeatureFour = itemView.findViewById(R.id.tvFeature4);
            tvPros1 = itemView.findViewById(R.id.tvPros1);
            tvPros2 = itemView.findViewById(R.id.tvPros2);
            tvPros3 = itemView.findViewById(R.id.tvPros3);
            tvCons1 = itemView.findViewById(R.id.tvCons1);
            tvReviews = itemView.findViewById(R.id.tvReviews);
            tvFeatureOneRatings = itemView.findViewById(R.id.tvFeatureOneRatings);
            tvFeatureTwoRatings = itemView.findViewById(R.id.tvFeatureTwoRatings);
            tvFeatureThreeRatings = itemView.findViewById(R.id.tvFeaturesRatings3);
            tvFeatureFourRatings = itemView.findViewById(R.id.tvFeaturesRatings4);
            ivProductImageCategoryPage = itemView.findViewById(R.id.ivProductImageCategoryPage);



        }
    }
}
