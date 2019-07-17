package com.example.voiceover;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText Email,PWD;
    private Button forg,login,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Email=(EditText)findViewById(R.id.email);
        PWD=(EditText)findViewById(R.id.pwd);
        login=findViewById(R.id.signin);
        signup=findViewById(R.id.Signup);
        forg=findViewById(R.id.forgot);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startsignin();

            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,register.class));
                finish();
            }
        });
        forg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,MainActivity.class));
//                Toast.makeText(Login.this,"Option not yet available",Toast.LENGTH_LONG).show();
            }
        });



    }
    private void startsignin()
    {
        String emailid=Email.getText().toString();
        String pass=PWD.getText().toString();

        if(!(TextUtils.isEmpty(emailid)||TextUtils.isEmpty(pass)))
        {
            //check for correct pass
        }
        else
        {
            Toast.makeText(Login.this,"Complete all fields",Toast.LENGTH_LONG).show();
        }

    }

}
