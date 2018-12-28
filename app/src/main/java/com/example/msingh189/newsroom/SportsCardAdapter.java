package com.example.msingh189.newsroom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SportsCardAdapter extends RecyclerView.Adapter<SportsCardAdapter.SportsCardViewHolder> {
    private Context mCtx;
    private List<Sports> sportsList;

    public SportsCardAdapter(Context mCtx, List<Sports> sportsList) {
        this.mCtx = mCtx;
        this.sportsList = sportsList;
    }

    @NonNull
    @Override
    public SportsCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
//        LayoutInflater inflater = LayoutInflater.from(mCtx);
//        View view = inflater.inflate(R.layout.clublist_layout, null);
//        return new ClubCardViewHolder(view);
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_sports, parent, false);

        return new SportsCardViewHolder(v);
    }


    @Override
    public void onBindViewHolder(SportsCardViewHolder holder, int position) {
        Sports sports = sportsList.get(position);
        holder.sportsName.setText(sports.getSportsName());
        holder.sportsLogo.setImageDrawable(mCtx.getResources().getDrawable(sports.getSportsLogo()));
        holder.sportsDesc.setText(sports.getSportsDesc());

    }

    @Override
    public int getItemCount() {
        return sportsList.size();
    }

    class SportsCardViewHolder extends RecyclerView.ViewHolder {

        TextView sportsName, sportsDesc;
        ImageView sportsLogo;

        public SportsCardViewHolder(@NonNull View itemView) {
            super(itemView);

            sportsLogo = itemView.findViewById(R.id.sportsLogo);
            sportsName = itemView.findViewById(R.id.sportsName);
            sportsDesc = itemView.findViewById(R.id.sportsDesc);
        }
    }
}
