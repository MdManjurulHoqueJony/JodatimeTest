package com.wordpress.jonyonandroidcraftsmanship.jodatimetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.joda.time.LocalDate;
import org.joda.time.Years;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LocalDate birthdate = new LocalDate (1983, 9, 26);          //Birth date
        LocalDate now = new LocalDate();                    //Today's date
        Years age = Years.yearsBetween(birthdate, now);
        Log.d("age",age.getYears()+"");
    }
}
