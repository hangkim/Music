package com.example.a646662.music;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {


                case R.id.navigation_search:
                    mTextMessage.setText(R.string.title_search)
                    ;
                    return true;
                case R.id.navigation_download:
                    mTextMessage.setText(R.string.title_download)
                    ;
                    return true;
                case R.id.navigation_play:
                    VideoView videoView = findViewById()
                    return true;
                case R.id.navigation_playlist:
                    mTextMessage.setText(R.string.title_playlist);
                    return true;
                case R.id.navigation_history:
                    mTextMessage.setText(R.string.title_history);
                    return true;
            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
