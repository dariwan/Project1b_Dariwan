package com.example.project1b_dariwan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText angka1, angka2;
    Button tambah, bagi, kurang, kali, clear;
    TextView HasilAkhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = (EditText)findViewById(R.id.input1);
        angka2 = (EditText)findViewById(R.id.input2);
        tambah = (Button)findViewById(R.id.btnTambah);
        kurang = (Button)findViewById(R.id.btnKurang);
        bagi = (Button)findViewById(R.id.btnBagi);
        kali = (Button)findViewById(R.id.btnKali);
        clear = (Button)findViewById(R.id.btnClear);
        HasilAkhir = (TextView)findViewById(R.id.hasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()>0) && (angka2.getText().length()>0)){
                    double angkaPertama = Double.parseDouble(angka1.getText().toString());
                    double angkakedua = Double.parseDouble(angka2.getText().toString());
                    double hasil = angkaPertama + angkakedua;
                    HasilAkhir.setText(Double.toString(hasil));
                }
                else{
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()>0) && (angka2.getText().length()>0)){
                    double angkaPertama = Double.parseDouble(angka1.getText().toString());
                    double angkakedua = Double.parseDouble(angka2.getText().toString());
                    double hasil = angkaPertama - angkakedua;
                    HasilAkhir.setText(Double.toString(hasil));
                }
                else{
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()>0) && (angka2.getText().length()>0)){
                    double angkaPertama = Double.parseDouble(angka1.getText().toString());
                    double angkakedua = Double.parseDouble(angka2.getText().toString());
                    double hasil = angkaPertama / angkakedua;
                    HasilAkhir.setText(Double.toString(hasil));
                }
                else{
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()>0) && (angka2.getText().length()>0)){
                    double angkaPertama = Double.parseDouble(angka1.getText().toString());
                    double angkakedua = Double.parseDouble(angka2.getText().toString());
                    double hasil = angkaPertama * angkakedua;
                    HasilAkhir.setText(Double.toString(hasil));
                }
                else{
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1.setText("");
                angka2.setText("");
                HasilAkhir.setText("0");
                angka1.requestFocus();
            }
        });

    }
}