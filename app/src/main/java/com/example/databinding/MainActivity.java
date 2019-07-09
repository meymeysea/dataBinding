package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private Book book;
    private Book book1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        book = new Book();
        book.setTitle("One piece");
        book.setDescription("adventurous");

        binding.setBook(book);


    }
}
