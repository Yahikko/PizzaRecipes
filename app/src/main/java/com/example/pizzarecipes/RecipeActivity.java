package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView title = findViewById(R.id.titleTextView);
        TextView recipe = findViewById(R.id.recipeTextView);
        ImageView image = findViewById(R.id.imageView);

        Intent intent = getIntent();

        if (intent != null) {
            title.setText(intent.getStringExtra("text1"));
            recipe.setText(intent.getStringExtra("recipe"));
            image.setImageResource(intent.getIntExtra("imageResource", 0));
        }
    }
}