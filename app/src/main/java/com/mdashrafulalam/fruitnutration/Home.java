package com.mdashrafulalam.fruitnutration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Home extends AppCompatActivity {
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar=findViewById(R.id.progressId);

        new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
                finish();
            }
        }).start();

    }

    void doWork(){
        int i=10;
        for (int progress=0;progress<100;progress +=10)
            try {
                Thread.sleep(200);
                progressBar.setProgress(progress);
            }catch (Exception e){
                e.printStackTrace();
            }
    }

    private void startApp(){
        Intent intent=new Intent(Home.this,MainActivity.class);
        startActivity(intent);
    }
}
