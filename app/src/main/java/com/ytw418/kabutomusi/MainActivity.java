package com.ytw418.kabutomusi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText id_id;
    Button btn_id;
    private Button list_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_btn = findViewById(R.id.list_btn);
         id_id = findViewById(R.id.id_id);
         btn_id = findViewById(R.id.btn_id);


         list_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(getApplicationContext(),ilstview.class);
                 startActivity(intent);
             }
         });


        btn_id.setOnClickListener(new View.OnClickListener()
        {
         @Override
         public void onClick(View v)
         {
             id_id.setText("완료");
         }
        });



    }
}


