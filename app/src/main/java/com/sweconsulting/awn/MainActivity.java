package com.sweconsulting.awn;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.FragmentById;

@EActivity(R.layout.ac_main)
public class MainActivity extends AppCompatActivity {

    @FragmentById
    Fragment frameMain;

    @AfterViews
    void startPlayNewsFragment()
    {
        if(frameMain == null)
        {
            frameMain = PlayNewsFragment_.builder().build();
            getSupportFragmentManager().beginTransaction().add(R.id.frame_main, frameMain).commit();
        }
    }
}
