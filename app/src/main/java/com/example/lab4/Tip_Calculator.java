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
public class Tip_Calculator extends Fragment implements OnClickListener {


    double bill;
    double percentage;
    double num;
    double tip;

    TextView b_edit;
    TextView p_edit;
    TextView num_edit;
    TextView tip_edit;

    public Tip_Calculator() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tip__calculator, container, false);

        b_edit = (TextView) view.findViewById(R.id.b_edit);
        p_edit = (TextView) view.findViewById(R.id.p_edit);
        num_edit = (TextView) view.findViewById(R.id.num_edit);
        tip_edit = (TextView) view.findViewById(R.id.tip_edit);

        Button b = (Button) view.findViewById(R.id.tip_button);
        b.setOnClickListener(this);

        return view;

    }

    //@Override
    public void onClick(View v) {

        String b = b_edit.getText().toString();
        String p = p_edit.getText().toString();
        String n = num_edit.getText().toString();

        double temp;


        if(!b.equals("")){

            if(p.equals(""))
                p = "0.1";
            if(n.equals(""))
                n = "1";

            bill = Double.parseDouble(b);
            percentage = Double.parseDouble(p);
            num = Double.parseDouble(n);

            temp = bill * percentage;

            tip = temp/num;

            tip_edit.setText(Double.toString(tip));
        }
    }
}

