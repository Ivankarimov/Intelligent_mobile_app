package ru.mirea.karimov.dialog;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onClickShowTime(View v) {
        MyTimeDialogFragment dialog = new MyTimeDialogFragment();
        dialog.show(getSupportFragmentManager(), "timePicker");
    }

    // Вызов диалога даты
    public void onClickShowDate(View v) {
        MyDateDialogFragment dialog = new MyDateDialogFragment();
        dialog.show(getSupportFragmentManager(), "datePicker");
    }

    // Вызов диалога прогресса
    public void onClickShowProgress(View v) {
        MyProgressDialogFragment dialog = new MyProgressDialogFragment();
        dialog.show(getSupportFragmentManager(), "progressDialog");
    }
}