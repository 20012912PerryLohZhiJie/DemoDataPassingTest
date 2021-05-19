package sg.edu.rp.c346.id20012912.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity
{
    TextView phoneview;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        phoneview = findViewById(R.id.buttonPassChar);
        Intent intent = getIntent();
        char chvalue = intent.getCharExtra("value", 'z');
        phoneview.setText("Character value received is: " + chvalue);


    }
}