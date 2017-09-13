package com.ramanujaniss.satya.recyclerviewtest2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by satya on 08-01-2017.
 */
public class TemplatesAdapter  extends RecyclerView.Adapter<TemplatesViewHolder>  {

    Context context;

    String[] template_name;

    int[] template_imageview;

    public TemplatesAdapter(Context c, String[] template_name, int[] template_imageview) {

        this.context = c;

        this.template_name = template_name;

        this.template_imageview = template_imageview;
    }

    @Override
    public TemplatesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_templates, null);

        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        view.setLayoutParams(lp);

        TemplatesViewHolder templatesViewHolder = new TemplatesViewHolder(view);

        return templatesViewHolder;
    }

    @Override
    public void onBindViewHolder(TemplatesViewHolder holder, int position) {

        holder.template_name.setText(template_name[position]);

        holder.template_imageview.setImageResource(template_imageview[position]);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                Toast.makeText(context, "position    " + position, Toast.LENGTH_LONG).show();

               /* Intent intent = new Intent(context, TemplateCreatingActivity.class);
                intent.putExtra("images", template_imageview[position]);
                context.startActivity(intent);*/

            }
        });
    }

    @Override
    public int getItemCount() {
        return template_name.length;
    }


}
