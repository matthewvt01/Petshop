package com.UAS.petshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPetshop;
    private ArrayList<ModelPetshop> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPetshop = findViewById(R.id.rv_petshop);
        rvPetshop.setHasFixedSize(true);

        data.addAll(DataPetshop.ambilDataPetshop());
        tampilDataPetshop();
    }

    private void tampilDataPetshop() {
        AdapterPetshop AP = new AdapterPetshop(data, MainActivity.this);

        rvPetshop.setLayoutManager(new LinearLayoutManager(this));
        rvPetshop.setAdapter(AP);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tampilan, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_about){
            Intent About = new Intent(MainActivity.this, About.class);
            startActivity(About);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}