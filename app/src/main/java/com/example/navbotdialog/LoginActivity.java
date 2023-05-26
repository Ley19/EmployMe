package com.example.navbotdialog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.navbotdialog.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    TextView registrarteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loginButton = (Button) findViewById(R.id.login_button);
        registrarteTextView = (TextView) findViewById(R.id.signUpRedirectText);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity activity = (Activity) view.getContext();
                Intent intent = new Intent(activity, MainActivity.class);
                startActivity(intent);
            }
        });
        registrarteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity activity = (Activity) view.getContext();
                Intent intent = new Intent(activity, SignUpActivity.class);
                startActivity(intent);
            }
        });


    }

}