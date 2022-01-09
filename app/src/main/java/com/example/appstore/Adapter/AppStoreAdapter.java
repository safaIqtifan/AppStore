package com.example.appstore.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appstore.Model.AppStoreModel;
import com.example.appstore.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class AppStoreAdapter extends RecyclerView.Adapter<AppStoreAdapter.ViewHolder>{

    Context context;
    ArrayList<AppStoreModel> data;

    public AppStoreAdapter(Context context, ArrayList<AppStoreModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public AppStoreAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View root = LayoutInflater.from(context).inflate(R.layout.item_app_store, parent, false);

        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull AppStoreAdapter.ViewHolder holder, int position) {

        holder.id.setText(String.valueOf(data.get(position).getId()));
        holder.title.setText(data.get(position).getTitle());
        holder.subTitle.setText(data.get(position).getTitle());
        holder.rate.setText(String.valueOf(data.get(position).getRate()));
        holder.image.setImageResource(data.get(position).getImg());

        holder.dotsBtn.setOnClickListener(v -> {
            PopupMenu popupMenu = new PopupMenu(context,holder.dotsBtn);
            popupMenu.getMenuInflater().inflate(R.menu.main_menu,popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    int id = menuItem.getItemId();
                    switch (id) {
                        case R.id.save:
                            Toast.makeText(context, "Save", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.share:
                            Toast.makeText(context, "share", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.setting:
                            Toast.makeText(context, "settings", Toast.LENGTH_SHORT).show();
                            break;
                    }
                    return false;
                }
            });

            popupMenu.show();
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView id;
        TextView title;
        TextView subTitle;
        TextView rate;
        ImageView image;
        FloatingActionButton dotsBtn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            id = itemView.findViewById(R.id.tvId);
            title = itemView.findViewById(R.id.tvTitle);
            subTitle = itemView.findViewById(R.id.tvSubTitle);
            rate = itemView.findViewById(R.id.tvRate);
            image = itemView.findViewById(R.id.imageView);
            dotsBtn = itemView.findViewById(R.id.dotBtn);

        }
    }
}
