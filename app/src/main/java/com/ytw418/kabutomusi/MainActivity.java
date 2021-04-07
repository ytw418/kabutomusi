package com.ytw418.kabutomusi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText id_id;
    Button btn_id;
    private Button list_btn;
    EditText et_save;
    String shared = "file";


    @Override//종료시 값 저장
    protected void onDestroy() {
        super.onDestroy();
        SharedPreferences sharedPreferences = getSharedPreferences(shared,0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String value = et_save.getText().toString();
        editor.putString("hong",value);
        editor.commit();

    }

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

        et_save = (EditText)findViewById(R.id.et_save);
        //재 시작시 저장된 값 불러오기
        SharedPreferences sharedPreferences = getSharedPreferences(shared,0);
        String value = sharedPreferences.getString("hong","");
        et_save.setText(value);




    }
}


