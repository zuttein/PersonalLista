package com.example.personallista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import androidx.annotation.NonNull;

import java.util.List;

public class PersonalAdapter extends ArrayAdapter<Employee> {
    public PersonalAdapter(Context context, List<Employee> employees) {super(context, 0, employees);}

    @NonNull
    public View getView (int posistion, View convertView, @NonNull ViewGroup parent) {


        View listaPersonalView = convertView;
        if(listaPersonalView == null){
            listaPersonalView = LayoutInflater.from(getContext()).inflate(R.layout.lista_personal, parent, false);
        }

        Employee currentEmployee = getItem(posistion);

        TextView nameTextview = listaPersonalView.findViewById(R.id.tv_name);
        TextView ageTextview = listaPersonalView.findViewById(R.id.tv_age);
        TextView salaryTextview = listaPersonalView.findViewById(R.id.tv_salary);


        nameTextview.setText(currentEmployee.getName());
        ageTextview.setText(currentEmployee.getAge());
        salaryTextview.setText(currentEmployee.getSalary());

        return listaPersonalView;


    }


}
