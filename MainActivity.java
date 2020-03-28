package com.example.belajarintentpertama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggil(View view){
        String nomor = "0895371971191";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri. fromParts("tel", nomor, null));
        startActivity(panggil);
    }

    public void buka(View view){
        String url = "https://smkn4bdg.sch.id";
        Intent bukaBrowser = new Intent(Intent.ACTION_VIEW);
        bukaBrowser.setData(Uri.parse(url));
        startActivity(bukaBrowser);
    }

    public void tentang(View view){
        Intent tentang = new Intent(MainActivity.this, Activity_tentang.class);
        startActivity(tentang);
    }
}
