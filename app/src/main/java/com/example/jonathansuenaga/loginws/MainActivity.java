package com.example.jonathansuenaga.loginws;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etusername, etpassword;
    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusername = (EditText)findViewById(R.id.etUsername);
        etpassword = (EditText)findViewById(R.id.etPassword);
        btlogin = (Button)findViewById(R.id.btLogin);

        btlogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btLogin:
                
        }
    }
}
