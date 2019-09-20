package com.example.androidtictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });

    }

    void KiemTra(){
        checkX(button1,button2,button3);
        checkX(button4,button5,button6);
        checkX(button7,button8,button9);
        checkX(button1,button4,button7);
        checkX(button2,button5,button8);
        checkX(button3,button6,button9);
        checkX(button1,button5,button9);
        checkX(button3,button5,button8);

        checkO(button1,button2,button3);
        checkO(button4,button5,button6);
        checkO(button7,button8,button9);
        checkO(button1,button4,button7);
        checkO(button2,button5,button8);
        checkO(button3,button6,button9);
        checkO(button1,button5,button9);
        checkO(button3,button5,button8);
    }


    int count = 0;
    void click(View view){
        if (count==0 && ((Button) view).getText()==""){
            ((Button) view).setText("X");
            count++;
        }
        else if (count==1 && ((Button) view).getText()==""){
            ((Button) view).setText("O");
            count--;
        }
        KiemTra();
    }
    void checkX(Button bt1, Button bt2, Button bt3){
        if ( bt1.getText().equals("X") && bt2.getText().equals("X") && bt3.getText().equals("X") ){
            Toast.makeText(this, "X Win", Toast.LENGTH_SHORT).show();
            setStart();
        }
    }

    void checkO(Button bt1, Button bt2, Button bt3){
        if ( bt1.getText().equals("O") && bt2.getText().equals("O") && bt3.getText().equals("O") ){
            Toast.makeText(this, "O Win", Toast.LENGTH_SHORT).show();
            setStart();
        }
    }

    void setStart(){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }
}
