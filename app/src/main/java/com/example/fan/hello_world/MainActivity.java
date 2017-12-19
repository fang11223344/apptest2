package com.example.fan.hello_world;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity
{
    EditText show;
    Button bn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 使用activity_main文件定义的界面布局
        setContentView(R.layout.activity_main);
        bn = (Button) findViewById(R.id.bn);
        show = (EditText) findViewById(R.id.txt);
        bn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                show.setText("bn被点击了");
                return true;

            }
        });
    }
//   public void onClick(View v)
  // {
  //     show.setText("bn被点击了");
 //  }
}