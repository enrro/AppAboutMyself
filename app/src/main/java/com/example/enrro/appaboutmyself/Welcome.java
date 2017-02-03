package com.example.enrro.appaboutmyself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/*
    Create an app that describes you with the following parts:

    Main activity with a label and button
    In the label the user must write her name
    When the button is pressed the activity changes to a new one
    Menu activity
    Shows a textview that says "HI " with the name of the user.
    Shows an empty textview that will change later
    Shows 3 image buttons, each one will change the view
    My hobbies - show a picture of your hobby, a textview that says "what is your hobby?", an empty text field and a button. When the user presses the app returns to the menu now showing your hobby in the previously empty textview.
    My Friends - show pictures of your friends
    Leave a message - shows an empty text field and a "send" button. When the user sends the message a Toast shows "Message sent" and the app returns to the Menu activity.

 */
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
