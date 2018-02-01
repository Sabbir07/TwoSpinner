package com.sabbir.preneurlab.twospinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


//https://stackoverflow.com/questions/16694786/how-to-customize-a-spinner-in-android
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public Spinner spinnerView1, spinnerView2;
    ImageView arrow1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerView1 = (Spinner)findViewById(R.id.spinner1);
        spinnerView2 = (Spinner)findViewById(R.id.spinner2);
        arrow1 = findViewById(R.id.arrow1);

        spinnerView1.setOnItemSelectedListener(this);
        //spinnerView2.setTe


        List<String> listItemsOf1stSpinner = new ArrayList<String>();
        listItemsOf1stSpinner.add("Select Country");
        listItemsOf1stSpinner.add("America");
        listItemsOf1stSpinner.add("Bangladesh");
        listItemsOf1stSpinner.add("India");

        ArrayAdapter<String> dataAdapter1st = new ArrayAdapter<String>(this,
                R.layout.simple_spinner_item, listItemsOf1stSpinner);
        dataAdapter1st.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        dataAdapter1st.notifyDataSetChanged();
        spinnerView1.setAdapter(dataAdapter1st);
        //arrow1.setOnClickListener(new );
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String valueOfSpinner1= String.valueOf(spinnerView1.getSelectedItem());
        //Toast.makeText(this, valueOfSpinner1, Toast.LENGTH_SHORT).show();

        if(valueOfSpinner1.contentEquals("America")) {
            List<String> listItemsOf2ndSpinner = new ArrayList<String>();
            listItemsOf2ndSpinner.add("Select Area");
            listItemsOf2ndSpinner.add("Los Angels");
            listItemsOf2ndSpinner.add("San Francisco");
            listItemsOf2ndSpinner.add("Texas");
            /*ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, listItemsOf2ndSpinner);
            */

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    R.layout.simple_spinner_item, listItemsOf2ndSpinner);
            /*ArrayAdapter<String> dataAdapter = ArrayAdapter.createFromResource(this,
                    R.layout.simple_spinner_item, listItemsOf2ndSpinner);*/
            //dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinnerView2.setAdapter(dataAdapter);

        } else if(valueOfSpinner1.contentEquals("Bangladesh")) {
            List<String> listItemsOf2ndSpinner = new ArrayList<String>();
            listItemsOf2ndSpinner.add("Select Area");
            listItemsOf2ndSpinner.add("Dhaka");
            listItemsOf2ndSpinner.add("Khulna");
            listItemsOf2ndSpinner.add("Rajshahi");
            listItemsOf2ndSpinner.add("Barishal");
            listItemsOf2ndSpinner.add("Chittagang");
            listItemsOf2ndSpinner.add("Sylhet");
            listItemsOf2ndSpinner.add("Rangpur");
            listItemsOf2ndSpinner.add("Mymenshigh");

            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    R.layout.simple_spinner_item, listItemsOf2ndSpinner);
            //dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            spinnerView2.setAdapter(dataAdapter2);

        } else if(valueOfSpinner1.contentEquals("India")) {
            List<String> listItemsOf2ndSpinner = new ArrayList<String>();
            listItemsOf2ndSpinner.add("Select Area");
            listItemsOf2ndSpinner.add("Mumbai");
            listItemsOf2ndSpinner.add("Aasam");
            listItemsOf2ndSpinner.add("Kolkatta");
            listItemsOf2ndSpinner.add("Bihar");


            ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this,
                    R.layout.simple_spinner_item, listItemsOf2ndSpinner);
            dataAdapter3.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            dataAdapter3.notifyDataSetChanged();
            spinnerView2.setAdapter(dataAdapter3);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
