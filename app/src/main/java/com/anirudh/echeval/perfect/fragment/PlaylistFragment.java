package com.anirudh.echeval.perfect.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
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
        GridLayoutManager gridLayout = new GridLayoutManager(getActivity(), 2);
        playlisRecyclerView.setLayoutManager(gridLayout);
        playlisRecyclerView.setHasFixedSize(true);

        PlaylistAdapter mAdapter = new PlaylistAdapter(getActivity(), getTestData());
        playlisRecyclerView.setAdapter(mAdapter);

        return view;
    }

    public List<PlaylistObject> getTestData() {
        List<PlaylistObject> trackList = new ArrayList<PlaylistObject>();
        String[] Lines = Arrays.asList(getResources().getStringArray(R.array.imgList)).toArray(new String[0]);
        for(String val : Lines)
        {
            trackList.add(new PlaylistObject(val));
        }
        return trackList;
    }
}
