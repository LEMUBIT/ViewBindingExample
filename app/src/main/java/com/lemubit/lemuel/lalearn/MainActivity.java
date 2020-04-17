package com.lemubit.lemuel.lalearn;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.lemubit.lemuel.lalearn.databinding.ActivityMainBinding;

import lombok.var;

/**
 * @author lemuel
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        var binding = ActivityMainBinding.inflate(getLayoutInflater());
        var viewRoot = binding.getRoot();

        setContentView(viewRoot);

        binding.helloBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        });

        binding.welcomeBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        });
    }
}
