package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ArrayList<String> myFriends = new ArrayList<String>();
       myFriends.add("Yashwanth");
       myFriends.add("Prajwal");
       myFriends.add("Rakesh");
       myFriends.add("Muzamil");
       myFriends.add("Sujan");

       ListView listView = (ListView) findViewById(R.id.listView);
       ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myFriends);
       listView.setAdapter(arrayAdapter);
       /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(getApplicationContext(), "Hello " + myFriends.get(position), Toast.LENGTH_SHORT).show();
           }
       });*/
    }
}