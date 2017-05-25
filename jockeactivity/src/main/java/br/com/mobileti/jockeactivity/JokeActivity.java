package br.com.mobileti.jockeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke = getIntent().getStringExtra("JOKE_KEY");

        jokeTextView = (TextView) findViewById(R.id.jokeTextView);

        jokeTextView.setText(joke);


    }
}
