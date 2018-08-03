package co.elisavet.salonicatourguide;


import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Eli on 14-Jun-18.
 */

public class LocationData {

    private Context context;
    private ArrayList<Location> locations = new ArrayList<>();
    private ArrayList<Location> cityCenterLocations = new ArrayList<>();
    private ArrayList<Location> museumsLocations = new ArrayList<>();
    private ArrayList<Location> theatersCinemasLocations = new ArrayList<>();
    private ArrayList<Location> cityPlacesOfInterestLocations = new ArrayList<>();

    public LocationData(int locationsListCodeId, Context context) {

        this.context = context;

        switch(locationsListCodeId) {
            case 1:
                locations = getCityCenterLocations();
                break;
            case 2:
                locations = getMuseumsLocations();
                break;
            case 3:
                locations = getTheatersCinemasLocations();
                break;
            case 4:
                locations = getCityPlacesOfInterestLocations();
                break;
            default:
                locations = getCityCenterLocations();
        }
    }

    public ArrayList<Location> getLocations(){
        return locations;
    }

    private ArrayList<Location> getCityCenterLocations() {

        if (cityCenterLocations.isEmpty()) {
            cityCenterLocations.add(new Location(40.626442, 22.948443, context.getString(R.string.location_name_white_tower), context.getString(R.string.location_address_white_tower),context.getString(R.string.location_webpage_white_tower), context.getString(R.string.location_phone_white_tower), R.drawable.white_tower_of_thessaloniki_e));
            cityCenterLocations.add(new Location(40.632075, 22.951678, context.getString(R.string.location_name_arch_of_galerius), context.getString(R.string.location_address_arch_of_galerius), context.getString(R.string.location_webpage_arch_of_galerius), context.getString(R.string.location_phone_arch_of_galerius), R.drawable.arch_of_galerius_e));
            cityCenterLocations.add(new Location(40.633341, 22.952852, context.getString(R.string.location_name_rotonda), context.getString(R.string.location_address_rotonda), context.getString(R.string.location_webpage_rotonda), context.getString(R.string.location_phone_rotonda), R.drawable.rotonda_roman_temple_e));
            cityCenterLocations.add(new Location(40.632849, 22.947002, context.getString(R.string.location_name_agia_sofia), context.getString(R.string.location_address_agia_sofia), context.getString(R.string.location_webpage_agia_sofia), context.getString(R.string.location_phone_agia_sofia), R.drawable.temple_of_ayia_sofia_e));
            cityCenterLocations.add(new Location(40.632338, 22.940839, context.getString(R.string.location_name_aristotelous), context.getString(R.string.location_address_aristotelous), context.getString(R.string.location_webpage_aristotelous), context.getString(R.string.location_phone_aristotelous), R.drawable.aristotelous_square_e));
            cityCenterLocations.add(new Location(40.635564, 22.943075, context.getString(R.string.location_name_kapani), context.getString(R.string.location_address_kapani), context.getString(R.string.location_webpage_kapani), context.getString(R.string.location_phone_kapani), R.drawable.kapani_market_e));
            cityCenterLocations.add(new Location(40.634806, 22.942023, context.getString(R.string.location_name_modiano), context.getString(R.string.location_address_modiano), context.getString(R.string.location_webpage_modiano), context.getString(R.string.location_phone_modiano), R.drawable.modiano_market_e));
            cityCenterLocations.add(new Location(40.638763, 22.947825, context.getString(R.string.location_name_agios_dimitrios), context.getString(R.string.location_address_agios_dimitrios), context.getString(R.string.location_webpage_agios_dimitrios), context.getString(R.string.location_phone_agios_dimitrios), R.drawable.church_of_agios_demetrios_e));
        }

        return cityCenterLocations;
    }

