package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<RecyclerViewItem> recyclerViewItems;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        recyclerViewItems = new ArrayList<>();
        fillList(recyclerViewItems);

        recyclerView = findViewById(R.id.recyclerView);
        // Set fixed size для улучшения производительности
        recyclerView.setHasFixedSize(true);

        adapter = new RecyclerViewAdapter(recyclerViewItems, this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    private static void fillList(ArrayList<RecyclerViewItem> list) {
        list.add(new RecyclerViewItem(R.drawable.glutenfree, TextUtils.GLUTEN_FREE_TITLE,
                TextUtils.GLUTEN_FREE_DESCRIPTION, TextUtils.GLUTEN_FREE_RECIPE));
        list.add(new RecyclerViewItem(R.drawable.lahmacun, TextUtils.LAHMACUM_TITLE,
                TextUtils.LAHMACUM_FREE_DESCRIPTION, TextUtils.LAHMACUM_FREE_RECIPE));
        list.add(new RecyclerViewItem(R.drawable.rainbow, TextUtils.RAINBOW_TITLE,
                TextUtils.RAINBOW_FREE_DESCRIPTION, TextUtils.RAINBOW_FREE_RECIPE));
        list.add(new RecyclerViewItem(R.drawable.superhealthy,
                "Superhealthy pizza", "The quantities for this vegetarian " +
                "pizza are generous, so if you have any leftovers, pop a few cold slices " +
                "into your lunchbox for the next day", "recipe"));
        list.add(new RecyclerViewItem(R.drawable.pizzamargheritain4easysteps,
                "Pizza Margherita in 4 easy steps", "Even a novice cook can " +
                "master the art of pizza with our simple step-by-step guide. Bellissimo!", "recipe"));
        list.add(new RecyclerViewItem(R.drawable.caramelisedoniongoatscheesepizza,
                "Caramelised onion & goat's cheese pizza", "Make a veggie pizza " +
                "that's healthy and low-fat instead of ordering a takeaway. This easy " +
                "recipe uses goat's cheese for tang while the onions give it sweetness", "recipe"));
        list.add(new RecyclerViewItem(R.drawable.ultimatepizzamargherita,
                "Ultimate pizza Margherita", "Take your senses on a trip to " +
                "Italy with this authentic pizza Margherita", "recipe"));
        list.add(new RecyclerViewItem(R.drawable.cauliflowercrustpizza,
                "Cauliflower crust pizza", "Whiz up cauliflower and ground " +
                "almonds in a food processor to make this gluten-free pizza base - " +
                "top with tomatoes, aubergine and cheese", "recipe"));
        list.add(new RecyclerViewItem(R.drawable.pizzawithhomemadesauce,
                "Pizza with homemade sauce", "Make pizza for the family with " +
                "a homemade base and tomato sauce. The veggie recipe is perfect to get " +
                "kids involved in cooking. Top with mozzarella and fresh basil", "recipe"));
    }
}