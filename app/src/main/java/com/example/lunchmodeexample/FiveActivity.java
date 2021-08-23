package com.example.lunchmodeexample;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lunchmodeexample.databinding.ActivityFiveBinding;

public class FiveActivity extends AppCompatActivity {
    ActivityFiveBinding binding;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFiveBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
