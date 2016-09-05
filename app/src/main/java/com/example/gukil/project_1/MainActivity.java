package com.example.gukil.project_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.apradanas.simplestyledialog.SimpleStyleDialog;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        final TextView tv1 = (TextView) findViewById(R.id.tv1);
        Button btn1 = (Button) findViewById(R.id.btn1);

    }

    @Override
    public void onBackPressed() {
        SimpleStyleDialog dialog = new SimpleStyleDialog(this);
        dialog.setMessage("앱을 종료합니띠");
        dialog.setRightButton("예", new SimpleStyleDialog.OnSimpleClickListener() {
            @Override
            public void onClick(SimpleStyleDialog simpleStyleDialog) {
                System.exit(0);
            }
        });
        dialog.setLeftButton("아니요!", null);
        dialog.setTitle("종료");
        dialog.show();
    }
}
