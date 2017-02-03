package com.example.enrro.appaboutmyself;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class ThreePaths extends AppCompatActivity {

    private TextView textView, textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threepaths);

        textView = (TextView) findViewById(R.id.textView2);
        textView1 = (TextView) findViewById(R.id.textView3);


        Intent i = getIntent();
        textView.setText("HI " + i.getStringExtra("test"));

        Intent i2 = getIntent();
        textView1.setText(i2.getStringExtra("test1"));
    }

    public void goToHobbies(View v){
        Intent i3 = new Intent (this, Hobbies.class);
        startActivityForResult(i3, 0);
    }

    public void goToFriends(View v){
        Intent i4 = new Intent(this, Friends.class);
        startActivityForResult(i4, 0);
    }

    public void goToLeaveMsg(View v){
        Intent i5 = new Intent(this, LeaveMsg.class);
        startActivityForResult(i5, 0);
    }

    public void onActivityResult(int RequestCode, int ResultCode, Intent i){
        if (RequestCode == 0 && ResultCode == Activity.RESULT_OK){
            Toast.makeText(this, i.getStringExtra("message"), Toast.LENGTH_SHORT).show();
        }
        if (RequestCode == 0 && ResultCode == Activity.RESULT_FIRST_USER){
            textView1.setText("Your hobby is: " + i.getStringExtra("test2"));
        }
    }

}
