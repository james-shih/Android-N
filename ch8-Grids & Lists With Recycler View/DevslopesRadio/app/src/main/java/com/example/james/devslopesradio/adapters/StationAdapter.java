package com.example.james.devslopesradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

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

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }
}