    private ArrayList<Location> getMuseumsLocations() {

        if (museumsLocations.isEmpty()) {
            museumsLocations.add(new Location(40.625442, 22.953835, context.getString(R.string.location_name_archaeological_museum), context.getString(R.string.location_address_archaeological_museum), context.getString(R.string.location_webpage_archaeological_museum), context.getString(R.string.location_phone_archaeological_museum)));
            museumsLocations.add(new Location(40.623947, 22.955110, context.getString(R.string.location_name_byzantine_museum), context.getString(R.string.location_address_byzantine_museum), context.getString(R.string.location_webpage_byzantine_museum), context.getString(R.string.location_phone_byzantine_museum)));
            museumsLocations.add(new Location(40.624324, 22.959545, context.getString(R.string.location_name_war_museum), context.getString(R.string.location_address_war_museum), context.getString(R.string.location_webpage_war_museum), context.getString(R.string.location_phone_war_museum)));
            museumsLocations.add(new Location(40.627289, 22.954664, context.getString(R.string.location_name_contemporary_art_museum), context.getString(R.string.location_address_contemporary_art_museum), context.getString(R.string.location_webpage_contemporary_art_museum), context.getString(R.string.location_phone_contemporary_art_museum)));
            museumsLocations.add(new Location(40.626775, 22.953942, context.getString(R.string.location_name_radio_museum), context.getString(R.string.location_address_radio_museum), context.getString(R.string.location_webpage_radio_museum), context.getString(R.string.location_phone_radio_museum)));
            museumsLocations.add(new Location(40.632170, 22.948175, context.getString(R.string.location_name_macedonia_music_museum), context.getString(R.string.location_address_macedonia_music_museum), context.getString(R.string.location_webpage_macedonia_music_museum), context.getString(R.string.location_phone_macedonia_music_museum)));
            museumsLocations.add(new Location(40.630817, 22.943749, context.getString(R.string.location_name_macedonia_struggle_museum), context.getString(R.string.location_address_macedonia_struggle_museum), context.getString(R.string.location_webpage_macedonia_struggle_museum), context.getString(R.string.location_phone_macedonia_struggle_museum)));
            museumsLocations.add(new Location(40.635168, 22.939559, context.getString(R.string.location_name_jewish_museum), context.getString(R.string.location_address_jewish_museum), context.getString(R.string.location_webpage_jewish_museum), context.getString(R.string.location_phone_jewish_museum)));
            museumsLocations.add(new Location(40.632901, 22.935488, context.getString(R.string.location_name_photography_museum), context.getString(R.string.location_address_photography_museum), context.getString(R.string.location_webpage_photography_museum), context.getString(R.string.location_phone_photography_museum)));
            museumsLocations.add(new Location(40.610185, 22.952161, context.getString(R.string.location_name_folklore_ethnological_museum), context.getString(R.string.location_address_folklore_ethnological_museum), context.getString(R.string.location_webpage_folklore_ethnological_museum), context.getString(R.string.location_phone_folklore_ethnological_museum)));
            museumsLocations.add(new Location(40.635792, 22.954366, context.getString(R.string.location_name_ataturk_museum), context.getString(R.string.location_address_ataturk_museum), context.getString(R.string.location_webpage_ataturk_museum), context.getString(R.string.location_phone_ataturk_museum)));
        }

        return museumsLocations;
    }

