package com.jhonssantiago.listadecores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   // private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener(){
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