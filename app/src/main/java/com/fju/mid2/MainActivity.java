package com.fju.mid2;



import android.content.Intent;
import android.icu.util.ValueIterator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
public static final int Func3 = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
   public void func1(View view){
        int func1 = 1;
       Intent intent = new Intent(this,Func1Activity.class);
       startActivityForResult(intent,func1);
   }
    public  void  func2(View view){
       int func2 = 2;
       Intent intent = new Intent(this,Func2Activity.class);
       startActivityForResult(intent,func2);
    }
    public void  func3(View view){
        int func3 = 3;
        Intent intent = new Intent(this,Func3Activity.class);
        startActivityForResult(intent,func3);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            if (resultCode == RESULT_OK) {
                Toast.makeText(this, "特殊功能", Toast.LENGTH_LONG).show();
            }
        }
    public void func4(View view){
        int func4 = 4;
        Intent intent = new Intent(this,Func4Activity.class);
        startActivityForResult(intent,func4);
    }
    public void func5(View view){
        int func5 = 5;
        Intent intent = new Intent(this,Func5Activity.class);
        startActivityForResult(intent,func5);
    }
    public void func6(View view){
        int func6 = 6;
        Intent intent = new Intent(this,Func6Activity.class);
        startActivityForResult(intent,func6);
    }
    public void func7(View view){
        int func7 = 7;
        Intent intent = new Intent(this,Func7Activity.class);
        startActivityForResult(intent,func7);
    }

    @Override
    public void onActivityReenter(int resultCode, Intent data) {
        super.onActivityReenter(resultCode, data);
        if (resultCode == RESULT_OK){
            Toast.makeText(this,"特殊功能",Toast.LENGTH_LONG).show();
        }
    }
    public void func8(View view){
        int func8 = 8;
        Intent intent = new Intent(this,Func8Activity.class);
        startActivityForResult(intent,func8);
    }
}


