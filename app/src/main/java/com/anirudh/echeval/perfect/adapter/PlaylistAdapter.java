package com.anirudh.echeval.perfect.adapter;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anirudh.echeval.perfect.R;
import com.anirudh.echeval.perfect.entities.PlaylistObject;

import java.util.ArrayList;
import java.util.List;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistViewHolder>{

    private static final String TAG = PlaylistAdapter.class.getSimpleName();

    private Context context;
    private List<PlaylistObject> playlists;

    public PlaylistAdapter(Context context, List<PlaylistObject> playlists) {
        this.context = context;
        this.playlists = playlists;
    }

    @Override
    public PlaylistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.play_list_layout, parent, false);
        return new PlaylistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaylistViewHolder holder, final int position) {
        PlaylistObject playlistObject = playlists.get(position);
        //Picasso.with(this.context).load("http://perfect4all.com/wp-content/uploads/2018/01/PFTP-WR300.jpg").into(holder.playlistCover);
        holder.playlistCover.setImageResource(playlistObject.photoId);
        holder.amazonBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Uri> amazonUrls = amazonUrls();
                new Activity().startActivity(new Intent(Intent.ACTION_VIEW, amazonUrls.get(position)));
            }
        });
    }

    @Override
    public int getItemCount() {
        return playlists.size();
    }

    /*public class ImageLoadTask extends AsyncTask<Void, Void, Bitmap> {

        private String url;
        private ImageView imageView;

        public ImageLoadTask(String url, ImageView imageView) {
            this.url = url;
            this.imageView = imageView;
        }

        @Override
        protected Bitmap doInBackground(Void... params) {
            try {
                URL urlConnection = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) urlConnection
                        .openConnection();
                connection.setDoInput(true);
                connection.connect();
                InputStream input = connection.getInputStream();
                Bitmap myBitmap = BitmapFactory.decodeStream(input);
                return myBitmap;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Bitmap result) {
            super.onPostExecute(result);
            imageView.setImageBitmap(result);
        }
    }*/
    public List<Uri> amazonUrls()
    {
        List<Uri> amazonUrls = new ArrayList<>();
        amazonUrls.add(Uri.parse("https://www.amazon.in/dp/B07B27VGVP/"));
        amazonUrls.add(Uri.parse("https://www.amazon.in/dp/B07B29ZSFJ/"));
        amazonUrls.add(Uri.parse("https://www.amazon.in/Perfect-PFTP-WR300-router-supported/dp/B07B27ZL7L/"));
        amazonUrls.add(Uri.parse("https://www.amazon.in/dp/B07B21QRPN/"));
        amazonUrls.add(Uri.parse("https://www.amazon.in/Perfect-PFT-WA300-Mbps-Adapter/dp/B07B24SZR8/"));
        return amazonUrls;
    }
}
