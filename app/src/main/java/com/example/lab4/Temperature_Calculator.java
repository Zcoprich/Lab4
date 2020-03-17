package com.example.lab4;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import android.view.View.OnClickListener;
import android.widget.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class Temperature_Calculator extends Fragment implements OnClickListener {

    double celsius;
    double fahrenheit;
    TextView f_edit;
    TextView c_edit;


    public Temperature_Calculator() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_temperature__calculator, container, false);

        f_edit = (TextView)view.findViewById(R.id.f_edit);
        c_edit = (TextView)view.findViewById(R.id.c_edit);

        Button b = (Button)view.findViewById(R.id.t_button);
        b.setOnClickListener( this );

        return view;

    }

    @Override
    public void onClick(View v) {

        String f = f_edit.getText().toString();
        String c = c_edit.getText().toString();

        if(f.equals("")){

            if(!c.equals("")){

                celsius = Double.parseDouble(c);
                fahrenheit = (celsius * (9.0 / 5.0)) + 32;

                f_edit.setText(Double.toString(fahrenheit));

            }

        }

        else{

            fahrenheit = Double.parseDouble(f);
            celsius = ((fahrenheit - 32) * (5.0 / 9.0));

            c_edit.setText(Double.toString(celsius));

        }

    }


}
