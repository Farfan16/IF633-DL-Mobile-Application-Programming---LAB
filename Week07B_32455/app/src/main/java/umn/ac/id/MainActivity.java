package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvDaftarVideo;
    DaftarVideoAdapter mAdapter;
    LinkedList<SumberVideo> daftarVideo = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvDaftarVideo = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new DaftarVideoAdapter(this, daftarVideo);
        rvDaftarVideo.setAdapter(mAdapter);
        rvDaftarVideo.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiDaftarVideo(){
        daftarVideo.add(new SumberVideo("Mini Cooper Drag", "Drag Race Mini Cooper dengan Civic", "android.resource://" +getPackageName() + "/"+R.raw.mini01));
        daftarVideo.add(new SumberVideo("Porsche 918", "Porsche 918 Spyder", "android.resource://" +getPackageName() + "/"+R.raw.porsche918));
        daftarVideo.add(new SumberVideo("Drift H2H", "H2H Drifting Battle", "android.resource://" +getPackageName() + "/"+R.raw.drift01));
        daftarVideo.add(new SumberVideo("Chasing", "Car Chasing Scene", "android.resource://" +getPackageName() + "/"+R.raw.drift02));
        daftarVideo.add(new SumberVideo("Mini Cooper Drag 2", "Drag Race Mini Cooper dengan Fiesta", "android.resource://" +getPackageName() + "/"+R.raw.mini02));
    }
}