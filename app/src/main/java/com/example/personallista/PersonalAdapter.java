package com.example.personallista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import androidx.annotation.NonNull;

import java.util.List;

//Controller för views och att hämta in employees och skickar in i listviewn

public class PersonalAdapter extends ArrayAdapter<Employee> {
    public PersonalAdapter(Context context, List<Employee> employees) {
        super(context, 0, employees);}

    @NonNull
    public View getView (int posistion, View convertView, @NonNull ViewGroup parent) {


        View listaPersonalView = convertView;

        //Inflatar min nya adapter i Listviewn

        if(listaPersonalView == null){
            listaPersonalView = LayoutInflater.from(getContext()).inflate(R.layout.lista_personal, parent, false);
        }
        // Hämtar den aktuella anställda från listan
        Employee currentEmployee = getItem(posistion);

        //Sätter id på samtliga element
        TextView nameTextview = listaPersonalView.findViewById(R.id.tv_name);
        TextView ageTextview = listaPersonalView.findViewById(R.id.tv_age);
        TextView salaryTextview = listaPersonalView.findViewById(R.id.tv_salary);

        //Lägger in användarens inmatning i Listviewn
        nameTextview.setText(currentEmployee.getName());
        ageTextview.setText(currentEmployee.getAge());
        salaryTextview.setText(currentEmployee.getSalary());

        return listaPersonalView;


    }


}
