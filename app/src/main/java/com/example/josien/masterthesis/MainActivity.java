package com.example.josien.masterthesis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.initBodyParts();
    }

    public void nieuwechoreografie(View view){
        Intent startChoreo = new Intent(this, DanceStyles.class);

        startChoreo.putExtra("start_screen", 500);
        startActivity(startChoreo);
    }

    public void bestaandechoreografie(View view){
        Toast.makeText(getApplicationContext(), "Dit kun je helaas nog niet gebruiken", Toast.LENGTH_LONG).show();
    }
    /*
    private void initBodyParts(){
        new Legs() rightLeg;
    }
    */
}

