package com.praktek.pcs_recyclerview_0299;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ListViewHolder> {

    private ArrayList<com.praktek.pcs_recyclerview_0299.Movie> listMovie;

    public MovieAdapter(ArrayList<com.praktek.pcs_recyclerview_0299.Movie> listMovie) {
        this.listMovie = listMovie;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ListViewHolder holder, int position) {
        com.praktek.pcs_recyclerview_0299.Movie mov = listMovie.get(position);

        holder.txtTitle.setText(mov.getTitle());
        holder.txtYear.setText(mov.getYear());
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle;
        TextView txtYear;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.findViewById(R.id.txtTitle);
            itemView.findViewById(R.id.txtYear);
        }
    }
}
