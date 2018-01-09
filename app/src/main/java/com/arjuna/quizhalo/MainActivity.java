package com.arjuna.quizhalo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //tipe tipe data
    String nis = "200101010";
    String nama = "Roy Simbiring";
    String alamat = "Jl Kijang No 2 , Pesanggarahan, Jawa Barat";
    String kota = "Bogor";
    String kodepos = "16830";
    String telepon = "29990010101";
    String handphone = "0812811111";
    String email = "roy@sembiring.com";

    // deklarasi widget
    TextView Nis, Nama, Alamat, Kota, Kodepos, Telepon, Handphone, Email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memanggil id dari textview
        Nama = (TextView) findViewById(R.id.Nama);
        Nis = (TextView) findViewById(R.id.Nis);
        Kota = (TextView) findViewById(R.id.Kota);
        Alamat = (TextView) findViewById(R.id.Alamat);
        Kodepos = (TextView) findViewById(R.id.Kode);
        Telepon = (TextView) findViewById(R.id.Telepon);
        Handphone = (TextView) findViewById(R.id.Handphone);
        Email = (TextView) findViewById(R.id.Email);


        //menampilkan hasil ke textview
        Nis.setText(nis);
        Nama.setText(nama);
        Alamat.setText(alamat);
        Kota.setText(kota);
        Kodepos.setText(kodepos);
        Telepon.setText(telepon);
        Handphone.setText(handphone);
        Email.setText(email);
    }
}
