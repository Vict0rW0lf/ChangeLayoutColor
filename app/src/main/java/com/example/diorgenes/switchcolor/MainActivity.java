package com.example.diorgenes.switchcolor;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeColor = (Button)findViewById(R.id.switchColor);
        final RelativeLayout myLayout = (RelativeLayout)findViewById(R.id.myLayout);
        final ColorDrawable viewColor = (ColorDrawable) myLayout.getBackground();


        changeColor.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        if(viewColor.getColor() == Color.WHITE || viewColor.getColor() == Color.GREEN) {
                            myLayout.setBackgroundColor(Color.RED);

                        }
                        else if(viewColor.getColor() == Color.RED){
                            myLayout.setBackgroundColor(Color.BLACK);
                        }
                        else {
                            myLayout.setBackgroundColor(Color.GREEN);                        }
                    }
                }
        );
    }
}
