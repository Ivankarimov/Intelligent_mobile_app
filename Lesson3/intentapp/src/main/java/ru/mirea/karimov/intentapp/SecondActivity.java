package ru.mirea.karimov.intentapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Получаем переданное время
        String receivedTime = getIntent().getStringExtra("time_key");

        // ВАЖНО: замените 'X' на ваш номер в списке группы
        // Например, если номер 5, то квадрат = 25
        int myNumber = 20;
        int square = myNumber * myNumber;

        TextView resultView = findViewById(R.id.textViewResult);
        String finalMessage = "КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ "
                + square + ", а текущее время " + receivedTime;

        resultView.setText(finalMessage);
    }
}