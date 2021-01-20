package com.mohammed.sum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Finl,textF,textS;
    EditText editText,editText2;
    Button s,sub,m,d,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.editText);
        editText2=(EditText) findViewById(R.id.editText2);
        Finl=(TextView)findViewById(R.id.Finl);
        s=(Button)findViewById(R.id.s);
        sub=(Button)findViewById(R.id.sub);
        m=(Button)findViewById(R.id.m);
        d=(Button)findViewById(R.id.d);
        c=(Button)findViewById(R.id.c);
        textF=(TextView)findViewById(R.id.textF);

    }
    public void s(View v){

        String a=editText.getText().toString();
        String b=editText2.getText().toString();
        float a1=Float.parseFloat(a);
        float b1=Float.parseFloat(b);
        float f=a1+b1;
        Finl.setText(String.valueOf(f));
    }
    public void sub(View v){

        String a=editText.getText().toString();
        String b=editText2.getText().toString();
        float a1=Float.parseFloat(a);
        float b1=Float.parseFloat(b);
        float f=a1-b1;
        Finl.setText(String.valueOf(f));
    }
    public void d(View v){

        String a=editText.getText().toString();
        String b=editText2.getText().toString();
        float a1=Float.parseFloat(a);
        float b1=Float.parseFloat(b);
        if(a1<=0){
            textF.setText("error");
          }


        float f=a1/b1;
        Finl.setText(String.valueOf(f));
    }
    public void m(View v){

        String a=editText.getText().toString();
        String b=editText2.getText().toString();
        float a1=Float.parseFloat(a);
        float b1=Float.parseFloat(b);
        float f=a1*b1;
        Finl.setText(String.valueOf(f));
    }
    public void c(View v){
        editText.setText("");
        editText2.setText("");
        Finl.setText("");
        textF.setText("الرقم الاول");
    }
}
