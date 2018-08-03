package co.elisavet.salonicatourguide;

import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.MenuItem;

/*Source:
* https://developer.android.com/training/implementing-navigation/nav-drawer
* https://github.com/codepath/android_guides/wiki/Fragment-Navigation-Drawer
*/

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private NavigationView nvDrawer;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set a Toolbar to replace the ActionBar.
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        // Find our drawer view
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        // Find our drawer view
        nvDrawer = (NavigationView) findViewById(R.id.nvView);

        // Initialize first view
        fragmentManager = getSupportFragmentManager();//Get Fragment Manager
        fragmentManager.beginTransaction()
                .replace(R.id.flContent, new IntroFragment())
                .commit();

        // Setup drawer view
        setupDrawerContent(nvDrawer);

    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        selectDrawerItem(menuItem);
                        return true;
                    }
                });
    }

    public void selectDrawerItem(MenuItem menuItem) {
        // Create a new fragment and specify the fragment to show based on nav item clicked
        Fragment fragment = null;
        Class fragmentClass;
        //Specify which list will be loaded (see LocationData class)
        int listCodeId;

        switch (menuItem.getItemId()) {
            case R.id.nav_center_tour_list_fragment:
                fragmentClass = ListsFragment.class;
                listCodeId = 1;
                break;
            case R.id.nav_center_tour_map_fragment:
                fragmentClass = MapsFragment.class;
                listCodeId = 1;
                break;
            case R.id.nav_museums_tour_list_fragment:
                fragmentClass = ListsFragment.class;
                listCodeId = 2;
                break;
            case R.id.nav_museums_tour_map_fragment:
                fragmentClass = MapsFragment.class;
                listCodeId = 2;
                break;
            case R.id.nav_theatres_cinemas_list_fragment:
                fragmentClass = ListsFragment.class;
                listCodeId = 3;
                break;
            case R.id.nav_theatres_cinemas_map_fragment:
                fragmentClass = MapsFragment.class;
                listCodeId = 3;
                break;
            case R.id.nav_places_of_interest_list_fragment:
                fragmentClass = ListsFragment.class;
                listCodeId = 4;
                break;
            case R.id.nav_places_of_interest_map_fragment:
                fragmentClass = MapsFragment.class;
                listCodeId = 4;
                break;
            default:
                fragmentClass = ListsFragment.class;
                listCodeId = 1;
        }

        try {
            fragment = (Fragment) fragmentClass.newInstance();
            Bundle selectedList = new Bundle();//Use bundle to pass data
            selectedList.putInt("SELECTED_LIST_CODE_ID", listCodeId);//put int in bundle with a key value
            fragment.setArguments(selectedList);//Finally set argument bundle to fragment
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Insert the fragment by replacing any existing fragment
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.flContent, fragment)
                .addToBackStack(null)
                .commit();

        // Highlight the selected item has been done by NavigationView
        menuItem.setChecked(true);
        // Set action bar title
        setTitle(menuItem.getTitle());
        // Close the navigation drawer
        mDrawer.closeDrawers();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawer.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
