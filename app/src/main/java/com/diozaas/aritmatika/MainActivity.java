package com.diozaas.aritmatika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_nilai1, edt_nilai2;
    Button btn_plus, btn_substract, btn_multiplication, btn_division;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_nilai1 = findViewById(R.id.edt_nilaipertama);
        edt_nilai2 = findViewById(R.id.edt_nilaikedua);
        btn_plus = findViewById(R.id.btn_tambah);
        btn_substract = findViewById(R.id.btn_kurang);
        btn_multiplication = findViewById(R.id.btn_kali);
        btn_division = findViewById(R.id.btn_bagi);
        tv_result = findViewById(R.id.tv_hasil);

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ambilNilaiPertama = edt_nilai1.getText().toString();
                String ambilNilaiKedua = edt_nilai2.getText().toString();

                int result = Integer.parseInt(ambilNilaiPertama) + Integer.parseInt(ambilNilaiKedua);
                tv_result.setText(String.valueOf(result));
            }
        });

        btn_substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ambilNilaiPertama = edt_nilai1.getText().toString();
                String ambilNilaiKedua = edt_nilai2.getText().toString();

                int result = Integer.parseInt(ambilNilaiPertama) - Integer.parseInt(ambilNilaiKedua);
                tv_result.setText(String.valueOf(result));

            }
        });

        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ambilNilaiPertama = edt_nilai1.getText().toString();
                String ambilNilaiKedua = edt_nilai2.getText().toString();

                int result = Integer.parseInt(ambilNilaiPertama) * Integer.parseInt(ambilNilaiKedua);
                tv_result.setText(String.valueOf(result));
            }
        });

        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ambilNilaiPertama = edt_nilai1.getText().toString();
                String ambilNilaiKedua = edt_nilai2.getText().toString();

                int result = Integer.parseInt(ambilNilaiPertama) / Integer.parseInt(ambilNilaiKedua);
                tv_result.setText(String.valueOf(result));
            }
        });
    }
}
