package com.example.weatherforcastingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout homeRL;
    private ProgressBar loadingPB;
    private TextView CityNameTV,TemperatureTV,ConditionTV;
    private TextInputEditText CityEdt;
    private ImageView BackIV,IconIV,SearchIV;
    private RecyclerView WeatherRV;

    private ArrayList<WeatherRVModel> weatherRVModelArrayList;
    private WeatherRVAdapter weatherRVAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeRL = findViewById(R.id.idRLHome);
        loadingPB = findViewById(R.id.idPBloading);
        CityNameTV = findViewById(R.id.idTVCityName);
        TemperatureTV = findViewById(R.id.idTVTemperature);
        ConditionTV = findViewById(R.id.idTVCondition);
        CityEdt = findViewById(R.id.idEdtCity);
        BackIV = findViewById(R.id.idIVBack);
        IconIV = findViewById(R.id.idIVIcon);
        SearchIV = findViewById(R.id.idIVSearch);
        WeatherRV = findViewById(R.id.idRVWeather);

        weatherRVModelArrayList = new ArrayList<>();
        weatherRVAdapter = new WeatherRVAdapter(this,weatherRVModelArrayList);
        WeatherRV.setAdapter(weatherRVAdapter);


    }
}