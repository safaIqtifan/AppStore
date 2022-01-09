package com.example.appstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.appstore.Adapter.AppStoreAdapter;
import com.example.appstore.Model.AppStoreModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.rv);

        ArrayList<AppStoreModel> data = new ArrayList<>();
        data.add(new AppStoreModel( 1,"WhatsApp Messenger", "WhatsApp Inc.",
                4.4, R.drawable.whatsap));
        data.add(new AppStoreModel( 2,"Messenger", "Facebook",
                3.9, R.drawable.message));
        data.add(new AppStoreModel( 3,"Facebook", "Facebook",
                4.0, R.drawable.facebook));
        data.add(new AppStoreModel( 4,"WhatsApp Messenger", "WhatsApp Inc.",
                4.4, R.drawable.whatsap));
        data.add(new AppStoreModel( 5,"Messenger", "Facebook",
                3.9, R.drawable.message));
        data.add(new AppStoreModel( 6,"Facebook", "Facebook",
                4.0, R.drawable.facebook));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AppStoreAdapter appStoreAdapter= new AppStoreAdapter(this, data);
        recyclerView.setAdapter(appStoreAdapter);

    }
}