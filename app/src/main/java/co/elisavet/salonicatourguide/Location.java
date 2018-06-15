package co.elisavet.salonicatourguide;

/**
 * Created by Eli on 28-May-18.
 */

public class Location {

    /** Location Latitude */
    private double lLat;

    /** Location Longitude */
    private double lLong;

    /** Location name */
    private String lName;

    /** Location Street Address */
    private String lStreetAddress;

    /** Location Web Page */
    private String lWebPage;

    /** Location Phone Number */
    private String lPhoneNumber;

    /** Image resource ID for the location */
    private int lImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this location */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Constant value that represents no web page was provided for this location */
    private static final String NO_WEB_PAGE_PROVIDED = "";

    /** Constant value that represents no phone number was provided for this location */
    private static final String NO_PHONE_NUMBER_PROVIDED = "";

    /** Location Class Constructor - no image provided */
    public Location (double latitude, double longitude, String name, String streetAddress, String webPage, String phoneNumber){
        lLat = latitude;
        lLong = longitude;
        lName = name;
        lStreetAddress = streetAddress;
        lWebPage = webPage;
        lPhoneNumber = phoneNumber;
    }

    /** Location Class Constructor, with image resource Id - this location has an image */
    public Location (double latitude, double longitude, String name, String streetAddress, String webPage, String phoneNumber, int imageResourceId){
        lLat = latitude;
        lLong = longitude;
        lName = name;
        lStreetAddress = streetAddress;
        lWebPage = webPage;
        lPhoneNumber = phoneNumber;
        lImageResourceId = imageResourceId;
    }

    public double getlLat() {
        return lLat;
    }

    public double getlLong() {
        return lLong;
    }

    public String getlName() {
        return lName;
    }

    public String getlStreetAddress() {
        return lStreetAddress;
    }

    public String getlWebPage() {
        return lWebPage;
    }

    public String getlPhoneNumber() {
        return lPhoneNumber;
    }

    public int getlImageResourceId() {
        return lImageResourceId;
    }

    /**
     * Checks if an image resource id is provided
     */
    public boolean hasImage(){
        return lImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Checks if an location phone number is provided
     */
    public boolean hasPhoneNumber(){
        return !lWebPage.equals(NO_WEB_PAGE_PROVIDED) ;
    }

    /**
     * Checks if an location phone number is provided
     */
    public boolean hasWebPage(){
        return !lPhoneNumber.equals(NO_PHONE_NUMBER_PROVIDED) ;
    }


}
