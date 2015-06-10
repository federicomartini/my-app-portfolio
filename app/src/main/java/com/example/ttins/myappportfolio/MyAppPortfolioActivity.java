package com.example.ttins.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MyAppPortfolioActivity extends Activity {

    private static final String TAG = "MyAppPortfolioActivity";
    private static final String SPOTIFY_APP_NAME = "Spotify Streamer";
    private static final String SCORES_APP_NAME = "Scores";
    private static final String LIBRARY_APP_NAME = "Library";
    private static final String BUILD_APP_NAME = "Build It Bigger";
    private static final String XYZREADER_APP_NAME = "Xyz Reader";
    private static final String CAPSTONE_APP_NAME = "Capstone";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
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

    /** Called when the user touches the button_spotify */
    public void launchSpotifyApp (View view) {
        Log.d(TAG, "Launching  " + SPOTIFY_APP_NAME);
        showToast(getApplicationContext(), SPOTIFY_APP_NAME, Toast.LENGTH_SHORT);

    }

    /** Called when the user touches the button_scores */
    public void launchScoresApp (View view) {
        showToast(getApplicationContext(), SCORES_APP_NAME, Toast.LENGTH_SHORT);
    }

    /** Called when the user touches the button_library */
    public void launchLibraryApp (View view) {
        showToast(getApplicationContext(), LIBRARY_APP_NAME, Toast.LENGTH_SHORT);
    }

    /** Called when the user touches the button_build */
    public void launchBuildApp (View view) {
        showToast(getApplicationContext(), BUILD_APP_NAME, Toast.LENGTH_SHORT);
    }

    /** Called when the user touches the button_xyz */
    public void launchXyzApp (View view) {
        showToast(getApplicationContext(), XYZREADER_APP_NAME, Toast.LENGTH_SHORT);
    }

    /** Called when the user touches the button_capstone */
    public void launchCapstoneApp (View view) {
        showToast(getApplicationContext(), CAPSTONE_APP_NAME, Toast.LENGTH_SHORT);
    }

    public void showToast(Context context, String msg, int duration) {
        String msgToSend = "This button will launch my " + msg + " App!";
        Toast toast = new Toast(context);

        Log.d(TAG, "show Toast for " + msg);

        toast.makeText(context, msgToSend, duration).show();

    }
}
