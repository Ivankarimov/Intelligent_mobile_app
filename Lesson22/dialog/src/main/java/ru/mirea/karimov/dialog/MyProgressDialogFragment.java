package ru.mirea.karimov.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        ProgressDialog pd = new ProgressDialog(getActivity());
        pd.setTitle("Загрузка данных");
        pd.setMessage("Пожалуйста, подождите...");
        pd.setIndeterminate(true); // Бесконечная прокрутка
        return pd;
    }
}
