package com.example.navbotdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.text.Html;


public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        TextView signUpRedirectText = findViewById(R.id.signUpRedirectText);
        String text = "¿Aún no tienes cuenta? <b>Registrate</b>";
        signUpRedirectText.setText(Html.fromHtml(text));
        TextView forgetPasswordRedirectText = findViewById(R.id.forgetPasswordRedirectText);
        String text2 = "<u>Olvide mi contraseña </u>";
        forgetPasswordRedirectText.setText(Html.fromHtml(text2));
        forgetPasswordRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, forgetPassword.class);
                startActivity(intent);
            }
        });
    }


}