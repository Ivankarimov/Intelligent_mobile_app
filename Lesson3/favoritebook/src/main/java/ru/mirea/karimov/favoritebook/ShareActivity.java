package ru.mirea.karimov.favoritebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShareActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        // Получаем данные, переданные из MainActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView devBookView = findViewById(R.id.textViewDevBook);
            String devBook = extras.getString(MainActivity.BOOK_NAME_KEY);
            devBookView.setText(devBook);
        }

        final EditText editName = findViewById(R.id.editTextBookName);
        final EditText editQuote = findViewById(R.id.editTextQuote);
        Button btn = findViewById(R.id.buttonSendBack);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bookTitle = editName.getText().toString();
                String quote = editQuote.getText().toString();

                Intent data = new Intent();
                String resultString = "Название Вашей любимой книги: " + bookTitle + ". Цитата: " + quote;
                data.putExtra(MainActivity.USER_MESSAGE, resultString);

                setResult(Activity.RESULT_OK, data);
                finish(); // Закрываем Activity и возвращаемся в MainActivity
            }
        });
    }
}