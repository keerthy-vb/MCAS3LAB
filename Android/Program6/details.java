package com.example.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.HashSet;
import java.util.Set;

public class details extends AppCompatActivity {

    TextView name,phn,gender,interest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        name = (TextView) findViewById(R.id.name);
        phn = (TextView) findViewById(R.id.phone);
        gender = (TextView) findViewById(R.id.gender);
        interest = (TextView) findViewById(R.id.interest);

        SharedPreferences sp = getSharedPreferences("MyPref",MODE_PRIVATE);

        if(sp.contains("Name")){
            name.setText(sp.getString("Name",""));
        }
        if(sp.contains("Phone")){
            phn.setText(sp.getString("Phone",""));
        }
        if(sp.contains("Interest")){
            interest.setText(sp.getString("Interest","").toString());
        }
        if(sp.contains("Gender")){
            gender.setText(sp.getString("Gender","").toString());
        }
    }
}