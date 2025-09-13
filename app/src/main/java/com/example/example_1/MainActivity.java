package com.example.example_1;

import android.content.Context;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar124"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar13"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar14"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar15"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar16"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar17"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar18"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar19"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar20"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar21"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar22"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar23"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar12"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar13"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar14"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar15"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar16"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar17"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar18"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar19"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar20"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar21"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar22"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar23"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar12"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar13"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar14"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar15"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar16"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar17"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar18"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar19"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar20"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar21"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar22"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar23"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar12"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar13"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar14"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar15"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar16"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar17"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar18"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar19"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar20"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar21"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar22"));
        items.add(new Item(R.drawable.ram, "fhgf@gmail.com","sudhakar23"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(items, getApplicationContext()));
    }
}