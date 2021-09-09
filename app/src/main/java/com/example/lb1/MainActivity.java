package com.example.lb1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                Button button = (Button) findViewById(R.id.button);
                View tw1 = (View) findViewById(R.id.textView2);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(tw1.getVisibility() == View.INVISIBLE){
                            tw1.setVisibility(View.VISIBLE);
                        }
                        else
                            tw1.setVisibility(View.INVISIBLE);
                    }
                });
            }
        }