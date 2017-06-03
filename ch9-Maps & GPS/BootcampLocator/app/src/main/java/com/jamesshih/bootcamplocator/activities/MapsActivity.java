package com.jamesshih.bootcamplocator.activities;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.jamesshih.bootcamplocator.R;
import com.jamesshih.bootcamplocator.fragments.MainFragment;

public class MapsActivity extends FragmentActivity implements GoogleApiClient.OnConnectionFailedListener, GoogleApiClient.ConnectionCallbacks, com.google.android.gms.location.LocationListener {

    final int PERMISSION_LOCATION = 111;

    private GoogleApiClient mGoogleApiClient;
    private MainFragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this, this)
                .addConnectionCallbacks(this)
                .addApi(LocationServices.API)
                .build();

        mainFragment = (MainFragment)getSupportFragmentManager().findFragmentById(R.id.container_main);
        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();
            getSupportFragmentManager().beginTransaction().add(R.id.container_main, mainFragment).commit();
        }
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, PERMISSION_LOCATION);
            Log.v("DONKEY", "Requesting permissions");
        } else {
            Log.v("DONKEY", "Starting location Services from on Connected");
            startLocationServices();
        }
    }

    @Override
    public void onLocationChanged(Location location) {
        Log.v("DONKEY", "Long: " + location.getLongitude() + " - Lag: " + location.getLatitude());
        mainFragment.setUserLocation(new LatLng(location.getLatitude(), location.getLongitude()));
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    protected void onStart() {
        mGoogleApiClient.connect();
        super.onStart();
    }

    @Override
    protected void onStop() {
        mGoogleApiClient.disconnect();
        super.onStop();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case PERMISSION_LOCATION: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    startLocationServices();
                    Log.v("DONKEY", "Permission Granted - starting services");
                } else {
                    // show a dialog saying something
                    Log.v("DONKEY", "Permission not granted");
                }
            }
        }
    }

    public void startLocationServices() {
        Log.v("DONKEY", "Starting Location Services Called");

        try {
            LocationRequest req = LocationRequest.create().setPriority(LocationRequest.PRIORITY_LOW_POWER);
            LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, req, this);
            Log.v("DONKEY", "Requesting location updates");
        } catch (SecurityException exception) {
            Log.v("DONKEY", exception.toString());
        }
    }
}
