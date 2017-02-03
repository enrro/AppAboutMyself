package com.example.enrro.appaboutmyself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;

public class Hobbies extends AppCompatActivity {

    EditText editText;
    Button button;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);

        editText  = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button5);

        editText.setText("");

        final Intent intent = new Intent(this, ThreePaths.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("test1", editText.getText().toString());
                setResult(Activity.RESULT_FIRST_USER, intent);
                finish();
            }
        });
    }

}
