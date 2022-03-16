package com.jhonssantiago.listadecores;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
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
        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.dialog, null);
        builder.setView(view)
                .setTitle("caixa Personalizada")
                .setPositiveButton("sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = view.findViewById(R.id.editTextNomes);
                        String nome = editText.getText().toString();
                        Toast.makeText(getActivity().getApplicationContext(), "voce clicou em sim"+ nome, Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getActivity().getApplicationContext(), "voce clicou em não ", Toast.LENGTH_SHORT).show();
                    }
                });


      /*  builder.setMessage("Como está o clima?")
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
                }); */
        return builder.create();
    }

}
