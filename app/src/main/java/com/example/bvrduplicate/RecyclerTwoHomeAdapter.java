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

public class RecyclerTwoHomeAdapter extends RecyclerView.Adapter<RecyclerTwoHomeAdapter.ViewHolder> {

    ArrayList<DataModelTwo> dataModelesTwo = new ArrayList<>();
    Context context ;

    RecyclerTwoHomeAdapter(Context context, ArrayList<DataModelTwo> dataModelesTwo){
        this.context = context;
        this.dataModelesTwo = dataModelesTwo;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_twospan_homei_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataModelTwo listItemTwo = dataModelesTwo.get(position);
        holder.productName.setText(dataModelesTwo.get(position).productName);
        holder.numberOfReviews.setText(dataModelesTwo.get(position).numberOfReview);

        Picasso.get().load(listItemTwo.getImage()).into(holder.productImage);

    }

    @Override
    public int getItemCount() {
       return dataModelesTwo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView productName, numberOfReviews;
        ImageView productImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            productName = (TextView) itemView.findViewById(R.id.textrectwo);
            numberOfReviews = (TextView) itemView.findViewById(R.id.textReviewRec2);
            productImage = (ImageView) itemView.findViewById(R.id.picrectwo);

        }
    }
}
