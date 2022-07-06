package com.iot.a20220706_activitylifecycle;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });
        Log.i("test","onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("test","onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("test","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("test","onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("test","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("test","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("test","onRestart");
    }
}