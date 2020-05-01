package com.example.maps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng SPBU = new LatLng(-7.9207372, 112.5949646);
        mMap.addMarker(new MarkerOptions().position(SPBU ).title("Marker in SPBU").snippet("SPBU UMM. Jl. Raya Tlogomas No.246, Tlogomas, Kec. Lowokwaru, Kota Malang, Jawa Timur 65144"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SPBU ,15));

        LatLng spbu2 = new LatLng(-7.581849, 111.874872);
        mMap.addMarker(new MarkerOptions().position(spbu2).title("SPBU Guyangan, Nganjuk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu2));

        LatLng spbu3 = new LatLng(-7.564330, 111.841017);
        mMap.addMarker(new MarkerOptions().position(spbu3).title("SPBU Bagor, Nganjuk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu3));
        
    }
}
