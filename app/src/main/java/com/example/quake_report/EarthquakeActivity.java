package com.example.quake_report;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static  final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a fake list of earthquake locations.
//        ArrayList<Earthquake> earthquakes = new ArrayList<>();
//        earthquakes.add(new Earthquake("7.2","Paris","Feb 22,2019"));
//        earthquakes.add(new Earthquake("7.2","San Francisco","Feb 22,2019"));
//        earthquakes.add(new Earthquake("7.2","Rio de Janeiroo","Feb 22,2019"));
//        earthquakes.add(new Earthquake("7.2","Moscow","Feb 22,2019"));
//        earthquakes.add(new Earthquake("7.2","Mexico City","Feb 22,2019"));
//        earthquakes.add(new Earthquake("7.2","Tokyo","Feb 22,2019"));
//        earthquakes.add(new Earthquake("7.2","Tokyo","Feb 22,2019"));

        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();


        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter=new EarthquakeAdapter(this,earthquakes);

        earthquakeListView.setAdapter(adapter);


    }
}