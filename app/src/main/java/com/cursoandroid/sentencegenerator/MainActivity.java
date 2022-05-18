package com.cursoandroid.sentencegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateSentence(View view) {
        String [] sentences = {
                "Hard work leads to success.",
                "You learn from your mistakes.",
                "Thinking is like giving your brain a workout.",
                "Failure makes your smarter.",
                "People aren’t smart or not smart; people work hard or don’t work hard.",
                "You can learn anything as long as you put in the effort.",
                "Great job being persistent",
                "The harder your try, the smarter you become.",
                "Everyone makes mistakes.",
                "I love how hard you’re working!"
        };

        int number = new Random().nextInt(10);

        TextView sentence = findViewById(R.id.sentence);
        sentence.setText(sentences[number]);
    }
}
