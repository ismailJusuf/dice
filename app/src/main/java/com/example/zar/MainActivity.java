package com.example.zar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView zar;

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zar = findViewById(R.id.image_view_dice);

        zar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    private void rollDice() {

        int randomNumber = random.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                zar.setImageResource(R.drawable.zar1);
                break;
            case 2:
                zar.setImageResource(R.drawable.zar2);
                break;
            case 3:
                zar.setImageResource(R.drawable.zar3);
                break;
            case 4:
                zar.setImageResource(R.drawable.zar4);
                break;
            case 5:
                zar.setImageResource(R.drawable.zar5);
                break;
            case 6:
                zar.setImageResource(R.drawable.zar6);
                break;
            default:
                zar.setImageResource(R.drawable.zar1);
                break;

        }


    }
}
