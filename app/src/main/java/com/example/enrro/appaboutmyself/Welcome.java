package com.example.enrro.appaboutmyself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Welcome extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        editText.setText("");
    }

    public void buttonClicked(View v){
        Intent intent = new Intent(this, ThreePaths.class);
        intent.putExtra("test", editText.getText().toString());
        startActivityForResult(intent, 0);
    }
}
