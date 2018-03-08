package com.anirudh.echeval.perfect.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anirudh.echeval.perfect.R;
import com.anirudh.echeval.perfect.entities.PlaylistObject;

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
    public void onBindViewHolder(PlaylistViewHolder holder, int position) {
        PlaylistObject playlistObject = playlists.get(position);
        //Picasso.with(this.context).load("http://perfect4all.com/wp-content/uploads/2018/01/PFTP-WR300.jpg").into(holder.playlistCover);
        holder.playlistCover.setImageResource(playlistObject.photoId);
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
}
