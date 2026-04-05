package ru.mirea.karimov.simplefragmentapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    private Fragment fragment1, fragment2;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализируем фрагменты и менеджер
        fragment1 = new FirstFragment();
        fragment2 = new SecondFragment();
        fragmentManager = getSupportFragmentManager();

        // Обработка кнопок (будет работать только в портретном режиме, так как в ландшафтном их нет)
        Button btn1 = findViewById(R.id.btnFirstFragment);
        Button btn2 = findViewById(R.id.btnSecondFragment);

        if (btn1 != null) { // Проверка на null обязательна, т.к. в land-разметке кнопок нет
            btn1.setOnClickListener(v ->
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainerView, fragment1)
                            .commit()
            );
        }

        if (btn2 != null) {
            btn2.setOnClickListener(v ->
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainerView, fragment2)
                            .commit()
            );
        }
    }
}