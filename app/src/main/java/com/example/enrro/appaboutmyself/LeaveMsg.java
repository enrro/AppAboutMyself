package com.example.enrro.appaboutmyself;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LeaveMsg extends AppCompatActivity {

    Button button;
    EditText edittext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        button = (Button) findViewById(R.id.button6);
        edittext = (EditText) findViewById(R.id.editText3);
    }

    public void sendMessage(View v){
        if (edittext.getText().toString().matches("")){
            Toast.makeText(this, "No message!", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent i = new Intent (this, ThreePaths.class);
            i.putExtra("message", "Message sent!!!");
            setResult(Activity.RESULT_OK, i);
            finish();
        }

    }
}
