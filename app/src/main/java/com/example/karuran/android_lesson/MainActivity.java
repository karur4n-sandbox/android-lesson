package com.example.karuran.android_lesson;

import android.support.v7.app.ActionBarActivity;
import android.app.*;
import android.os.*;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.*;


public class MainActivity extends ActionBarActivity {

    TextView tv;
    Button bt;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        setContentView(ll);
        
        tv = new TextView(this);
        tv.setText("いらっしゃいませ");
        bt = new Button(this);
        bt.setText("こんにちは");

        ll.addView(tv);
        ll.addView(bt);
        
        bt.setOnTouchListener(new SampleTouchListener());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    
    class SampleTouchListener implements View.OnTouchListener {
        public boolean onTouch(View v, MotionEvent e) {
            
            if(e.getAction() == MotionEvent.ACTION_DOWN) {
                bt.setText("こんにちは");
            } else if(e.getAction() == MotionEvent.ACTION_UP) {
                bt.setText("さようなら");
            }
            
            return true;
        }
    }
}

