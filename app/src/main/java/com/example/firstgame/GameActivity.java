package com.example.firstgame;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    private ImageView reprendre;
    private int apu = 0;
    private TextView win;
    int clic = 1;
    int clic2 = 1;
    int clic3 = 1;
    int clic4 = 1;
    int clic5 = 1;
    int clic6 = 1;
    int clic7 = 1;
    int clic8 = 1;
    int clic9 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        this.reprendre = findViewById(R.id.imageView2);
        this.win = findViewById(R.id.textView);
        this.button1 = findViewById(R.id.button1);
        this.button2 = findViewById(R.id.button2);
        this.button3 = findViewById(R.id.button3);
        this.button4 = findViewById(R.id.button4);
        this.button5 = findViewById(R.id.button5);
        this.button6 = findViewById(R.id.button6);
        this.button7 = findViewById(R.id.button7);
        this.button8 = findViewById(R.id.button8);
        this.button9 = findViewById(R.id.button9);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                etat(button1);
                if (clic == 1) {
                    apu++;
                }
                clic++;
                win(win);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                etat(button2);
                if (clic2 == 1) {
                    apu++;
                }
                clic2++;
                win(win);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etat(button3);
                if (clic3 == 1) {
                    apu++;
                }
                clic3++;
                win(win);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etat(button4);
                if (clic4 == 1) {
                    apu++;
                }
                clic4++;
                win(win);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etat(button5);
                if (clic5 == 1) {
                    apu++;
                }
                clic5++;
                win(win);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etat(button6);
                if (clic6 == 1) {
                    apu++;
                }
                clic6++;
                win(win);

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int clic7 = 1;
                etat(button7);
                if (clic7 == 1) {
                    apu++;
                }
                clic7++;
                win(win);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etat(button8);
                if (clic8 == 1) {
                    apu++;
                }
                clic8++;
                win(win);

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etat(button9);
                if (clic9 == 1) {
                    apu++;
                }
                clic9++;
                win(win);

            }
        });

        reprendre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recharge = new Intent(getApplicationContext(),GameActivity.class);
                startActivity(recharge);
                finish();
            }
        });

    }


    public  void etat(Button Obj){
        if ((Obj.getText().toString().equals("")) && ((apu % 2) == 0)){
            Obj.setText("O");
            Obj.setTextColor(0xFF038F08);
        }
        if (Obj.getText().toString().equals("") && ((apu % 2) != 0)){
            Obj.setText("X");
            Obj.setTextColor(0xFFCD0101);

        }

    }
    public void wox(TextView view){
        if ((apu % 2 == 0)){
            view.setText("Joueur X a gagné !!");
        }else{
            view.setText("Le joueur O a gagné !!");
        }
        if (apu==9){
            view.setText("Partie Null");
        }
    }
    public void win(TextView view){

        if ((button1.getText().toString().equals("O") && button2.getText().toString().equals("O") && button3.getText().toString().equals("O")) || (button1.getText().toString().equals("X") && button2.getText().toString().equals("X") && button3.getText().toString().equals("X")) ) {
            wox(view);

        }
        if ((button4.getText().toString().equals("O") && button5.getText().toString().equals("O") && button6.getText().toString().equals("O")) || (button4.getText().toString().equals("X") && button5.getText().toString().equals("X") && button6.getText().toString().equals("X")) ) {
            wox(view);

        }
        if ((button7.getText().toString().equals("O") && button8.getText().toString().equals("O") && button9.getText().toString().equals("O")) || (button7.getText().toString().equals("X") && button8.getText().toString().equals("X") && button9.getText().toString().equals("X")) ) {
            wox(view);

        }
        if ((button1.getText().toString().equals("O") && button4.getText().toString().equals("O") && button7.getText().toString().equals("O")) || (button1.getText().toString().equals("X") && button4.getText().toString().equals("X") && button7.getText().toString().equals("X")) ) {
            wox(view);

        }
        if ((button2.getText().toString().equals("O") && button5.getText().toString().equals("O") && button8.getText().toString().equals("O")) || (button2.getText().toString().equals("X") && button5.getText().toString().equals("X") && button8.getText().toString().equals("X")) ) {
            wox(view);

        }
        if ((button3.getText().toString().equals("O") && button6.getText().toString().equals("O") && button9.getText().toString().equals("O")) || (button3.getText().toString().equals("X") && button6.getText().toString().equals("X") && button9.getText().toString().equals("X")) ) {
            wox(view);

        }
        if ((button1.getText().toString().equals("O") && button5.getText().toString().equals("O") && button9.getText().toString().equals("O")) || (button1.getText().toString().equals("X") && button5.getText().toString().equals("X") && button9.getText().toString().equals("X")) ) {
            wox(view);

        }
        if ((button3.getText().toString().equals("O") && button5.getText().toString().equals("O") && button7.getText().toString().equals("O")) || (button3.getText().toString().equals("X") && button5.getText().toString().equals("X") && button7.getText().toString().equals("X")) ) {
            wox(view);

        }
        if (apu==9){
            wox(view);

        }


    }
}

