package jz.org.helloandroid;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TableLayout;
import android.widget.TextView;


public class HelloAndroid extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TableLayout tl = new TableLayout(this);

        TextView tv = new TextView(this);
        tl.addView(tv);

        tv.setText("Hello Android!");

        setContentView(tl);
    }
}
