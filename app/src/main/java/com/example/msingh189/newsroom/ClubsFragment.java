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
        clubCardRecyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
        clubCardRecyclerView.setHasFixedSize(true);
        clubCardRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"Manthan","The Music Club of IIT ISM Dhanbad")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"CyberLabs","On the footsteps of MIT MediaLabs, this club aims to learn vital concepts of engineering by working on realtime projects")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"LITM","The Official Dance Club of IIT ISM Dhanbad:LITM-Legends In The Making")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"LitC","IIT (ISM)'s Literary and Debating Club")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"RoboISM","Robotics and AI Club of IIT ISM Dhanbad")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"FotoFreaks","The Photography Club of IIT-ISM Dhanbad")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"ArtFreaks","The Art Club of IIT-ISM Dhanbad")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"AIESEC","")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"Fast Forward India","This Club finds creative and powerful ways to tackle problems that impact the lives of millions underprivileged Indians")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"E-Cell","Entrepreneurship Cell of IIT-ISM which aims to promote the entrepreneurship culture in India")
        );
        clubList.add(
                new Club(R.drawable.ic_launcher_background,"Mechismu","Official Formula Racing TEam of IIT(ISM) Dhanbad")
        );

        adapter = new ClubCardAdapter(this.getActivity(),clubList);
        clubCardRecyclerView.setAdapter(adapter);
        return view;
    }
}
