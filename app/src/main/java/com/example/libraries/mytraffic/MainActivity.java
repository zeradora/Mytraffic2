package com.example.libraries.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.libraries.mytraffic.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Add Fragment to Main Activity
            if(savedInstanceState==null) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.contentMainFragment,new MainFragment()).commit();
            }



    } // Method
} // Main Class
