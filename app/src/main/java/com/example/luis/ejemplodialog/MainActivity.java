 package com.example.luis.ejemplodialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {
    Button boton, boton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton=(Button) findViewById(R.id.button);
        boton2=(Button)findViewById(R.id.button2);

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MiDialogo2 d=new MiDialogo2();
                d.show(getFragmentManager(), "dialog2");
            }
        });

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            MiDialogo d=new MiDialogo();
            d.show(getFragmentManager(), "dialog");
            }
        });
    }
}
