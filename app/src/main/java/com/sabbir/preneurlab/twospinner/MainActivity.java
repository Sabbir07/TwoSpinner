package com.sabbir.preneurlab.twospinner;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


//https://stackoverflow.com/questions/16694786/how-to-customize-a-spinner-in-android
public class MainActivity extends AppCompatActivity{

    public Spinner spinnerView1, spinnerView2;
    ImageView arrow1;
    Button checkButton;
    int flag=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();

        spinnerView1 = (Spinner)findViewById(R.id.spinner1);
        spinnerView2 = (Spinner)findViewById(R.id.spinner2);
        arrow1 = findViewById(R.id.arrow1);
        checkButton = findViewById(R.id.button);

        //spinnerView1.setOnItemSelectedListener(this);
        //spinnerView2.setOnItemSelectedListener(this);


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


        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, spinnerView1.getSelectedItem().toString() + spinnerView2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

                if (spinnerView1.getSelectedItem().toString()=="Select Country" ||
                        spinnerView2.getSelectedItem().toString()=="Select Area"){
                    //Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();
                    alertDialog.setTitle("Uprgade");
                    alertDialog.setMessage("Field is empty, please select both fields.");
                    alertDialog.show();
                } else {
                    Toast.makeText(MainActivity.this, spinnerView1.getSelectedItem().toString() +
                            " & " + spinnerView2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        spinnerView1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valueOfSpinner1= String.valueOf(spinnerView1.getSelectedItem());

                //Toast.makeText(this, valueOfSpinner1, Toast.LENGTH_SHORT).show();
                //Toast.makeText(this, spinnerView1.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

                if(valueOfSpinner1.contentEquals("Select Country")) {
                    List<String> listItemsOf2ndSpinner = new ArrayList<String>();
                    listItemsOf2ndSpinner.add("");
                    ArrayAdapter<String> dataAdapter0 = new ArrayAdapter<String>(MainActivity.this,
                            R.layout.simple_spinner_item, listItemsOf2ndSpinner);
                    dataAdapter0.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
                    dataAdapter0.notifyDataSetChanged();
                    spinnerView2.setAdapter(dataAdapter0);
                    flag = 0;
                    //Toast.makeText(this, spinnerView2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

                } else if(valueOfSpinner1.contentEquals("America")) {
                    List<String> listItemsOf2ndSpinner = new ArrayList<String>();
                    listItemsOf2ndSpinner.add("Select Area");
                    listItemsOf2ndSpinner.add("Los Angels");
                    listItemsOf2ndSpinner.add("San Francisco");
                    listItemsOf2ndSpinner.add("Texas");
            /*ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, listItemsOf2ndSpinner);
            */

                    ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(MainActivity.this,
                            R.layout.simple_spinner_item, listItemsOf2ndSpinner);
                    /*ArrayAdapter<String> dataAdapter = ArrayAdapter.createFromResource(this,
                    R.layout.simple_spinner_item, listItemsOf2ndSpinner);*/
                    //dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
                    dataAdapter.notifyDataSetChanged();
                    spinnerView2.setAdapter(dataAdapter);
                    flag = 1;
                    //Toast.makeText(this, spinnerView2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

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

                    ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(MainActivity.this,
                            R.layout.simple_spinner_item, listItemsOf2ndSpinner);
                    //dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter2.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
                    dataAdapter2.notifyDataSetChanged();
                    spinnerView2.setAdapter(dataAdapter2);
                    flag = 1;
                    //Toast.makeText(this, spinnerView2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

                } else if(valueOfSpinner1.contentEquals("India")) {
                    List<String> listItemsOf2ndSpinner = new ArrayList<String>();
                    listItemsOf2ndSpinner.add("Select Area");
                    listItemsOf2ndSpinner.add("Mumbai");
                    listItemsOf2ndSpinner.add("Aasam");
                    listItemsOf2ndSpinner.add("Kolkatta");
                    listItemsOf2ndSpinner.add("Bihar");


                    ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(MainActivity.this,
                            R.layout.simple_spinner_item, listItemsOf2ndSpinner);
                    dataAdapter3.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
                    dataAdapter3.notifyDataSetChanged();
                    spinnerView2.setAdapter(dataAdapter3);
                    flag = 1;
                    //Toast.makeText(this, spinnerView2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        /*spinnerView2.onClick(){

        };*/


        spinnerView2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valueOfSpinner2= String.valueOf(spinnerView2.getSelectedItem());
                //if (valueOfSpinner2.contentEquals(""))
                /*if (flag == 0)
                    Toast.makeText(MainActivity.this, valueOfSpinner2, Toast.LENGTH_SHORT).show();
                */
                if (valueOfSpinner2.contentEquals("")){
                    alertDialog.setMessage("Set country first");
                    //alertDialog.setButton();
                    alertDialog.show();
                } /*else if (valueOfSpinner2.contentEquals("Dhaka")){
                    Toast.makeText(MainActivity.this, "Holy", Toast.LENGTH_SHORT).show();
                }*/
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
/*
    private void alertDialog2() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                MainActivity.this);
        alertDialogBuilder.setMessage("Please select country and area.")
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }*/


    /*@Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String valueOfSpinner1= String.valueOf(spinnerView1.getSelectedItem());

        //Toast.makeText(this, valueOfSpinner1, Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, spinnerView1.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

        if(valueOfSpinner1.contentEquals("Select Country")) {
            List<String> listItemsOf2ndSpinner = new ArrayList<String>();
            listItemsOf2ndSpinner.add("");
            ArrayAdapter<String> dataAdapter0 = new ArrayAdapter<String>(this,
                    R.layout.simple_spinner_item, listItemsOf2ndSpinner);
            dataAdapter0.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            dataAdapter0.notifyDataSetChanged();
            spinnerView2.setAdapter(dataAdapter0);
            //Toast.makeText(this, spinnerView2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

        } else if(valueOfSpinner1.contentEquals("America")) {
            List<String> listItemsOf2ndSpinner = new ArrayList<String>();
            listItemsOf2ndSpinner.add("Select Area");
            listItemsOf2ndSpinner.add("Los Angels");
            listItemsOf2ndSpinner.add("San Francisco");
            listItemsOf2ndSpinner.add("Texas");
            *//*ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, listItemsOf2ndSpinner);
            *//*

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    R.layout.simple_spinner_item, listItemsOf2ndSpinner);
            *//*ArrayAdapter<String> dataAdapter = ArrayAdapter.createFromResource(this,
                    R.layout.simple_spinner_item, listItemsOf2ndSpinner);*//*
            //dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinnerView2.setAdapter(dataAdapter);
            //Toast.makeText(this, spinnerView2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

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
            //Toast.makeText(this, spinnerView2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

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
            //Toast.makeText(this, spinnerView2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
        }
        //Toast.makeText(this, spinnerView2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }*/
/*
    public void spinnerTwo(View view) {

        if (spinnerView1.getSelectedItem().toString()=="Select Country"){
            Toast.makeText(this, "CJFKGJ", Toast.LENGTH_SHORT).show();
        }
    }*/
}
