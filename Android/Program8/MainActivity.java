package com.example.facebook;

import static com.example.facebook.R.id.text1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView im;
    LinearLayout ll1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        im = (ImageView) findViewById(R.id.bdhome);
        ll1 = (LinearLayout) findViewById(R.id.ll1);
        t1 = (TextView) findViewById(R.id.text1);

        im.setOnClickListener(this);
        ll1.setOnClickListener(this);

        Typeface MyFont = Typeface.createFromAsset(getAssets(),"font/ShinyCrystal-Yq3z4.ttf");
        t1.setTypeface(MyFont);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.bdhome){
            im.setVisibility(View.GONE);
            ll1.setVisibility(View.VISIBLE);
        }
        else{
            im.setVisibility(View.VISIBLE);
            ll1.setVisibility(View.GONE);
        }
    }
}