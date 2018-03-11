package com.anirudh.echeval.perfect.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anirudh.echeval.perfect.R;
import com.anirudh.echeval.perfect.entities.SongObject;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongViewHolder>{

    private Context context;
    private List<SongObject> allSongs;

    public SongAdapter(Context context, List<SongObject> allSongs) {
        this.context = context;
        this.allSongs = allSongs;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.song_list_layout, parent, false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        SongObject songs = allSongs.get(position);
        holder.songTitle.setText(songs.getSongTitle());
        holder.songAuthor.setText(songs.getSongAuthor());
    }

    @Override
    public int getItemCount() {
        return allSongs.size();
    }

}
