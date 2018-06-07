package com.example.mamun.customalertboxexample;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button,yes,no,cancel;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDialog();

            }
        });


    }
    private void openDialog(){
        dialog = new Dialog(MainActivity.this);
        dialog.setTitle("THis is custom dialog");
        dialog.setContentView(R.layout.custom_dialog);
        yes = (Button) dialog.findViewById(R.id.yes);
        no = (Button) dialog.findViewById(R.id.no);
        cancel = (Button) dialog.findViewById(R.id.cancel);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(getApplicationContext(),"Yes Button is clicked",Toast.LENGTH_LONG).show();
            }
        });

        dialog.show();


    }
}