    private ArrayList<Location> getTheatersCinemasLocations() {

        if (theatersCinemasLocations.isEmpty()) {
            theatersCinemasLocations.add(new Location(40.626569, 22.949892, context.getString(R.string.location_name_national_theatre), context.getString(R.string.location_address_national_theatre), context.getString(R.string.location_webpage_national_theatre), context.getString(R.string.location_phone_national_theatre)));
            theatersCinemasLocations.add(new Location(40.625262, 22.949599, context.getString(R.string.location_name_royal_theatre), context.getString(R.string.location_address_royal_theatre), context.getString(R.string.location_webpage_royal_theatre), context.getString(R.string.location_phone_royal_theatre)));
            theatersCinemasLocations.add(new Location(40.626624, 22.949392, context.getString(R.string.location_name_macedonian_studies_theatre), context.getString(R.string.location_address_macedonian_studies_theatre), context.getString(R.string.location_webpage_macedonian_studies_theatre), context.getString(R.string.location_phone_macedonian_studies_theatre)));
            theatersCinemasLocations.add(new Location(40.626675, 22.949655, context.getString(R.string.location_name_aristoteleion_theatre), context.getString(R.string.location_address_aristoteleion_theatre), context.getString(R.string.location_webpage_aristoteleion_theatre), context.getString(R.string.location_phone_aristoteleion_theatre)));
            theatersCinemasLocations.add(new Location(40.658087, 22.931239, context.getString(R.string.location_name_moni_lazariston_theatre), context.getString(R.string.location_address_moni_lazariston_theatre), context.getString(R.string.location_webpage_moni_lazariston_theatre), context.getString(R.string.location_phone_moni_lazariston_theatre)));
            theatersCinemasLocations.add(new Location(40.626078, 22.951627, context.getString(R.string.location_name_municipal_garden_theatre), context.getString(R.string.location_address_municipal_garden_theatre), context.getString(R.string.location_webpage_municipal_garden_theatre), context.getString(R.string.location_phone_municipal_garden_theatre)));
            theatersCinemasLocations.add(new Location(40.637627, 22.966196, context.getString(R.string.location_name_forest_theatre), context.getString(R.string.location_address_forest_theatre), context.getString(R.string.location_webpage_forest_theatre), context.getString(R.string.location_phone_forest_theatre)));
            theatersCinemasLocations.add(new Location(40.632773, 22.941788, context.getString(R.string.location_name_olympion_cinema), context.getString(R.string.location_address_olympion_cinema), context.getString(R.string.location_webpage_olympion_cinema), context.getString(R.string.location_phone_olympion_cinema)));
            theatersCinemasLocations.add(new Location(40.626572, 22.949419, context.getString(R.string.location_name_makedonikon_cinema), context.getString(R.string.location_address_makedonikon_cinema), context.getString(R.string.location_webpage_makedonikon_cinema), context.getString(R.string.location_phone_makedonikon_cinema)));
            theatersCinemasLocations.add(new Location(40.621535, 22.952217, context.getString(R.string.location_name_natali_cinema), context.getString(R.string.location_address_natali_cinema), context.getString(R.string.location_webpage_natali_cinema), context.getString(R.string.location_phone_natali_cinema)));
            theatersCinemasLocations.add(new Location(40.631630, 22.950488, context.getString(R.string.location_name_vakoura_cinema), context.getString(R.string.location_address_vakoura_cinema), context.getString(R.string.location_webpage_vakoura_cinema), context.getString(R.string.location_phone_vakoura_cinema)));
            theatersCinemasLocations.add(new Location(40.633621, 22.942978, context.getString(R.string.location_name_alfa_odeon_cinema), context.getString(R.string.location_address_alfa_odeon_cinema), context.getString(R.string.location_webpage_alfa_odeon_cinema), context.getString(R.string.location_phone_alfa_odeon_cinema)));
        }
        return theatersCinemasLocations;
    }

    private ArrayList<Location> getCityPlacesOfInterestLocations(){

        if (cityPlacesOfInterestLocations.isEmpty()){
            cityPlacesOfInterestLocations.add(new Location(40.630132, 22.954507, context.getString(R.string.location_name_helexpo), context.getString(R.string.location_address_helexpo), context.getString(R.string.location_webpage_helexpo), context.getString(R.string.location_phone_helexpo)));
            cityPlacesOfInterestLocations.add(new Location(40.629359, 22.955428, context.getString(R.string.location_name_international_exhibition), context.getString(R.string.location_address_international_exhibition), context.getString(R.string.location_webpage_international_exhibition), context.getString(R.string.location_phone_international_exhibition)));
            cityPlacesOfInterestLocations.add(new Location(40.625777, 22.954789, context.getString(R.string.location_name_vellidio), context.getString(R.string.location_address_vellidio), context.getString(R.string.location_webpage_vellidio), context.getString(R.string.location_phone_vellidio)));
            cityPlacesOfInterestLocations.add(new Location(40.626655, 22.952087, context.getString(R.string.location_name_ymca), context.getString(R.string.location_address_ymca), context.getString(R.string.location_webpage_ymca), context.getString(R.string.location_phone_ymca)));
            cityPlacesOfInterestLocations.add(new Location(40.630895, 22.959265, context.getString(R.string.location_name_aristotle_university), context.getString(R.string.location_address_aristotle_university), context.getString(R.string.location_webpage_aristotle_university), context.getString(R.string.location_phone_aristotle_university)));
            cityPlacesOfInterestLocations.add(new Location(40.625353, 22.960145, context.getString(R.string.location_name_macedonia_university), context.getString(R.string.location_address_macedonia_university), context.getString(R.string.location_webpage_macedonia_university), context.getString(R.string.location_phone_macedonia_university)));
            cityPlacesOfInterestLocations.add(new Location(40.597178, 22.953351, context.getString(R.string.location_name_vafopoulio), context.getString(R.string.location_address_vafopoulio), context.getString(R.string.location_webpage_vafopoulio), context.getString(R.string.location_phone_vafopoulio)));
            cityPlacesOfInterestLocations.add(new Location(40.598177, 22.948619, context.getString(R.string.location_name_concert_hall), context.getString(R.string.location_address_concert_hall), context.getString(R.string.location_webpage_concert_hall), context.getString(R.string.location_phone_concert_hall)));
        }

        return cityPlacesOfInterestLocations;

    }
}
