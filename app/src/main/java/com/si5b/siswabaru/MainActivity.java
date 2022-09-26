package com.si5b.siswabaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNomorPendaftaraan, etNama;
    Button btnDaftar;
    String nomorPendaftaraan, nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaraan = findViewById(R.id.et_nomor_pendaftaraan);
        etNama = findViewById(R.id.et_nama);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomorPendaftaraan = etNomorPendaftaraan.getText().toString();
                nama = etNama.getText().toString();

                if(nomorPendaftaraan.trim().equals("")){
                    etNomorPendaftaraan.setError("Nomor Pendaftaraan Harus Diisi!");
                }
                else if (nama.trim().equals("")){
                    etNama.setError("Nama Harus Diisi");
                }
                else {
                    Toast.makeText(MainActivity.this, "Selamat " + nama + " Anda Terdaftar", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}