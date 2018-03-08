package com.anirudh.echeval.perfect.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.anirudh.echeval.perfect.R;
import com.anirudh.echeval.perfect.adapter.PlaylistAdapter;
import com.anirudh.echeval.perfect.entities.PlaylistObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlaylistFragment extends Fragment {


    public PlaylistFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_playlist, container, false);

        RecyclerView playlisRecyclerView = (RecyclerView)view.findViewById(R.id.your_play_list);
        playlisRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        playlisRecyclerView.setHasFixedSize(true);

        PlaylistAdapter mAdapter = new PlaylistAdapter(getActivity(), getTestData());
        playlisRecyclerView.setAdapter(mAdapter);

        return view;
    }

    public List<PlaylistObject> getTestData() {
        List<PlaylistObject> trackList = new ArrayList<PlaylistObject>();
          trackList.add(new PlaylistObject(R.drawable.pftes8));
        trackList.add(new PlaylistObject(R.drawable.pftgs8));
        trackList.add(new PlaylistObject(R.drawable.pftpwr300));
        trackList.add(new PlaylistObject(R.drawable.pftwa150));
        trackList.add(new PlaylistObject(R.drawable.pftwa300));
        return trackList;
    }
}
