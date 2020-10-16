package com.example.risad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton arrow, arrow1;
    LinearLayout hiddenView, hiddenView1;
    CardView cardView, cardView1, cardView2, cardView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = findViewById(R.id.base_cardview);
        arrow = findViewById(R.id.arrow_button);
        hiddenView = findViewById(R.id.hidden_view);

        cardView1 = findViewById(R.id.base_cardview1);
        arrow1 = findViewById(R.id.arrow_button1);
        hiddenView1= findViewById(R.id.hidden_view1);

        cardView2 = findViewById(R.id.base_cardview2);
        cardView3 = findViewById(R.id.base_cardview3);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You are selected Video", Toast.LENGTH_LONG).show();
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You are selected Documents", Toast.LENGTH_LONG).show();
            }
        });

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (hiddenView.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility(View.GONE);
                    arrow.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                else {

                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility(View.VISIBLE);
                    arrow.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });


        arrow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (hiddenView1.getVisibility() == View.VISIBLE) {

                    TransitionManager.beginDelayedTransition(cardView1,
                            new AutoTransition());
                    hiddenView1.setVisibility(View.GONE);
                    arrow1.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }
                else {

                    TransitionManager.beginDelayedTransition(cardView1,
                            new AutoTransition());
                    hiddenView1.setVisibility(View.VISIBLE);
                    arrow1.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });
    }
}