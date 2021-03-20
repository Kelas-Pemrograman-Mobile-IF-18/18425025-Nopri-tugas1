package com.nopri.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtnama,txtttg,txtagama,txtalamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnama = (TextView) findViewById(R.id.txtnama);
        txtnama.setText("Nama : "+"Muhammad Nopriansyah ");

        txtnama = (TextView) findViewById(R.id.tanggallahir);
        txtnama.setText("TTL : "+"Bandar Lampung, 19 November 1999 ");

        txtnama = (TextView) findViewById(R.id.agama);
        txtnama.setText("Agama : "+"Islam ");

        txtnama = (TextView) findViewById(R.id.alamat);
        txtnama.setText("Alamat : "+"Gedung Air ");

    }
}