package com.example.zar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {

    EditText email, password;
    Button login;

    String emailS, passwordS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        login = findViewById(R.id.login_button);

        email = findViewById(R.id.edit_text_email);
        password = findViewById(R.id.password_edit_text);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                emailS = email.getText().toString();
                passwordS = password.getText().toString();

                if (!emailS.equals("ismail@gmail.com") && !passwordS.equals("1234")) {
                    Toast.makeText(LogInActivity.this, "check your email or you password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(LogInActivity.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
}
