package umn.ac.id;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button btnLogin;
    EditText etUsername, etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        getSupportActionBar().setTitle("Halaman Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnLogin = findViewById(R.id.btnLogin);
        etUsername = findViewById(R.id.etUsername);
        etPass = findViewById(R.id.etPass);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().equals("uasmobile") &&
                etPass.getText().toString().equals("uasmobilegenap")){
                    openMusicList();
                }else {
                    Toast.makeText(getApplicationContext(),
                            "Username & Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void openMusicList() {
        Intent music = new Intent(this, MusicList.class);
        startActivity(music);
    }
}
