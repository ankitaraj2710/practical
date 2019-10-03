package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class MainActivity extends AppCompatActivity {
gameEngine practice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
//        setContentView(R.layout.activity_main);

    practice = new gameEngine(this, size.x, size.y);

    // Make GameEngine the view of the Activity
    setContentView(practice);
}
    @Override
    protected void onResume() {
        super.onResume();
        practice.startGame();
    }

    // Stop the thread in snakeEngine
    @Override
    protected void onPause() {
        super.onPause();
        practice.pauseGame();
    }
}



