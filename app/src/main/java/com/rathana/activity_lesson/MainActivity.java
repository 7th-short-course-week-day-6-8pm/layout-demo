package com.rathana.activity_lesson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("oooo","onStart run");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.e("oooo","onResume run");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.e("oooo","onCreate run");

        Log.v("Log V","my log v");
        Log.d("Log d", "this is the log d");

        Log.i("Log Info", "onCreate:  this is the log i");

        Log.w("Log w", "onCreate: this is the log w");


        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(v->{
            startActivity(new Intent(this,LoginActivity.class));
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("oooo","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("oooo","onStop run");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("oooo","onRestart run");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("oooo","onDestroy run");
    }
}
