package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


//extends provides compatability with previous Android versions.
public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    //onCreate calls AppCompatActivity to create nessecary app functionality
    //onCreate Android will call AppCompatActivity and pass results to OnCreate method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView calls resource. eg., R - res folder, layout - layout folder, activity_main = is this XML file
//        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;

        if(mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }

    }
}
