package com.example.mpandroidchartdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPieData,btnLineData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPieData = (Button) findViewById(R.id.btnPieData);
        btnPieData.setOnClickListener(new MyClickListener());

        btnLineData = (Button) findViewById(R.id.btnLineData);
        btnLineData.setOnClickListener(new MyClickListener());
    }

    /**
     * 自定义的ClickListener
     */
    class MyClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            switch (v.getId()){
                case R.id.btnPieData:
                    intent.setClass(MainActivity.this,PieDataActivity.class);
                    break;
                case R.id.btnLineData:
                    intent.setClass(MainActivity.this,LineDataActivity.class);
                    break;

            }
            startActivity(intent);
        }
    }
}
