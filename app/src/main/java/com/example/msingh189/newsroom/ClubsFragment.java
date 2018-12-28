package com.example.msingh189.newsroom;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ClubsFragment extends Fragment {

    RecyclerView clubCardRecyclerView;
    ClubCardAdapter adapter;
    List<Club> clubList;

    public static ClubsFragment newInstance() {

        return new ClubsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_clubs, container, false);
        clubList = new ArrayList<>();
        clubCardRecyclerView = (RecyclerView)view.findViewById(R.id.clubrecyclerView);
        clubCardRecyclerView.setHasFixedSize(true);
        clubCardRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"Manthan","")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"CyberLabs","")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"LITM","")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"LitC","")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"RoboISM","")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"FotoFreaks","")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"ArtFreaks","")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"AIESEC","")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"Fast Forward India","")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"E-Cell","")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"Mechismu","")
        );

        adapter = new ClubCardAdapter(this.getActivity(),clubList);
        clubCardRecyclerView.setAdapter(adapter);
        return view;
    }
}
