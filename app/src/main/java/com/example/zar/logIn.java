package com.example.zar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class logIn extends AppCompatActivity {

    EditText email,password;
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

                if (emailS == "ismail@gmail.com"){

                    if (passwordS == "123"){

                    } else {
                        Toast.makeText(logIn.this, "şifrenizi yanliş girdiniz", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    //Toast.makeText(logIn.this, "emailinizi kontrol edin", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(logIn.this,MainActivity.class);
                    startActivity(intent);
                }

            }
        });







    }
}
