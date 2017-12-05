package com.fju.mid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Func1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }
    public void login (View view){
      setResult(RESULT_OK,getIntent());
        finish();
    }
}
