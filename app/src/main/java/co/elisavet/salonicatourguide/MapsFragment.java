package co.elisavet.salonicatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapsFragment extends android.support.v4.app.Fragment
        implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ArrayList<Location> locations = new ArrayList<>();

    public MapsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mapView =  inflater.inflate(R.layout.fragment_maps, container, false);

        //Get Argument that passed from activity in "SELECTED_LIST_CODE" key value
        int selectedListCode = getArguments().getInt("SELECTED_LIST_CODE_ID");

        locations = new LocationData(selectedListCode).getLocations();

        initializeMap();

        return mapView;

    }


    private void initializeMap() {
        if (mMap == null) {
            // Obtain the SupportMapFragment and get notified when the map is ready to be used.
            SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we add markers looping through Locations in Thessaloniki, Greece
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Loop through locations and add markers to the map
        for (int i = 0; i < locations.size(); i++) {
            Location currentLocation = locations.get(i);
            LatLng currentLatLng = new LatLng(currentLocation.getlLat(),currentLocation.getlLong());
            mMap.addMarker(new MarkerOptions().position(currentLatLng).title(currentLocation.getlName()));
        }
        // Move the camera to the center of Thessaloniki
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(40.63,22.95), 14));
    }

}
