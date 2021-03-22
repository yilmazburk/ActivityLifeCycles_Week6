package com.istinye.week6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;

import com.istinye.week6.databinding.ActivityMainBinding;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.getLogger(TAG).log(Level.INFO,"onCreate invoked");
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = binding.getRoot();
        setContentView(rootView);

        binding.textView.setMovementMethod(new ScrollingMovementMethod());
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editText = binding.editText.getText().toString();
                if (editText.isEmpty()) return;
                binding.textView.append(editText + "\n" );
                binding.editText.setText("");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.getLogger(TAG).log(Level.INFO,"onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.getLogger(TAG).log(Level.INFO,"onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.getLogger(TAG).log(Level.INFO,"onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.getLogger(TAG).log(Level.INFO,"onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.getLogger(TAG).log(Level.INFO,"onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.getLogger(TAG).log(Level.INFO,"onDestroy invoked");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }


}
