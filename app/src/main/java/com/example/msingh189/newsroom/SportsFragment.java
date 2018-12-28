package com.example.msingh189.newsroom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class SportsFragment extends Fragment {

    RecyclerView sportsCardRecyclerView;
    SportsCardAdapter adapter;
    List<Sports> sportsList;

    public static SportsFragment newInstance() {

        return new SportsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_sports, container, false);
        sportsList = new ArrayList<>();
        sportsCardRecyclerView = (RecyclerView)view.findViewById(R.id.sportsrecyclerView);
        sportsCardRecyclerView.setHasFixedSize(true);
        sportsCardRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        sportsList.add(
                new Sports(R.drawable.ic_launcher_background,"Cricket","")
        );
        sportsList.add(
                new Sports(R.drawable.ic_launcher_background,"Football","")
        );
        sportsList.add(
                new Sports(R.drawable.ic_launcher_background,"Squash","")
        );
        sportsList.add(
                new Sports(R.drawable.ic_launcher_background,"Hockey","")
        );
        sportsList.add(
                new Sports(R.drawable.ic_launcher_background,"Athletics","")
        );

        adapter = new SportsCardAdapter(this.getActivity(),sportsList);
        sportsCardRecyclerView.setAdapter(adapter);
        return view;
    }
}
