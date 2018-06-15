package co.elisavet.salonicatourguide;

import java.util.ArrayList;

/**
 * Created by Eli on 14-Jun-18.
 */

public class LocationData {

    private ArrayList<Location> locations = new ArrayList<>();
    private ArrayList<Location> cityCenterLocations = new ArrayList<>();
    private ArrayList<Location> museumsLocations = new ArrayList<>();
    private ArrayList<Location> theatersCinemasLocations = new ArrayList<>();


    public LocationData(int locationsListCodeId) {
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
            default:
                locations = getCityCenterLocations();
        }
    }

    public ArrayList<Location> getLocations(){
        return locations;
    }

    private ArrayList<Location> getCityCenterLocations() {

        if (cityCenterLocations.isEmpty()) {
            cityCenterLocations.add(new Location(40.626442, 22.948443, "White Tower of Thessaloniki", "Thessaloniki, 546 21", "http://www.lpth.gr/", "+30 231 026 7832", R.drawable.white_tower));
            cityCenterLocations.add(new Location(40.632075, 22.951678, "Arch of Galerius", "Egnatia 144, Thessaloniki 546 22", "http://odysseus.culture.gr/h/2/gh251.jsp?obj_id=1425", "+30 231 331 0400", R.drawable.white_tower));
            cityCenterLocations.add(new Location(40.633341, 22.952852, "Rotonda Roman Temple", "Pl. Agiou Georgiou Rotonda 5, Thessaloniki 546 35", "http://odysseus.culture.gr/h/2/gh251.jsp?obj_id=1812", "+30 231 096 8860", R.drawable.white_tower));
            cityCenterLocations.add(new Location(40.632849, 22.947002, "Church of Aghia Sofia", "Agias Sofias, Thessaloniki 546 22", "https://thessaloniki.travel/en/exploring-the-city/religion/greek-orthodox-churches/item/1832-church-of-aghia-sophia", "+30 231 027 0253", R.drawable.white_tower));
            cityCenterLocations.add(new Location(40.632338, 22.940839, "Aristotelous Square", "Aristotelous, Thessaloniki 546 24", "https://thessaloniki.travel/en/exploring-the-city/themed-routes/modern-architecture/item/1021-aristotelous-square", "", R.drawable.white_tower));
            cityCenterLocations.add(new Location(40.635564, 22.943075, "Kapani Market", "Menexe 25, Thessaloniki 546 24", "https://kapani.gr/", "231 231 5386", R.drawable.white_tower));
            cityCenterLocations.add(new Location(40.634806, 22.942023, "Modiano Market", "Thessaloniki 546 24", "https://en.wikipedia.org/wiki/Modiano_Market", "231 400 5162", R.drawable.white_tower));
            cityCenterLocations.add(new Location(40.636702, 22.944986, "Roman Forum Thessaloniki", "Olympou 75, Thessaloniki 546 31", "https://thessaloniki.travel/en/exploring-the-city/themed-routes/roman-route/item/958-the-roman-forum", "+30 231 022 1266", R.drawable.white_tower));
            cityCenterLocations.add(new Location(40.638763, 22.947825, "Church of Aghios (ST) Demetrius", "Olympou 75, Thessaloniki 546 31", "https://thessaloniki.travel/en/exploring-the-city/religion/greek-orthodox-churches/item/1833-church-of-aghios-st-demetrius", "+30 231 027 0591", R.drawable.white_tower));
            cityCenterLocations.add(new Location(40.639168, 22.949645, "Alatza Imaret", "Kassandrou 91-93, Thessaloniki 546 33", "https://en.wikipedia.org/wiki/Alaca_Imaret_Mosque", "+30 231 027 8587", R.drawable.white_tower));
        }

        return cityCenterLocations;
    }

    private ArrayList<Location> getMuseumsLocations() {

        if (museumsLocations.isEmpty()) {
            museumsLocations.add(new Location(40.625442, 22.953835, "Archaeological Museum of Thessaloniki", "Manoli Andronikou 6, Thessaloniki 546 21", "https://www.amth.gr/en", "+30 231 331 0201"));
            museumsLocations.add(new Location(40.623947, 22.955110, "Museum of Byzantine Culture", "Leof. Stratou 2, Thessaloniki 546 21", "http://www.mbp.gr/en", "+30 231 330 6400"));
            museumsLocations.add(new Location(40.624324, 22.959545, "War Museum of Thessaloniki", "Gr. Lampraki 4, Thessaloniki 546 36", "https://www.warmuseumthessaloniki.com/", "+30 231 024 9803"));
            museumsLocations.add(new Location(40.627289, 22.954664, "Macedonian Museum of Contemporary Art", "Egnatia 154, inside Helexpo, Thessaloniki 546 36", "https://en.wikipedia.org/wiki/Macedonian_Museum_of_Contemporary_Art", "+30 231 024 0002"));
            museumsLocations.add(new Location(40.626775, 22.953942, "Radio Museum", "Inside Helexpo, Thessaloniki 546 21", "http://radiomuseum.gr/", "+30 697 330 0103"));
            museumsLocations.add(new Location(40.632170, 22.948175, "Macedonia Music Museum", "Svolou 10, Thessaloniki 546 22", "", ""));
            museumsLocations.add(new Location(40.630817, 22.943749, "Macedonia Struggle Museum", "Proksenou Koromila 23, Thessaloniki 546 22", "http://www.imma.edu.gr/imma/index.html", "+30 231 022 9778"));
            museumsLocations.add(new Location(40.635168, 22.939559, "Jewish Museum Of Thessaloniki", "Agiou Mina 13, Thessaloniki 546 24", "http://www.jmth.gr/", "+30 231 025 0406"));
            museumsLocations.add(new Location(40.632901, 22.935488, "Thessaloniki Museum Of Photography", "Warehouse A', Port of Thessaloniki, Thessaloniki 540 15", "http://www.thmphoto.gr/", "+30 231 056 6716"));
            museumsLocations.add(new Location(40.610185, 22.952161, "Folklore and Ethnological Museum of Macedonia - Thrace Museum", "Filippou Nikoglou 1, Thessaloniki 546 42", "http://www.lemmth.gr/", "+30 231 088 9840"));
            museumsLocations.add(new Location(40.635792, 22.954366, "Atatürk Museum", "Apostolou Pavlou 17, Thessaloniki 546 34", "https://en.wikipedia.org/wiki/Atat%C3%BCrk_Museum_(Thessaloniki)", "+30 231 024 8452"));
        }

        return museumsLocations;
    }

    private ArrayList<Location> getTheatersCinemasLocations() {

        if (theatersCinemasLocations.isEmpty()) {
            theatersCinemasLocations.add(new Location(40.626569, 22.949892, "National Theatre of Northern Greece", "Ethnikis Aminis 2, Thessaloniki 546 21", "http://www.ntng.gr/", "+30 231 520 0200"));
            theatersCinemasLocations.add(new Location(40.625262, 22.949599, "Royal Theatre | National Theatre of Northern Greece", "Leof. Meg. Aleksandrou, Thessaloniki 546 21", "https://www.ntng.gr/", "+30 231 520 0200"));
            theatersCinemasLocations.add(new Location(40.626624, 22.949392, "Theatre Of The Society For Macedonian Studies | National Theatre of Northern Greece", "Ethnikis Aminis 2, Thessaloniki 546 21", "http://www.ems.gr/", "+30 231 027 1195"));
            theatersCinemasLocations.add(new Location(40.626675, 22.949655, "Aristoteleion Theatre", "Ethnikis Aminis 2, Thessaloniki 546 21", "https://aristoteleion.gr/", "+30 231 026 2051"));
            theatersCinemasLocations.add(new Location(40.658087, 22.931239, "Moni Lazariston | National Theatre of Northern Greece", "Kolokotroni 25, Pavlos Melas 564 30", "http://www.monilazariston.gr/", "+30 231 058 9185"));
            theatersCinemasLocations.add(new Location(40.626078, 22.951627, "Dimotiko Theatro Kipou (Municipal Garden Theater)", "N.Germanou, YMCA Square, Thessaloniki 546 21", "", "+30 231 025 6775"));
            theatersCinemasLocations.add(new Location(40.637627, 22.966196, "Forest Theater (Kratiko Theatro Dasous) | National Theatre of Northern Greece", "Seich Sou Forest, Thessaloniki 554 38", "https://www.ntng.gr/default.aspx?lang=en-GB&page=15", "+30 231 520 0200"));
            theatersCinemasLocations.add(new Location(40.632773, 22.941788, "Olympion Cinema", "Aristotelous Square 10, Thessaloniki 546 23", "http://www2.filmfestival.gr/en/", "+30 231 028 4001"));
            theatersCinemasLocations.add(new Location(40.626572, 22.949419, "Makedonikon Cinema", "Filikis Etairias 44, Thessaloniki 546 21", "http://www.thekinematografers.com/", "+30 231 026 1727"));

        }
        return theatersCinemasLocations;
    }
}
