package com.nkdroid.audio.download.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnDownload;
    String URL="http://www.sample-videos.com/audio/mp3/india-national-anthem.mp3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDownload= (Button) findViewById(R.id.btnDownload);

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DownloadTask(MainActivity.this,URL);
            }
        });
    }
}
