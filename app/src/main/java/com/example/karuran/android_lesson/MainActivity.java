package com.example.karuran.android_lesson;

import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.graphics.*;
import android.app.*;
import android.os.*;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.*;


public class MainActivity extends ActionBarActivity {

    ImageView[] iv = new ImageView[3];
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        ll.setGravity(Gravity.CENTER); 
        setContentView(ll); 
        
        Bitmap bmp =
                BitmapFactory.decodeResource(getResources(),
                                             R.drawable.icon);
        
        for(int i=0; i<iv.length; i++) {
            iv[i] = new ImageView(this);
            iv[i].setImageBitmap(bmp);
            ll.addView(iv[i]);
        }
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
}

