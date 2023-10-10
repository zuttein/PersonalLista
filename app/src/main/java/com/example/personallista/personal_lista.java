package com.example.personallista;

import static com.example.personallista.R.id.btn_back;
import static com.example.personallista.R.id.lv_personal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class personal_lista extends AppCompatActivity {

    ListView personalLista;
    Button backbutton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_lista);


        personalLista = findViewById(lv_personal);
        backbutton = findViewById(btn_back);

        PersonalAdapter adapter = new PersonalAdapter(this, DataManager.employees);

        adapter.notifyDataSetChanged();
        personalLista.setAdapter(adapter);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {finish();

            }
        });






    }
}