package ru.mirea.karimov.multiactivity;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import ru.mirea.karimov.multiactivity.databinding.ActivitySecondBinding;

public class Second_Activity extends AppCompatActivity {
    private String TAG = "Activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onCreate()");

        // Извлекаем данные (стр. 24)
        String receivedText = getIntent().getStringExtra("key");
        TextView textView = findViewById(R.id.textViewResult);

        if (receivedText != null) {
            textView.setText(receivedText);
        }
    }

    @Override protected void onStart() { super.onStart(); Log.i(TAG, "onStart()"); }
    @Override protected void onResume() { super.onResume(); Log.i(TAG, "onResume()"); }
    @Override protected void onPause() { super.onPause(); Log.i(TAG, "onPause()"); }
    @Override protected void onStop() { super.onStop(); Log.i(TAG, "onStop()"); }
    @Override protected void onDestroy() { super.onDestroy(); Log.i(TAG, "onDestroy()"); }
}