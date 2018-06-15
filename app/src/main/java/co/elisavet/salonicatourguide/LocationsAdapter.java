package co.elisavet.salonicatourguide;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Eli on 09-Jun-18.
 * https://www.androidhive.info/2016/01/android-working-with-recycler-view/
 */

public class LocationsAdapter extends RecyclerView.Adapter<LocationsAdapter.MyViewHolder> {

    private ArrayList<Location> locationsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView location_name, location_street_address, location_web_page, location_phone_number;
        public ImageView location_photo;

        public MyViewHolder(View view) {
            super(view);
            location_name = (TextView) view.findViewById(R.id.location_name);
            location_street_address = (TextView) view.findViewById(R.id.location_street_address);
            location_web_page = (TextView) view.findViewById(R.id.location_web_page);
            location_phone_number = (TextView) view.findViewById(R.id.location_phone_number);
            location_photo = (ImageView) view.findViewById(R.id.location_photo);
        }
    }

    public LocationsAdapter(ArrayList<Location> locationsList) {
        this.locationsList = locationsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.location_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Location location = locationsList.get(position);

        holder.location_name.setText(location.getlName());
        holder.location_street_address.setText(location.getlStreetAddress());

        // Check if an Web Page is provided for this location or not
        if (location.hasWebPage()) {
            holder.location_web_page.setText(location.getlWebPage());
            holder.location_web_page.setVisibility(View.VISIBLE);
        } else {
            holder.location_web_page.setVisibility(View.GONE);
        }

        // Check if an phone number is provided for this location or not
        if (location.hasPhoneNumber()){
            holder.location_phone_number.setText(location.getlPhoneNumber());
            holder.location_phone_number.setVisibility(View.VISIBLE);
        } else {
            holder.location_phone_number.setVisibility(View.GONE);
        }

        // Check if an image is provided for this location or not
        if (location.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            holder.location_photo.setImageResource(location.getlImageResourceId());
            // Make sure the view is visible
            holder.location_photo.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            holder.location_photo.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return locationsList.size();
    }
}