package com.example.uts_pab1_rafli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnDaftar;
    EditText et_Nama_Lengkap, et_Nomor_Pendaftaran;
    Spinner sp_Jalur_Pendaftaran;
    CheckBox cb_Konfirmasi_Daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String namalengkap = et_Nama_Lengkap.getText().toString();
        String nomorpendaftaran = et_Nomor_Pendaftaran.getText().toString();
        String jalurpendaftar = sp_Jalur_Pendaftaran.getSelectedItem().toString();

        if (namalengkap.trim().equals(""))
        {
            et_Nama_Lengkap.setError("Nama Lengkap Harus Diisi");
        }
        else if (nomorpendaftaran.trim().equals(""))
        {
            et_Nomor_Pendaftaran.setError("Nomor Pendaftaran Harus Diisi");
        }
        else if (jalurpendaftar.trim().equals("Jalur Pendaftaran")
        {
            Toast.makeText(MainActivity.this, "Pilih Jalur Pendaftaran Anda", Toast.LENGTH_SHORT).show();
        }
        else if (cb_Konfirmasi_Daftar.isChecked()==false)
        {
            Toast.makeText(MainActivity.this, "Anda Belum Mengkonfirmasi!", Toast.LENGTH_SHORT).show();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Formulir Pendaftaran");

        et_Nama_Lengkap = (EditText) findViewById(R.id.et_Nama_Lengkap);
        et_Nomor_Pendaftaran = (EditText) findViewById(R.id.et_Nomor_Pendaftaran);
        btnDaftar = findViewById(R.id.bt_Daftar);
        cb_Konfirmasi_Daftar = findViewById(R.id.cb_Konfirmasi_Daftar);
        sp_Jalur_Pendaftaran = findViewById(R.id.sp_Jalur_Pendaftaran);






    }
}