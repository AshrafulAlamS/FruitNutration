package com.mdashrafulalam.fruitnutration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayout_apple;
    private LinearLayout linearLayout_banana;
    private LinearLayout linearLayout_cherries;
    private LinearLayout linearLayout_coconut;
    private LinearLayout linearLayout_grape;
    private LinearLayout linearLayout_guava;
    private LinearLayout linearLayout_lemon;
    private LinearLayout linearLayout_lime;
    private LinearLayout linearLayout_lychee;
    private LinearLayout linearLayout_mango;
    private LinearLayout linearLayout_olive;
    private LinearLayout linearLayout_orange;
    private Button button_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout_apple=findViewById(R.id.apple_Id);
        linearLayout_banana=findViewById(R.id.banana_Id);
        linearLayout_cherries=findViewById(R.id.cherries_Id);
        linearLayout_coconut=findViewById(R.id.coconut_Id);
        linearLayout_grape=findViewById(R.id.grape_Id);
        linearLayout_guava=findViewById(R.id.guava_Id);
        linearLayout_lemon=findViewById(R.id.lemon_Id);
        linearLayout_lime=findViewById(R.id.lime_Id);
        linearLayout_lychee=findViewById(R.id.lychee_Id);
        linearLayout_mango=findViewById(R.id.mango_Id);
        linearLayout_olive=findViewById(R.id.olive_Id);
        linearLayout_orange=findViewById(R.id.orange_Id);
        button_next=findViewById(R.id.next_Button_Id);

        linearLayout_apple.setClickable(true);
        linearLayout_banana.setClickable(true);
        linearLayout_cherries.setClickable(true);
        linearLayout_coconut.setClickable(true);
        linearLayout_grape.setClickable(true);
        linearLayout_guava.setClickable(true);
        linearLayout_lemon.setClickable(true);
        linearLayout_lime.setClickable(true);
        linearLayout_lychee.setClickable(true);
        linearLayout_mango.setClickable(true);
        linearLayout_olive.setClickable(true);
        linearLayout_orange.setClickable(true);



        linearLayout_apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Apple.class);
                startActivity(intent);
            }
        });

        linearLayout_banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Banana.class);
                startActivity(intent);
            }
        });

        linearLayout_cherries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Cherries.class);
                startActivity(intent);
            }
        });
        linearLayout_coconut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Cononut.class);
                startActivity(intent);
            }
        });

        linearLayout_grape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Grape.class);
                startActivity(intent);
            }
        });
        linearLayout_guava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Guava.class);
                startActivity(intent);
            }
        });
        linearLayout_lemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Lemon.class);
                startActivity(intent);
            }
        });
        linearLayout_lime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Lime.class);
                startActivity(intent);
            }
        });
        linearLayout_lychee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Lychee.class);
                startActivity(intent);
            }
        });
        linearLayout_mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Mango.class);
                startActivity(intent);
            }
        });
        linearLayout_olive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Olive.class);
                startActivity(intent);
            }
        });
        linearLayout_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Orange.class);
                startActivity(intent);
            }
        });
        linearLayout_cherries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Cherries.class);
                startActivity(intent);
            }
        });

//............... Next Button ......................
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });


    }
}
