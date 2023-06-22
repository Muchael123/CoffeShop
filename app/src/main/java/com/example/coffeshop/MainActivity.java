package com.example.coffeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.display);
        add = findViewById(R.id.add);
        order = findViewById(R.id.order);
        minus = findViewById(R.id.minus);
        txt2= findViewById(R.id.txt2);
        mandazi = findViewById(R.id.mandazi);
        txt3 =findViewById(R.id.txt3);
        edtxt = findViewById(R.id.edtxt);
    }
    public void minus(View view){
        String no = txt.getText().toString();
        String name = edtxt.getText().toString();
        int num = Integer.parseInt(no);
        if(num > 0){
            if (isChecked){
                String result = txt3.getText().toString();
                txt3.setText(result+"1 mandazi @ 200" );
            }
            num = num-1;
            txt.setText(String.valueOf(num));
            int Cprice = 120;
            int total = num*Cprice;
            txt2.setText("Number of coffee: "+txt.getText());
            txt3.setText("Hello "+name+"\n"+num+" coffee @"+Cprice+"\nYour Total: "+(num*120));
//            Toast.makeText(this,   "no of coffee: "+txt.getText()+"\n Total: " + total, Toast.LENGTH_SHORT).show();
        }
        else{
            txt2.setText("Number of coffee:"+ num);
            Toast.makeText(this,   "Ordered coffee can not be less than 1", Toast.LENGTH_SHORT).show();
        }


    }
    public void add(View view){
        String no = txt.getText().toString();
        int num = Integer.parseInt(no);
        num = num+1;
        String name = edtxt.getText().toString();
        if(num > 0){

            txt.setText(String.valueOf(num));
            int Cprice = 120;
            int total = num*Cprice;
            txt2.setText("Number of coffee: "+txt.getText());
            txt3.setText("Hello "+name+"\n "+num+" coffee @"+Cprice+"\nYour Total: "+(num*120));
//            Toast.makeText(this,   "no of coffee: "+txt.getText()+"\n Total: " + total, Toast.LENGTH_SHORT).show();
        }
        else{
            txt2.setText("Number of coffee:"+ num);
            txt3.setText("Hello "+name+"\nYour Total: cannot be 0 (zero)");
            Toast.makeText(this,   "Ordered coffee can not be less than 1", Toast.LENGTH_SHORT).show();
        }

    }
    public void order(View view){
        String name = edtxt.getText().toString();
        String num1 = txt.getText().toString();
        int num = Integer.parseInt(num1);
        if (num > 0){
            txt3.setText("Hey "+name+"\nYour Total: "+(num*120));
        }
        else{
            txt3.setText("Hey "+name+"\nYour Total: cannot be 0 (zero)");
        }
    }
    TextView txt;
    Button add;
    CheckBox mandazi;
    EditText edtxt;
    TextView txt3;
    Button order;
    Button minus;
    TextView txt2;
}