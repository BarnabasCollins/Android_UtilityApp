package com.example.utility_dwelb2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Main2Activity extends MainActivity {



    ImageView player1, player2, player3, player4, player5, player6;
    TextView p1, p2, p3, p4, p5, p6;


    Button buttonR;


    Random r;

    Integer[] images = {
            R.drawable.eq,
            R.drawable.hades,
            R.drawable.scar,
            R.drawable.mal,
            R.drawable.ursula,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        String value = getIntent().getStringExtra("key");

        Spinner dropdown = findViewById(R.id.spinner1);
        String[] items = new String[]{"2", "3", "4", "5", "6"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);


        player1 = findViewById(R.id.imageView1);
        player2 = findViewById(R.id.imageView2);
        player3 = findViewById(R.id.imageView3);
        player4 = findViewById(R.id.imageView4);
        player5 = findViewById(R.id.imageView5);
        player6 = findViewById(R.id.imageView6);

        p1 = findViewById( R.id.p1 );
        p2 = findViewById( R.id.p2 );
        p3 = findViewById( R.id.p3 );
        p4 = findViewById( R.id.p4 );
        p5 = findViewById( R.id.p5 );
        p6 = findViewById( R.id.p6 );

            dropdown.setOnItemSelectedListener(new Spinner.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedItem = parent.getSelectedItem().toString();

                if (selectedItem.equals("2"))
                {
                    player1.setVisibility(View.VISIBLE);
                    player2.setVisibility(View.VISIBLE);
                    player3.setVisibility(View.INVISIBLE);
                    player4.setVisibility(View.INVISIBLE);
                    player5.setVisibility(View.INVISIBLE);
                    player6.setVisibility(View.INVISIBLE);

                    p1.setVisibility(View.VISIBLE);
                    p2.setVisibility(View.VISIBLE);
                    p3.setVisibility(View.INVISIBLE);
                    p4.setVisibility(View.INVISIBLE);
                    p5.setVisibility(View.INVISIBLE);
                    p6.setVisibility(View.INVISIBLE);

                }

                if (selectedItem.equals("3"))
                {
                    player1.setVisibility(View.VISIBLE);
                    player2.setVisibility(View.VISIBLE);
                    player3.setVisibility(View.VISIBLE);
                    player4.setVisibility(View.INVISIBLE);
                    player5.setVisibility(View.INVISIBLE);
                    player6.setVisibility(View.INVISIBLE);

                    p1.setVisibility(View.VISIBLE);
                    p2.setVisibility(View.VISIBLE);
                    p3.setVisibility(View.VISIBLE);
                    p4.setVisibility(View.INVISIBLE);
                    p5.setVisibility(View.INVISIBLE);
                    p6.setVisibility(View.INVISIBLE);

                }

                if (selectedItem.equals("4"))
                {
                    player1.setVisibility(View.VISIBLE);
                    player2.setVisibility(View.VISIBLE);
                    player3.setVisibility(View.VISIBLE);
                    player4.setVisibility(View.VISIBLE);
                    player5.setVisibility(View.INVISIBLE);
                    player6.setVisibility(View.INVISIBLE);

                    p1.setVisibility(View.VISIBLE);
                    p2.setVisibility(View.VISIBLE);
                    p3.setVisibility(View.VISIBLE);
                    p4.setVisibility(View.VISIBLE);
                    p5.setVisibility(View.INVISIBLE);
                    p6.setVisibility(View.INVISIBLE);
                }

                if (selectedItem.equals("5"))
                {
                    player1.setVisibility(View.VISIBLE);
                    player2.setVisibility(View.VISIBLE);
                    player3.setVisibility(View.VISIBLE);
                    player4.setVisibility(View.VISIBLE);
                    player5.setVisibility(View.VISIBLE);
                    player6.setVisibility(View.INVISIBLE);

                    p1.setVisibility(View.VISIBLE);
                    p2.setVisibility(View.VISIBLE);
                    p3.setVisibility(View.VISIBLE);
                    p4.setVisibility(View.VISIBLE);
                    p5.setVisibility(View.VISIBLE);
                    p6.setVisibility(View.INVISIBLE);
                }

                if (selectedItem.equals("6"))
                {
                    player1.setVisibility(View.VISIBLE);
                    player2.setVisibility(View.VISIBLE);
                    player3.setVisibility(View.VISIBLE);
                    player4.setVisibility(View.VISIBLE);
                    player5.setVisibility(View.VISIBLE);
                    player6.setVisibility(View.VISIBLE);

                    p1.setVisibility(View.VISIBLE);
                    p2.setVisibility(View.VISIBLE);
                    p3.setVisibility(View.VISIBLE);
                    p4.setVisibility(View.VISIBLE);
                    p5.setVisibility(View.VISIBLE);
                    p6.setVisibility(View.VISIBLE);
                }
            }
            public void onNothingSelected(AdapterView<?> parent)
                 {
            }
        });



        final ArrayList<Integer> iA = new ArrayList<>();
        iA.add(R.drawable.eq);
        iA.add(R.drawable.scar);
        iA.add(R.drawable.mal);
        iA.add(R.drawable.ursula);
        iA.add(R.drawable.jafar);
        iA.add(R.drawable.hades);
        Collections.shuffle(iA);



        r = new Random();


        buttonR = findViewById(R.id.buttonR);
        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                player1.setImageResource(images[r.nextInt(images.length)]);
                player2.setImageResource(images[r.nextInt(images.length)]);
                player3.setImageResource(images[r.nextInt(images.length)]);
                player4.setImageResource(images[r.nextInt(images.length)]);
                player5.setImageResource(images[r.nextInt(images.length)]);
                player6.setImageResource(images[r.nextInt(images.length)]);



            }
        });
    }
}
