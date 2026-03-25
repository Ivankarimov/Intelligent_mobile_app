package ru.mirea.karimov.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class MyDateDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Текущая дата по умолчанию (1 января 2025)
        return new DatePickerDialog(getActivity(), (view, year, month, day) -> {
            // Действие при выборе даты
        }, 2025, 0, 1);
    }
}
