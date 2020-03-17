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
public class Distance_Calculator extends Fragment implements OnClickListener {


    double miles;
    double kilometer;
    TextView m_edit;
    TextView k_edit;

    public Distance_Calculator() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_distance__calculator, container, false);

        m_edit = (TextView)view.findViewById(R.id.m_edit);
        k_edit = (TextView)view.findViewById(R.id.k_edit);

        Button b = (Button)view.findViewById(R.id.d_button);
        b.setOnClickListener( this );

        return view;

    }

    //@Override
    public void onClick(View v) {

        String m = m_edit.getText().toString();
        String k = k_edit.getText().toString();

        if(m.equals("")){

            if(!k.equals("")){

                kilometer = Double.parseDouble(k);
                miles = kilometer * 0.6214;

                m_edit.setText(Double.toString(miles));

            }

        }

        else{

            miles = Double.parseDouble(m);
            kilometer = miles / 0.6214;

            k_edit.setText(Double.toString(kilometer));

        }

    }

}
