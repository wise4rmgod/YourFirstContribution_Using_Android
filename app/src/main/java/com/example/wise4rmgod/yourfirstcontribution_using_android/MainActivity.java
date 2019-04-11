package com.example.wise4rmgod.yourfirstcontribution_using_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mytxt=(TextView)findViewById(R.id.txtview);
        mytxt.setText("myfirstopensource");
    }
}
