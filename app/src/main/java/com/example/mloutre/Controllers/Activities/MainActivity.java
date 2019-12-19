package com.example.mloutre.Controllers.Activities;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


import com.example.mloutre.Controllers.Fragments.MapsFragment;
import com.example.mloutre.Controllers.Fragments.ProfileFragment;
import com.example.mloutre.Controllers.Fragments.WeatherFragment;
import com.example.mloutre.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

        //FOR DESIGN
        private Toolbar toolbar;
        private DrawerLayout drawerLayout;
        private NavigationView navigationView;

        //FOR FRAGMENTS
        // 1 - Declare fragment handled by Navigation Drawer
        private Fragment fragmentProfile;
        private Fragment fragmentMaps;
        private Fragment fragmentWeather;

        //FOR DATAS
        // 2 - Identify each fragment with a number
        private static final int FRAGMENT_PROFILE = 0;
        private static final int FRAGMENT_MAPS = 1;
        private static final int FRAGMENT_WEATHER = 2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // 6 - Configure all views
            this.configureToolBar();
            this.configureDrawerLayout();
            this.configureNavigationView();

            // 2 - Show First Fragment
            this.showFirstFragment();
        }

        @Override
        public void onBackPressed() {
            // 5 - Handle back click to close menu
            if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
                this.drawerLayout.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }


        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

            int id = item.getItemId();

            // 6 - Show fragment after user clicked on a menu item
            switch (id){
                case R.id.activity_main_drawer_profile :
                    this.showFragment(FRAGMENT_PROFILE);
                    break;
                case R.id.activity_main_drawer_maps:
                    this.showFragment(FRAGMENT_MAPS);
                    break;
                case R.id.activity_main_drawer_weather:
                    this.showFragment(FRAGMENT_WEATHER);
                    break;
                default:
                    break;
            }
        this.drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }




        // ---------------------
        // CONFIGURATION
        // ---------------------

        // 1 - Configure Toolbar
        private void configureToolBar(){
            this.toolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
            setSupportActionBar(toolbar);
        }

        // 2 - Configure Drawer Layout
        private void configureDrawerLayout(){
            this.drawerLayout = (DrawerLayout) findViewById(R.id.activity_main_drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawerLayout.addDrawerListener(toggle);
            toggle.syncState();
        }

        // 3 - Configure NavigationView
        private void configureNavigationView(){
            this.navigationView = (NavigationView) findViewById(R.id.activity_main_nav_view);
            navigationView.setNavigationItemSelectedListener(this);
        }

        // ---------------------
        // FRAGMENTS
        // ---------------------

        // 1 - Show first fragment when activity is created
        private void showFirstFragment(){
            Fragment visibleFragment = getSupportFragmentManager().findFragmentById(R.id.activity_main_frame_layout);
            if (visibleFragment == null){
                // 1.1 - Show News Fragment
                this.showFragment(FRAGMENT_PROFILE);
                // 1.2 - Mark as selected the menu item corresponding to NewsFragment
                this.navigationView.getMenu().getItem(0).setChecked(true);
            }
        }

        // 5 - Show fragment according an Identifier
        private void showFragment(int fragmentIdentifier){
            switch (fragmentIdentifier){
                case FRAGMENT_PROFILE :
                    this.showProfileFragment();
                    break;
                case FRAGMENT_MAPS:
                    this.showMapsFragment();
                    break;
                case FRAGMENT_WEATHER:
                    this.showWeatherFragment();
                    break;
                default:
                    break;
            }
        }

        // ---

        // 4 - Create each fragment page and show it
        private void showProfileFragment(){
            if (this.fragmentProfile == null) this.fragmentProfile = ProfileFragment.newInstance();
            this.startTransactionFragment(this.fragmentProfile);
        }
        private void showMapsFragment(){
            if (this.fragmentMaps == null) this.fragmentMaps = MapsFragment.newInstance();
            this.startTransactionFragment(this.fragmentMaps);
        }
        private void showWeatherFragment(){
            if (this.fragmentWeather == null) this.fragmentWeather = WeatherFragment.newInstance();
            this.startTransactionFragment(this.fragmentWeather);
        }

        // ---

        // 3 - Generic method that will replace and show a fragment inside the MainActivity Frame Layout
        private void startTransactionFragment(Fragment fragment){
            if (!fragment.isVisible()){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_frame_layout, fragment).commit();
            }
        }
    }
