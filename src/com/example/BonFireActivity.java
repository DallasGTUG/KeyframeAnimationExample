package com.example;


import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class BonFireActivity extends Activity {
	AnimationDrawable frameAnimation;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Load the ImageView that will host the animation and
        // set its background to our AnimationDrawable XML resource.
        ImageView img = (ImageView)findViewById(R.id.bonfire_image);
        img.setBackgroundResource(R.drawable.bonfire_animation);

        // Get the background, which has been compiled to an AnimationDrawable object.
         frameAnimation = (AnimationDrawable) img.getBackground();
         
        // Start the animation (looped playback by default).
        img.post(new Starter());

    }

    class Starter implements Runnable {

        public void run() {
        	frameAnimation.start();        
        }
        

    }

}