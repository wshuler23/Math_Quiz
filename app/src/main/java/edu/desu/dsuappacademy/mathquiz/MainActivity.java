package edu.desu.dsuappacademy.mathquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {

        EditText enter = (EditText) findViewById(R.id.enter);

        int answer = Integer.parseInt(enter.getText().toString());

        if (answer == 20) {
            //add toast
            Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Wrong Answer, Try Again!",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
