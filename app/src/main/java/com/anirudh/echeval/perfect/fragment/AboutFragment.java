package com.anirudh.echeval.perfect.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.anirudh.echeval.perfect.R;

public class AboutFragment extends Fragment
{
    public AboutFragment()
    {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_about,container,false);
        TextView data = view.findViewById(R.id.song_list);
        data.setText(R.string.about);
        return view;
    }
}
