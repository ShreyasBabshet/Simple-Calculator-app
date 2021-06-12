package com.sbexample.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double first;
    private double second;
    private double res;
    private String operator;
    private String ans;
    private TextView textview1,textview2;
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnac,btnb,btnper,btnplus,btndiv,
                btnminus,btnmul,btndot,btneql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview1=findViewById(R.id.textview1);
        textview2=findViewById(R.id.textview2);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnac=findViewById(R.id.btnac);
        btnb=findViewById(R.id.btnb);
        btnper=findViewById(R.id.btnper);
        btndiv=findViewById(R.id.btndiv);
        btnplus=findViewById(R.id.btnplus);
        btnminus=findViewById(R.id.btnminus);
        btnmul=findViewById(R.id.btnmul);
        btndot=findViewById(R.id.btndot);
        btneql=findViewById(R.id.btneql);

        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(null);
                textview1.setText(null);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=textview2.getText().toString()+btn0.getText().toString();
                textview2.setText(text);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=textview2.getText().toString()+btn1.getText().toString();
                textview2.setText(text);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=textview2.getText().toString()+btn2.getText().toString();
                textview2.setText(text);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=textview2.getText().toString()+btn3.getText().toString();
                textview2.setText(text);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=textview2.getText().toString()+btn4.getText().toString();
                textview2.setText(text);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=textview2.getText().toString()+btn5.getText().toString();
                textview2.setText(text);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=textview2.getText().toString()+btn6.getText().toString();
                textview2.setText(text);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=textview2.getText().toString()+btn7.getText().toString();
                textview2.setText(text);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=textview2.getText().toString()+btn8.getText().toString();
                textview2.setText(text);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=textview2.getText().toString()+btn9.getText().toString();
                textview2.setText(text);
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=textview2.getText().toString()+btndot.getText().toString();
                textview2.setText(text);
            }
        });

        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String backspace=null;
                if(textview2.getText().length()>0){
                    StringBuilder stringBuilder=new StringBuilder(textview2.getText());
                    stringBuilder.deleteCharAt(textview2.getText().length()-1);
                    backspace=stringBuilder.toString();
                    textview2.setText(backspace);
                }
            }
        });


        btnper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) textview2.getText());
                primary=String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operator="%";
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) textview2.getText());
                primary=String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operator="/";
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) textview2.getText());
                primary=String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operator="+";
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) textview2.getText());
                primary=String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operator="-";
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) textview2.getText());
                primary=String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operator="*";
            }
        });

        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText(null);
                textview1.setText(null);
            }
        });
        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second=Double.parseDouble((String)textview2.getText());
                if (operator == "+") {
                    res=first+second;
                    ans=String.format("%.2f",res);
                    textview2.setText(ans);
                    textview1.setText(null);
                }
                if (operator == "-") {
                    res=first-second;
                    ans=String.format("%.2f",res);
                    textview2.setText(ans);
                    textview1.setText(null);
                }
                if (operator == "*") {
                    res=first*second;
                    ans=String.format("%.2f",res);
                    textview2.setText(ans);
                    textview1.setText(null);
                }
                if (operator == "/") {
                    if(second==0){
                        textview2.setText("Invalid");
                        textview1.setText(null);
                    }
                    else{
                        res=first/second;
                        ans=String.format("%.2f",res);
                        textview2.setText(ans);
                        textview1.setText(null);
                    }
                }
                if (operator == "%") {
                    res=first%second;
                    ans=String.format("%.2f",res);
                    textview2.setText(ans);
                    textview1.setText(null);
                }
            }
        });

    }
}
