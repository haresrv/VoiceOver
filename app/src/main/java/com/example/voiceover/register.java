package com.example.voiceover;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText USERN,EMAIL,PASS,CON_PASS;
    Button Reg,Log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        USERN=findViewById(R.id.username);
        EMAIL=findViewById(R.id.email);
        PASS=findViewById(R.id.pass);
        CON_PASS=findViewById(R.id.pass2);
        Reg=findViewById(R.id.reg);
        Log=findViewById(R.id.log);
        Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this,Login.class));
                finish();
            }
        });
        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=USERN.getText().toString();
                String email=EMAIL.getText().toString();
                String pass=PASS.getText().toString();
                String con_pass=CON_PASS.getText().toString();
                if((!TextUtils.isEmpty(email))&&(!TextUtils.isEmpty(pass))&&(!TextUtils.isEmpty(con_pass))&&(!TextUtils.isEmpty(username)))
                {
                    if (!(pass.equals(con_pass))) {
                        Toast.makeText(register.this, "Passwords mismatch", Toast.LENGTH_LONG).show();
                    } else {
                            //add to db
                        }
                    }

                else
                {
                    Toast.makeText(register.this, "Fill in all Fields", Toast.LENGTH_LONG).show();
                }
        }});





    }
}
