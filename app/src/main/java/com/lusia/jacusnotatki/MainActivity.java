package com.lusia.jacusnotatki;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/karameler/jacekdatatatytyul/main/db.json")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonPlaceHolderAPI jsonPlaceHolderAPI = retrofit.create(JsonPlaceHolderAPI.class);

        Call<ArrayList<Notatki>> call = jsonPlaceHolderAPI.getNotatki();
        call.enqueue(new Callback<ArrayList<Notatki>>() {
            @Override
            public void onResponse(Call<ArrayList<Notatki>> call, Response<ArrayList<Notatki>> response) {

                if (!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }

            }

            @Override
            public void onFailure(Call<ArrayList<Notatki>> call, Throwable t) {

            }
        });

        ArrayList<String> slowa = new ArrayList<>();
        ArrayAdapter<String> arrayAdapter;
        ListView listview;
        listview = findViewById(R.id.Listview);
        slowa.add("cus");
        arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,slowa);
        listview.setAdapter(arrayAdapter);
    }
}