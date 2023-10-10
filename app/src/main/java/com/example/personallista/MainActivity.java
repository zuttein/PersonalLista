package com.example.personallista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameInput;
    EditText ageInput;
    EditText salaryInput;

    DataManager dataManager = new DataManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = findViewById(R.id.name);
        ageInput = findViewById(R.id.age);
        salaryInput = findViewById(R.id.salary);
        Button registerButton = findViewById(R.id.register);
        Button employeeListButton = findViewById(R.id.employee_list);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameInput.getText().toString();
                String age = ageInput.getText().toString();
                String salary = salaryInput.getText().toString();


                if (name.isEmpty() || age.isEmpty() || salary.isEmpty()) {
                    Toast.makeText(MainActivity.this, R.string.toast_wrong_input, Toast.LENGTH_SHORT).show();
                } else {

                    Employee e = dataManager.createEmployee(name, age, salary);
                    Toast.makeText(MainActivity.this, R.string.toast_registrered, Toast.LENGTH_SHORT).show();
                }
            }

        });


        employeeListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, personal_lista.class);
                startActivity(intent);




            }
        });






    }
}