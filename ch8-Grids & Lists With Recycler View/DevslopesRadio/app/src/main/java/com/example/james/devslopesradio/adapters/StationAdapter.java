package com.example.james.devslopesradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.james.devslopesradio.R;
import com.example.james.devslopesradio.holders.StationViewHolder;
import com.example.james.devslopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by James on 2017/4/24.
 */

public class StationAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private ArrayList<Station> stations;

    public StationAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {
        Station station = stations.get(position);
        holder.updateUI(station);
    }

    @Override
    public int getItemCount() {
        return stations.size();
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);
        return new StationViewHolder(stationCard);
    }
}
