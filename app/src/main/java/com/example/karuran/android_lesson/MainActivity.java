package com.example.karuran.android_lesson;

import android.support.v7.app.ActionBarActivity;
import android.app.*;
import android.os.*;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TableLayout tl = new TableLayout(this);
        setContentView(tl);
        
        TableRow[] tr = new TableRow[10];
        
        TextView[] tv = new TextView[10];
        Button[] bt = new Button[10];
        
        for(int i=0; i<tr.length; i++) {
            tr[i] = new TableRow(this);
            
            tv[i] = new TextView(this);
            tv[i].setText("商品番号" + i + "-------");
            bt[i] = new Button(this);
            bt[i].setText("購入"); 
            
            tr[i].addView(tv[i]);
            tr[i].addView(bt[i]);
            
            tl.addView(tr[i]);
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
