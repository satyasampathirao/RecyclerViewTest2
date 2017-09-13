package com.ramanujaniss.satya.recyclerviewtest2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by satya on 08-01-2017.
 */
public class TemplatesViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener  {


    ImageView template_imageview;

    TextView template_name;

    ItemClickListener itemClickListener;

    public TemplatesViewHolder(View itemView) {

        super(itemView);



        template_imageview = (ImageView) itemView.findViewById(R.id.template_imageview);

        template_name = (TextView) itemView.findViewById(R.id.template_name);





        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }
}
