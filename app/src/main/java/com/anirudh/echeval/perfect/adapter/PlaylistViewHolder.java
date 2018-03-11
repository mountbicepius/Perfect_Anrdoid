package com.anirudh.echeval.perfect.adapter;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.anirudh.echeval.perfect.R;


public class PlaylistViewHolder extends RecyclerView.ViewHolder{

    public CardView mainView;
    public ImageView playlistCover;
    public ImageButton amazonBuy;

    public PlaylistViewHolder(View itemView) {
        super(itemView);
        mainView = itemView.findViewById(R.id.main_view);
        playlistCover = itemView.findViewById(R.id.play_list_cover);
        amazonBuy = itemView.findViewById(R.id.minus);

    }
}
