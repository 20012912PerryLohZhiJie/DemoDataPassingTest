package sg.edu.rp.c346.id20012912.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button btnPassInteger;
    Button btnpasschar;
    TextView passdouble;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInteger =findViewById(R.id.buttonPassint);
        btnpasschar = findViewById(R.id.buttonPassChar);
        passdouble = findViewById(R.id.PassDoubleValue);

        btnPassInteger.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("value",1);
                startActivity(i);
            }
        });

        btnpasschar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intention = new Intent(MainActivity.this,SecondActivity.class);
                intention.putExtra("chvalue",'a');
                startActivity(intention);
            }
        });

        passdouble.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i3 = new Intent(MainActivity.this,SecondActivity.class);
                i3.putExtra("doublevalue",999.99);
                startActivity(i3);
            }
        });


    }
}