package com.mobkini.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainSplash extends AppCompatActivity {

    EditText editText,editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);

        editText.setText("amirfirdausoff@gmail.com");
        editText2.setText("test");

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getApplicationContext(),MainActivity.class);
                next.putExtra("email",editText.getText().toString());
                next.putExtra("nama",editText2.getText().toString());
                startActivity(next);
            }
        });

    }
}
