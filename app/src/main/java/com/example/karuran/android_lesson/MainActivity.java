package com.example.karuran.android_lesson;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View;
import android.webkit.*;
import android.widget.*;

public class MainActivity extends Activity {

    Button[] bt = new Button[4];
    WebView wv;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TableLayout tl = new TableLayout(this);
        setContentView(tl);
        
        wv = new WebView(this);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("http://www.google.com");
        
        TableRow tr = new TableRow(this);
        
        for(int i=0; i<bt.length; i++) {
            bt[i] = new Button(this);
            tr.addView(bt[i]);
        }

        bt[0].setText("←");
        bt[1].setText("→");
        bt[2].setText("+");
        bt[3].setText("-");
        
        for(int i=0; i<bt.length; i++) {
            bt[i].setOnClickListener(new SampleClickListener());
        }
        
        tl.addView(tr);
        tl.addView(wv);
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
    
    class SampleClickListener implements View.OnClickListener {
        
        public void onClick(View v) {
            if(v == bt[0]) {
                if(wv.canGoBack()) {
                    wv.goBack();
                }
            } else if(v == bt[1]) {
                if (wv.canGoForward()) {
                    wv.goForward();
                }
            } else if(v == bt[2]) {
                wv.zoomIn();
            } else if(v == bt[3]) {
                wv.zoomOut();
            }
        }
    }
}

