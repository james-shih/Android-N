package com.example.james.devslopesradio.activities;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.james.devslopesradio.R;
import com.example.james.devslopesradio.fragments.DetailFragment;
import com.example.james.devslopesradio.fragments.MainFragment;
import com.example.james.devslopesradio.model.Station;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener {

    private static MainActivity mainActivity;

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    private static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.setMainActivity(this);

        FragmentManager fragmentManager = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment)fragmentManager.findFragmentById(R.id.container_main);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance("blah", "kah");
            fragmentManager.beginTransaction().add(R.id.container_main, mainFragment).commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void laodDetailsScreen(Station selectedStation) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_main, new DetailFragment())
                .addToBackStack(null)
                .commit();
    }
}
