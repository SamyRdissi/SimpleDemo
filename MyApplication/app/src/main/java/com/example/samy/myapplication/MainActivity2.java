package com.example.samy.myapplication;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);


        RadioButton radioButton = (RadioButton)findViewById(R.id.checkBox1);


        radioButton.setText(Html.fromHtml("I have read and agree to the " +
                "<font color=\"red\"><a href='id.web.freelancer.example.TCActivity://Kode'>TERMS AND CONDITIONS</a></font>bdkqbdsqbdbsqdbqsbdsdbsqbdsbdxbqsbdqshbdqsbdbqskbdqsbdkqsbdbqsdbqsbd"));

        radioButton.setClickable(true);
        radioButton.setMovementMethod(LinkMovementMethod.getInstance());



    }
}
