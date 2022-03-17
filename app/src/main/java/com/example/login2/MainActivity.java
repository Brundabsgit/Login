package com.example.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText)findViewById(R.id.textView);
        Password=(EditText)findViewById(R.id.textView2);
        Login=(Button)findViewById(R.id.button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Name.getText().toString().equals("admin")&& Password.getText().toString().equals("1234")){
                    Intent intent=new Intent (MainActivity.this,SecondActivity.class);
                    startActivity(intent);

                    Toast.makeText(MainActivity.this,"login sucessful",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"login fail",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
