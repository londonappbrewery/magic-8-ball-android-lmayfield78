package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Image view variable
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        // Turning the askButton from the layout to a variable
        Button myButton = (Button) findViewById(R.id.askButton);

        // The ball options variable
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        // set an  OnClickListener to the myButton
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Random number object
                Random randomNumberGenerator = new Random();

                // storing the random number in a var
                int number = randomNumberGenerator.nextInt(5);

                /**
                 * ballDisplay is the image
                 * Setting the image resource of balldisplay
                 * to any of the images in ballArray.
                 * Using the number gen to randomly select any of the images.
                 */
                ballDisplay.setImageResource(ballArray[number]);

            }
        });




    }
}
