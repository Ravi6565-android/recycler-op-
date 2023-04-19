package com.example.recyclerviewop;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class my_adapter extends RecyclerView.Adapter<my_adapter.Userholder> {
  Context context;
    ArrayList<Integer> image;
    ArrayList<String> typesOfshayri;
    public my_adapter(Context context, ArrayList<Integer> image, ArrayList<String> typesOfshayri) {

       this.typesOfshayri =  typesOfshayri;
       this.image =  image;
       this.context =  context;
    }

    @NonNull
    @Override
    public my_adapter.Userholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_for_recycler,parent,false);
        Userholder userholder=new Userholder(view);

        return userholder;
    }

    @Override
    public void onBindViewHolder(@NonNull my_adapter.Userholder holder, int position) {

            holder.imageView.setImageResource(image.get(position));
            holder.textView.setText(typesOfshayri.get(position));
    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public class Userholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public Userholder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.r_item_image);
            textView=itemView.findViewById(R.id.r_item_text);
        }
    }
}
