package umn.ac.id;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static umn.ac.id.MainActivity.musicFiles;


public class MusicList extends AppCompatActivity {
    RecyclerView recyclerView;
    MusicAdapter musicAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);
        getSupportActionBar().setTitle("List Lagu");
        showWelcom();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        if (!(musicFiles.size() < 1)){
            musicAdapter = new MusicAdapter(this, musicFiles);
            recyclerView.setAdapter(musicAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        }
    }

    private void showWelcom() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MusicList.this);
        builder.setTitle("Selamat Datang");
        builder.setMessage("Farrel Irsyad Fanny - 00000032455");

        builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuProfil:
                openProfile();
                return true;
            case R.id.menuLogout:
                openLogin();
                return true;
            default:
        }
        return super.onOptionsItemSelected(item);
    }

    private void openLogin() {
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }

    private void openProfile() {
        Intent profile = new Intent(this, Profile.class);
        startActivity(profile);
    }
}
