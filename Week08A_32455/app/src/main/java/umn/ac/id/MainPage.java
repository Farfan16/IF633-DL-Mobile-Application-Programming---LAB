package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {
    private Button btnStorage, btnSaved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        btnStorage = findViewById(R.id.btnStorage);
        btnSaved = findViewById(R.id.btnSaved);

        btnStorage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStorage();
            }
        });
        btnSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSaved();
            }
        });
    }

    private void openSaved() {
        Intent saved = new Intent(this, SavedShared.class);
        startActivity(saved);
    }

    private void openStorage() {
        Intent storage = new Intent(this, MainActivity.class);
        startActivity(storage);
    }
}