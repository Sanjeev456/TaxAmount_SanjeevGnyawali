package com.example.taxamount_sanjeevgnyawali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText ettext;
    private Button btncalculate;
    private TextView tvOutput,txtyearly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ettext = findViewById(R.id.ettext);
        btncalculate = findViewById(R.id.btncalculate);
        tvOutput = findViewById(R.id.tvoutput);
        txtyearly = findViewById(R.id.txtyearly);
        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float amt = Float.parseFloat(ettext.getText().toString());
                float amount = amt*12;
                txtyearly.setText(Double.toString(amount));
                taxamount TA = new taxamount();
                TA.setAmount(amount);
                if(amount<200000){
                    float res = TA.lowtax();
                    tvOutput.setText(Float.toString(res));
                }else if(amount >=200000 && amt<350000){
                    float res = TA.mediumtax();
                    tvOutput.setText(Float.toString(res));
                }else if(amount>=350000){
                    float res = TA.hightax();
                    tvOutput.setText(Float.toString(res)); }
            }
        });
    }
}
