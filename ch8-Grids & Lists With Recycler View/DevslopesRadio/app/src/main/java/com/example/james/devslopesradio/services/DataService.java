package com.example.james.devslopesradio.services;

import com.example.james.devslopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by James on 2017/4/25.
 */

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Station> getFeatureStations() {
        //Pretend we just downloaded featured stations from the Internet.

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)", "bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getRecentStations() {
        //Pretend we just downloaded featured stations from the Internet.

        ArrayList<Station> list = new ArrayList<>();
        return list;
    }

    public ArrayList<Station> getPartyStations() {
        //Pretend we just downloaded featured stations from the Internet.

        ArrayList<Station> list = new ArrayList<>();
        return list;
    }
}
