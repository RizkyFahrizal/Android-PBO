package com.smkrevit.messagedialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        System.out.println("On Create");
    }

    public void ShowToast(String pesan){
        Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show();
    }

    public void ShowAlert(String pesan){
        AlertDialog.Builder buatAlert = new AlertDialog.Builder(this);
        buatAlert.setTitle("Perhatian!!");
        buatAlert.setMessage(pesan);
        buatAlert.show();
    }

    public void ShowAlertButton(String pesan){
        AlertDialog.Builder hapusData = new AlertDialog.Builder(this);
        hapusData.setTitle("Peringatan !");
        hapusData.setMessage(pesan);

        hapusData.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ShowToast("Data Telah Dihapus");
            }
        });
        hapusData.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ShowToast("Dibatalkan");
            }
        });
        hapusData.show();
    }

    public void btnToast(View view) {
        ShowToast("halo Bujank");
    }

    public void btnAlert(View view) {
        ShowAlert("Ini Alert");
    }

    public void btnAlertDialogButton(View view) {
        ShowAlertButton("Apakah Anda Ingin Menghapus?");
    }
}