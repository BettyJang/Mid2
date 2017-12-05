package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final  int FUNC_LOGIN1 = 1;
    public static final  int FUNC_LOGIN2 = 2;
    public static final  int FUNC_LOGIN3 = 3;
    public static final  int FUNC_LOGIN4 = 4;
    public static final  int FUNC_LOGIN5 = 5;
    public static final  int FUNC_LOGIN6 = 6;
    public static final  int FUNC_LOGIN7 = 7;
    public static final  int FUNC_LOGIN8 = 8;


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FUNC_LOGIN1){
            if (resultCode == RESULT_OK){

            }else {
                finish();
            }
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(getIntent(),FUNC_LOGIN1);
            }
        });
    }
}

