package com.utng.iotapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button Green;
    private Button Blue;
    private Button Red;

    FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseReference = FirebaseDatabase.getInstance().getReference();

        Green = (Button) findViewById(R.id.green);
        Blue = (Button) findViewById(R.id.blue);
        Red = (Button) findViewById(R.id.red);

        Switch sw = (Switch) findViewById(R.id.switch1);
        Switch sw2 = (Switch) findViewById(R.id.switch2);
        Switch sw3 = (Switch) findViewById(R.id.switch3);
        Switch sw4 = (Switch) findViewById(R.id.switch4);

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    databaseReference.child("Rele_1").setValue("ON");
                } else {
                    databaseReference.child("Rele_1").setValue("OFF");
                }
            }
        });

        sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    databaseReference.child("Rele_2").setValue("ON");
                } else {
                    databaseReference.child("Rele_2").setValue("OFF");
                }
            }
        });

        sw3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    databaseReference.child("Rele_3").setValue("ON");
                } else {
                    databaseReference.child("Rele_3").setValue("OFF");
                }
            }
        });

        sw4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    databaseReference.child("Rele_4").setValue("ON");
                } else {
                    databaseReference.child("Rele_4").setValue("OFF");
                }
            }
        });

        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference.child("Color_Led").setValue("RED");
            }
        });

        Blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference.child("Color_Led").setValue("BLUE");
            }
        });

        Green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference.child("Color_Led").setValue("Green");
            }
        });

    }
}


