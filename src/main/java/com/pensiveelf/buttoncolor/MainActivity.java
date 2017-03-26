package com.pensiveelf.buttoncolor;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button colorButton = (Button) findViewById(R.id.colorButton);
        colorButton.setText("Click me!");
        colorButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Random random = new Random();
                 int colors[] = {Color.GRAY, Color.GREEN, Color.CYAN, Color.RED, Color.YELLOW, Color.MAGENTA, Color.BLACK, Color.WHITE};
                 int pos = random.nextInt(colors.length);
                colorButton.setBackgroundColor(colors[pos]);
            }
        });
    }
}
