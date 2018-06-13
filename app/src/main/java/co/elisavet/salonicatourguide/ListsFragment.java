package co.elisavet.salonicatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListsFragment extends Fragment {

    private ArrayList<Location> locations = new ArrayList<>();
    private RecyclerView recyclerView;
    private LocationsAdapter lAdapter;

    public ListsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_lists, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        lAdapter = new LocationsAdapter(locations);
        RecyclerView.LayoutManager lLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(lLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(lAdapter);

        prepareLocationData();

        return view;
    }

    private void prepareLocationData() {

        locations.add(new Location(40.626442, 22.948443, "White Tower of Thessaloniki", "Thessaloniki, 546 21", "http://www.lpth.gr/", "+30 231 026 7832", R.drawable.white_tower));
        locations.add(new Location(40.632075, 22.951678, "Arch of Galerius", "Egnatia 144, Thessaloniki 546 22", "http://odysseus.culture.gr/h/2/gh251.jsp?obj_id=1425", "+30 231 331 0400", R.drawable.white_tower));
        locations.add(new Location(40.633341, 22.952852, "Rotonda Roman Temple", "Pl. Agiou Georgiou Rotonda 5, Thessaloniki 546 35", "http://odysseus.culture.gr/h/2/gh251.jsp?obj_id=1812", "+30 231 096 8860", R.drawable.white_tower));
        locations.add(new Location(40.632849, 22.947002, "Church of Aghia Sofia", "Agias Sofias, Thessaloniki 546 22", "https://thessaloniki.travel/en/exploring-the-city/religion/greek-orthodox-churches/item/1832-church-of-aghia-sophia", "+30 231 027 0253", R.drawable.white_tower));
        locations.add(new Location(40.632338, 22.940839, "Aristotelous Square", "Aristotelous, Thessaloniki 546 24", "https://thessaloniki.travel/en/exploring-the-city/themed-routes/modern-architecture/item/1021-aristotelous-square", "", R.drawable.white_tower));
        locations.add(new Location(40.635564, 22.943075, "Kapani Market", "Menexe 25, Thessaloniki 546 24", "https://kapani.gr/", "231 231 5386", R.drawable.white_tower));
        locations.add(new Location(40.634806, 22.942023, "Modiano Market", "Thessaloniki 546 24", "https://en.wikipedia.org/wiki/Modiano_Market", "231 400 5162", R.drawable.white_tower));
        locations.add(new Location(40.636702, 22.944986, "Roman Forum Thessaloniki", "Olympou 75, Thessaloniki 546 31", "https://thessaloniki.travel/en/exploring-the-city/themed-routes/roman-route/item/958-the-roman-forum", "+30 231 022 1266", R.drawable.white_tower));
        locations.add(new Location(40.638763, 22.947825, "Church of Aghios (ST) Demetrius", "Olympou 75, Thessaloniki 546 31", "https://thessaloniki.travel/en/exploring-the-city/religion/greek-orthodox-churches/item/1833-church-of-aghios-st-demetrius", "+30 231 027 0591", R.drawable.white_tower));
        locations.add(new Location(40.639168, 22.949645, "Alatza Imaret", "Kassandrou 91-93, Thessaloniki 546 33", "https://en.wikipedia.org/wiki/Alaca_Imaret_Mosque", "+30 231 027 8587", R.drawable.white_tower));

        lAdapter.notifyDataSetChanged();
    }

}
