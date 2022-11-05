package com.example.bt_quatrinh_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class LinearLayoutActivity extends AppCompatActivity {
    SeekBar sb;
    TextView b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        initAll();
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                b1.setBackgroundColor(getRandomColor());
                b2.setBackgroundColor(getRandomColor());
                b3.setBackgroundColor(getRandomColor());
                b4.setBackgroundColor(getRandomColor());
                b5.setBackgroundColor(getRandomColor());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    private void initAll(){
        b1 = findViewById(R.id.tv1);
        b2 = findViewById(R.id.tv2);
        b3 = findViewById(R.id.tv3);
        b4 = findViewById(R.id.tv4);
        b5 = findViewById(R.id.tv5);
        sb = findViewById(R.id.seekbar);
    }
    private int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater im = getMenuInflater();
        im.inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.menu_Relativelayout){
            Intent i = new Intent(this,RelativeLayoutActivity.class);
            startActivity(i);
            finish();
        }
        if (item.getItemId()==R.id.menu_Tablelayout){
            Intent i = new Intent(this,TableLayoutActivity.class);
            startActivity(i);
            finish();
        }
        if (item.getItemId()==R.id.menu_MoreInfo){
            AlertDialog ad = new AlertDialog.Builder(this).create();
            ad.setMessage(" Các thành viên : \n Nguyễn Thanh Quang\n Đặng Huỳnh Như Y\n Trương Đức Vương\n Trần Minh Quân");
            ad.show();
        }
        return true;
    }
}