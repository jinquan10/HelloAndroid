package jz.org.helloandroid;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TableLayout;
import android.widget.TextView;


public class HelloAndroid extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LocationManager lm = (LocationManager) getSystemService(LOCATION_SERVICE);

        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {

            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        });

        TableLayout tl = new TableLayout(this);

        TextView tv = new TextView(this);
        tl.addView(tv);

        tv.setText("Hello Android :(");

        setContentView(tl);
    }
}
