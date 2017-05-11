package com.example.james.devslopesradio.fragments;


import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.james.devslopesradio.R;
import com.example.james.devslopesradio.adapters.StationAdapter;
import com.example.james.devslopesradio.services.DataService;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StationFragment extends Fragment {

    private static final String ARG_STATION_TYPE = "station_type";

    public static final int STATION_TYPE_FEATURED = 0;
    public static final int STATION_TYPE_RECENT = 1;
    public static final int STATION_TYPE_PARTY = 2;

    private int stationType;;

    public StationFragment() {
            // Required empty public constructor
    }

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param stationType The Radio Stations Type.
         * @return A new instance of fragment StationFragment.
         */
        // TODO: Rename and change types and number of parameters
    public static StationFragment newInstance(int stationType) {
        StationFragment fragment = new StationFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_STATION_TYPE, stationType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            stationType = getArguments().getInt(ARG_STATION_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_station, container, false);

        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.recycler_stations);
        recyclerView.setHasFixedSize(true);

        StationAdapter adapter;

        if (stationType == STATION_TYPE_FEATURED) {
            adapter = new StationAdapter(DataService.getInstance().getFeatureStations());
        } else if (stationType == STATION_TYPE_RECENT) {
            adapter = new StationAdapter(DataService.getInstance().getFeatureStations());
        } else {
            adapter = new StationAdapter(DataService.getInstance().getFeatureStations());
        }

        recyclerView.addItemDecoration(new HorizontalSpaceItemDecorator(30));

        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        return v;
    }

}

class HorizontalSpaceItemDecorator extends RecyclerView.ItemDecoration {

    private final int spacer;

    public HorizontalSpaceItemDecorator(int spacer) {
        this.spacer = spacer;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.right = spacer;
    }
}