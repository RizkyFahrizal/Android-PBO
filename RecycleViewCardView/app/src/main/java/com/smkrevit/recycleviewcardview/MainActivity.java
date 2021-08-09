package com.smkrevit.recycleviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load();
        isiData();
    }

    public void load(){
        recyclerView=findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData(){
        siswaList=new ArrayList<Siswa>();
        siswaList.add(new Siswa("Joni","Surabaya"));
        siswaList.add(new Siswa("Angger","Sidaorjo"));
        siswaList.add(new Siswa("Jafar","Malang"));
        siswaList.add(new Siswa("Suaib","Jakarta"));
        siswaList.add(new Siswa("Raden","Surabaya"));
        siswaList.add(new Siswa("Ello","Bandung"));
        siswaList.add(new Siswa("Ken","Sulawesi"));
        siswaList.add(new Siswa("Rangga","Jogjakarta"));
        siswaList.add(new Siswa("Pangestu","Makasar"));
        siswaList.add(new Siswa("Rizal","Bandung"));
        siswaList.add(new Siswa("Siyun","Jakarta"));

        adapter = new SiswaAdapter(this,siswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa("SEHUNN","Jakarta"));
        adapter.notifyDataSetChanged(); 
    }
}