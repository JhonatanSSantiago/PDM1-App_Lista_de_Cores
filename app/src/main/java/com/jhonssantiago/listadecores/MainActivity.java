package com.jhonssantiago.listadecores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openAlertDialog();
            }
        });
    }


    public void openAlertDialog(){
        MyDialogFragment mdf = new MyDialogFragment();
        mdf.show(getSupportFragmentManager(), "clima");
    }
}