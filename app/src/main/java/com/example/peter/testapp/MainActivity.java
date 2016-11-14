package com.example.peter.testapp;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.peter.testapp.users.User;
import com.example.peter.testapp.users.UserHandler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;


public class MainActivity extends Activity {

    private UserHandler userHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.userHandler = new UserHandler(getApplicationContext());
    }

    public void onLoginClick(View view) {

        setContentView(R.layout.login_page);

    }

    public void onLoginClick2(View view) {
        Button b1, b2;
        EditText ed1, ed2;

        b1 = (Button) findViewById(R.id.button);
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        b2 = (Button) findViewById(R.id.button2);

        if (this.userHandler.checkUser(ed1.getText().toString(), ed2.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
            setContentView(R.layout.overview_main);
        } else {
            Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

        }


    }
}











