package edu.fsu.cs.mobile.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    Button myButton;
    Button myOtherButton;
    RelativeLayout currentLayout;
    TextView myTextView;
    TextView myOtherTextView;
    Button submitButton;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button);
        myOtherButton = findViewById(R.id.button2);
        currentLayout = findViewById(R.id.mainLayout);
        myTextView = findViewById(R.id.textView);
        myOtherTextView = findViewById(R.id.textView2);
        submitButton = findViewById(R.id.submitButton);
        editText = findViewById(R.id.customText);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText("Austin Egan");
                myTextView.setTextColor(Color.WHITE);
                myOtherTextView.setTextColor(Color.WHITE);
                currentLayout.setBackgroundColor(Color.BLUE);
            }
        });


        myOtherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText("Hello World");
                myTextView.setTextColor(Color.YELLOW);
                myOtherTextView.setTextColor(Color.YELLOW);
                currentLayout.setBackgroundColor(Color.RED);
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String customText = editText.getText().toString();
                if (!customText.isEmpty()) {
                    myTextView.setText(customText);
                }
                myTextView.setTextColor(Color.BLACK);
                myOtherTextView.setTextColor(Color.BLACK);
                currentLayout.setBackgroundColor(Color.WHITE);
            }
        });

    }




}
