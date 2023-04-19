package com.example.recyclerviewop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

RecyclerView recyclerView;
    ArrayList<Integer> image= new ArrayList<Integer>();
    ArrayList<String> typesOfshayri= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);

        fillimage();filltypesofshayri();
        my_adapter my_adapter=new my_adapter(MainActivity.this,image,typesOfshayri);
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(my_adapter);


    }
    public void filltypesofshayri(){

        typesOfshayri.add("शुभकामना शायरी");//ok
        typesOfshayri.add("दोस्ती शायरी");//ok
        typesOfshayri.add("मजेदार शायरी");//ok
        typesOfshayri.add("भगवान शायरी ");//ok
        typesOfshayri.add("प्रेरणा स्रोत शायरी");//ok
        typesOfshayri.add("जीवन शायरी");//ok
        typesOfshayri.add("मोहब्बत शायरी");//ok
        typesOfshayri.add("यादें शायरी");//ok
        typesOfshayri.add("अन्य  शायरी");//ok
        typesOfshayri.add("राजनीति शायरी");//ok
        typesOfshayri.add("प्रेम शायरी ");//ok
        typesOfshayri.add("दर्द शायरी");//ok
        typesOfshayri.add("बेवफा शायरी");//ok
        typesOfshayri.add("शराब शायरी ");//ok
        typesOfshayri.add("जन्मदिन शायरी ");//ok
        typesOfshayri.add("होली शायरी");//ok
    }

    public void fillimage(){
        image.add(R.drawable.bestwishesh);
        image.add(R.drawable.husband);
        image.add(R.drawable.child);
        image.add(R.drawable.god);
        image.add(R.drawable.motivational);
        image.add(R.drawable.kanjoos);
        image.add(R.drawable.married);
        image.add(R.drawable.officework);
        image.add(R.drawable.santabanta);
        image.add(R.drawable.politics);
        image.add(R.drawable.love);
        image.add(R.drawable.sad);
        image.add(R.drawable.bewfa);
        image.add(R.drawable.bearbar);
        image.add(R.drawable.birthday);
        image.add(R.drawable.holiimg);

    }
}