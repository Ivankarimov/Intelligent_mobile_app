package ru.mirea.karimov.dialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class MyTimeDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Текущее время по умолчанию (12:00)
        return new TimePickerDialog(getActivity(), (view, hour, minute) -> {
            // Действие при выборе времени
        }, 12, 0, true);
    }
}
