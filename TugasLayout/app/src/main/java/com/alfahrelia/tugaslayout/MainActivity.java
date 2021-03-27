package com.alfahrelia.tugaslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.widget.Toast.*;
import static com.alfahrelia.tugaslayout.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
    }

    public void actionLinLayout(View view) {
        makeText(this, "ini adalah Linear Layout", LENGTH_SHORT).show();
    }

    public void actionRelLayout(View view) {
        makeText(this, "ini adalah Relative Layout", LENGTH_SHORT).show();
    }

    public void actionConsLayout(View view) {
        makeText(this, "ini adalah Constraint Layout", LENGTH_SHORT).show();
    }

    public void actionLin2Layout(View view) {
        makeText(this, "ini adalah Linear Layout", LENGTH_SHORT).show();
    }

    public void actionTableLayout(View view) {
        makeText(this, "ini adalah Table Layout", LENGTH_SHORT).show();
    }

    public void actionMatLayout(View view) {
        makeText(this, "ini adalah Matrial Layout", LENGTH_SHORT).show();
    }

    public void actionSrcLayout(View view) {
        makeText(this, "ini adalah Scroll View Layout", LENGTH_SHORT).show();
    }

    public void actionViewLayout(View view) {
        makeText(this, "ini adalah Scroll View Horizontal Layout", LENGTH_SHORT).show();
    }
}
