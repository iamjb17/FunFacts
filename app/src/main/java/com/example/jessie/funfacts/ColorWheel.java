package com.example.jessie.funfacts;

import android.graphics.Color;
import java.util.Random;

/**
 * Created by Jessie on 4/6/2017.
 */

public class ColorWheel {
    private String[] mColors = {
        // the different colors that the app cycles through
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
        };

    // Create methods- The acts the object can take.
    public int getColor() {
        String color;
        // Randomly select a color
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
