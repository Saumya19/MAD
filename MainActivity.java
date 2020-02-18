package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
        int ch=1;
        float font=30;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                final TextView t=(TextView)findViewById(R.id.textView);
                Button btnSize=(Button) findViewById(R.id.button1);
                Button btnColor=(Button) findViewById(R.id.button2);


                btnSize.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                                t.setTextSize(font);
                                font=font+5;
                                if(font==50) font=30;
                        }
                });

                btnColor.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                                switch(ch){
                                        case 1: t.setTextColor(Color.RED);break;
                                        case 2: t.setTextColor(Color.GREEN);break;
                                        case 3: t.setTextColor(Color.BLUE);break;
                                        case 4: t.setTextColor(Color.CYAN);break;
                                        case 5: t.setTextColor(Color.YELLOW);break;
                                        case 6: t.setTextColor(Color.MAGENTA);break;
                                }
                                ch++;
                                if(ch==7) ch=1;

                        }
                });
        }
}
