package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Func1Activity extends AppCompatActivity {
    private TextView roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }
   public void dice(View view){
        int d = new Random().nextInt(6)+1;
        new AlertDialog.Builder(this).setTitle("Roll the Dice")
                .setMessage("Number"+d).setPositiveButton("OK",null)
                .show();
   }
}