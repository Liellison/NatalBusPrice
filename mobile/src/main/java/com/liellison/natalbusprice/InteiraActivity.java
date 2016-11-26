package com.liellison.natalbusprice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InteiraActivity extends AppCompatActivity {
    EditText etsaldo;
    TextView tvsaldo, tvtotalpasse;
    Button btcolocar, btpassei, bttotalpasse;
    double x,xx, y, t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inteira);

        etsaldo = (EditText) findViewById(R.id.etsaldo);
        tvsaldo = (TextView) findViewById(R.id.tvsaldo);
        tvtotalpasse = (TextView) findViewById(R.id.tvtotalpasse);
        btcolocar = (Button) findViewById(R.id.btcolocar);
        btpassei = (Button) findViewById(R.id.btpassei);
        bttotalpasse = (Button) findViewById(R.id.bttotalpasse);

        btcolocar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Double.parseDouble(etsaldo.getText().toString());
                xx = (xx + x);
                tvsaldo.setText(String.valueOf(xx));
            }
        });
        btpassei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                y = (xx - 2.95);
                tvsaldo.setText(String.valueOf(y));
            }
        });
        bttotalpasse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t = (xx / 2.95);
                tvtotalpasse.setText(String.valueOf(t));
            }
        });
    }
}
