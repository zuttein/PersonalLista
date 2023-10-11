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

        //Sätter id på samtliga element
        personalLista = findViewById(R.id.lv_personal);
        backbutton = findViewById(R.id.btn_back);



        // Skapar en anpassad adapter för att visa listan över anställda
        PersonalAdapter adapter = new PersonalAdapter(this, DataManager.employees);

        adapter.notifyDataSetChanged();

        // Kopplar adaptern till listview för att visa anställda i listan
        personalLista.setAdapter(adapter);


        backbutton.setOnClickListener(new View.OnClickListener() {

            //Tar användaren tillbaka till första aktiviteten
            @Override
            public void onClick(View view) {
                finish();

            }
        });






    }
}