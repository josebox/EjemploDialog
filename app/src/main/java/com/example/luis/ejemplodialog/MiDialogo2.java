package com.example.luis.ejemplodialog;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;


/**
 * Created by luis on 08/01/2018.
 */

public class MiDialogo2 extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder dialogo=new AlertDialog.Builder(getActivity());
        dialogo.setIcon(R.drawable.ic_launcher_background);
        dialogo.setTitle("Titulo del Dialog");
        dialogo.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialogo.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        Dialog d=dialogo.create();
    return d;
    }
}
