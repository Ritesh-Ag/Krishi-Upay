package com.gamecodeschool.krishiupay;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;


import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

import java.util.Locale;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button btnCrops,btnSchemes,btnHelp,btnFertilizers,btnShop,btnVideos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        loadlocale();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnCrops=findViewById(R.id.btnCrops);
        btnSchemes=findViewById(R.id.btnSchemes);
        btnFertilizers=findViewById(R.id.btnFertilizer);
        btnHelp=findViewById(R.id.btnHelp);
        btnShop=findViewById(R.id.btnShop);
        btnVideos=findViewById(R.id.btnVideos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        btnCrops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Main2Activity.this,Crops.class);
                startActivity(intent);
            }
        });
        btnSchemes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Schemes.class);
                startActivity(intent);
            }
        });
        btnFertilizers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Fertilizers.class);
                startActivity(intent);
            }
        });
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Help.class);
                startActivity(intent);
            }
        });
        btnVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Videos.class);
                startActivity(intent);
            }
        });
        btnShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Shop.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.language) {
           final String[] listlang={"English", "हिंदी", "ਪੰਜਾਬੀ"};
            AlertDialog.Builder mbuilder= new AlertDialog.Builder(Main2Activity.this);
            mbuilder.setTitle("Choose Language");
            mbuilder.setSingleChoiceItems(listlang, -1, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if(i==0)
                    {
                        setlocale("en");
                        recreate();
                    }
                    else if(i==1)
                    {
                        setlocale("hi");
                        recreate();
                    }
                    else if(i==2)
                    {
                        setlocale("pa");
                        recreate();
                    }
                    dialogInterface.dismiss();
                }
            });
            AlertDialog mdialog=mbuilder.create();
            mdialog.show();

        }

        else if (id == R.id.weather)
        {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.accuweather.com/en/in/india-weather"));
            startActivity(intent);
        }
        else if (id == R.id.news)
        {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://hindi.krishijagran.com/"));
            startActivity(intent);
        }
        else if (id == R.id.about)
        {
            Intent intent=new Intent(Main2Activity.this, About.class);
            startActivity(intent);
        }
        else if(id ==R.id.logout)
        {

            Backendless.UserService.logout(new AsyncCallback<Void>() {
                @Override
                public void handleResponse(Void response) {
                    Toast.makeText(Main2Activity.this,"You logged out!",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Main2Activity.this,Login.class);
                    startActivity(intent);
                }

                @Override
                public void handleFault(BackendlessFault fault) {
                    Toast.makeText(Main2Activity.this,"failed to logout",Toast.LENGTH_SHORT).show();
                }
            });
        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void setlocale(String pa)
    {
        Locale locale=new Locale(pa);
        Locale.setDefault(locale);
        Configuration config=new Configuration();
        config.locale=locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

        SharedPreferences.Editor editor=getSharedPreferences("settings", MODE_PRIVATE).edit();
        editor.putString("My Lang", pa);
        editor.commit();
    }

    public void loadlocale()
    {
        SharedPreferences prefs=getSharedPreferences("settings", Activity.MODE_PRIVATE);
        String language=prefs.getString("My Lang","");
        setlocale(language);

    }
}
