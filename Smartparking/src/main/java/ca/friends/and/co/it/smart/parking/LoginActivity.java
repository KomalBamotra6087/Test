package ca.friends.and.co.it.smart.parking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText etLoginEmail;
    TextInputEditText etLoginPassword;
    TextView tvRegisterHere;
    Button btnLogin;
    CheckBox remember;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLoginEmail = findViewById(R.id.etLoginEmail);
        etLoginPassword = findViewById(R.id.etLoginPass);
        tvRegisterHere = findViewById(R.id.tvRegisterHere);
        btnLogin = findViewById(R.id.btnLogin);
        remember = findViewById(R.id.remember);

        mAuth = FirebaseAuth.getInstance();

        SharedPreferences preferences1 = getSharedPreferences("checkbox1",MODE_PRIVATE);
        String checkbox = preferences1.getString("rememberme", "");
        if(checkbox.equals("true")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class );
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Please Sign in", Toast.LENGTH_SHORT).show();
        }


        btnLogin.setOnClickListener(view -> {
            loginUser();
        });
        tvRegisterHere.setOnClickListener(view ->{
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        });

        remember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){

                    SharedPreferences preferences1 = getSharedPreferences("checkbox1", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences1.edit();
                    editor.putString("rememberme", "true");
                    editor.apply();
                    Toast.makeText(LoginActivity.this, "Checked", Toast.LENGTH_SHORT).show();
                }
                else if(!compoundButton.isChecked()){

                    SharedPreferences preferences1 = getSharedPreferences("checkbox1", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences1.edit();
                    editor.putString("rememberme", "false");
                    editor.apply();
                    Toast.makeText(LoginActivity.this, "Unchecked", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }

    private void loginUser(){
        String email = etLoginEmail.getText().toString();
        String password = etLoginPassword.getText().toString();

        if (TextUtils.isEmpty(email)){
            etLoginEmail.setError("Email cannot be empty");
            etLoginEmail.requestFocus();
        }else if (TextUtils.isEmpty(password)){
            etLoginPassword.setError("Password cannot be empty");
            etLoginPassword.requestFocus();
        }else{
            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(LoginActivity.this, "User logged in successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    }else{
                        Toast.makeText(LoginActivity.this, "Log in Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

}