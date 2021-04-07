package com.ytw418.kabutomusi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ilstview extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilstview);

        list = (ListView)findViewById(R.id.list);


       List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);

        data.add("장수풍뎅이");
        data.add("왕사슴벌레");
        data.add("헤라클레스 장수풍뎅이");
        adapter.notifyDataSetChanged();



    }
}