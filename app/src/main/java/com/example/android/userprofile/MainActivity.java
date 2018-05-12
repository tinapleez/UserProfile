package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = findViewById(R.id.profile_picture);
        image.setImageResource(R.drawable.photocopy2);

        TextView name = findViewById(R.id.name);
        name.setText(R.string.text_name);

        TextView birthday = findViewById(R.id.birthday);
        birthday.setText(R.string.text_birthday);

        TextView country = findViewById(R.id.country);
        country.setText(R.string.text_country);
    }
}
