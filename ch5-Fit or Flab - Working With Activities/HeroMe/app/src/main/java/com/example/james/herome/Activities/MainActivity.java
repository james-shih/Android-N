package com.example.james.herome.Activities;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.james.herome.Fragments.CharacterFragment;
import com.example.james.herome.Fragments.MainFragment;
import com.example.james.herome.Fragments.PickPowerFragment;
import com.example.james.herome.R;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentInteractionListener,
        PickPowerFragment.PickPowerInteractionListener, CharacterFragment.CharacterFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new MainFragment();
            manager.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }

    public void loadPickPowerScreen() {

        PickPowerFragment pickPowerFragment = new PickPowerFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, pickPowerFragment).addToBackStack(null).commit();
    }

    public void loadCharacterScreen() {
        CharacterFragment characterFragment = new CharacterFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, characterFragment).addToBackStack(null).commit();
    }

    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPickPowerInteractionListener(Uri uri) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}


