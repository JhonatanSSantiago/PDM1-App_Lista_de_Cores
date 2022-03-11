package com.jhonssantiago.listadecores;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
      //  return super.onCreateDialog(savedInstanceState);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Como está o clima?")
                .setTitle("Responda a pergunta")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("Frio", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getActivity().getApplicationContext(), "Coloque um casaco", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Quente", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getActivity().getApplicationContext(), "Beba muita agua", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Ameno", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getActivity().getApplicationContext(), "Aproveite o Dia", Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }

}
