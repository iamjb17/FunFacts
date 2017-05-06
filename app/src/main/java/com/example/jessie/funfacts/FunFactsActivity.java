package com.example.jessie.funfacts;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

// Declare our view variables(Add fields for our views)

    private TextView mFactTextView;
    private Button mShowFactButton;
    private ConstraintLayout mConstraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        /* Assign the views from the layout file to the corresponding
         variable(connect views to variables)- We initialize our view variables to
         the views in the layout by using their id's
          */

        mFactTextView = (TextView) findViewById(R.id.factText);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.colorChange);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();


                // Update the screen with our dynamic fact
                mFactTextView.setText(fact);
                mConstraintLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);


            }
        };
        mShowFactButton.setOnClickListener(listener);

        // Toast.makeText(FunFactsActivity.this, "Yay our activity is created!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We are checking on the Log");


    }
}
