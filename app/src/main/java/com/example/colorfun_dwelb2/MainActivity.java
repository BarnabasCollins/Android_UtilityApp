package com.example.colorfun_dwelb2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int seekR, seekG, seekB, seekA;
    SeekBar redSeekBar, greenSeekBar, blueSeekBar, alphaSeekBar;
    View mScreen;
    TextView redp, bluep, greenp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScreen = findViewById(R.id.view);
        redSeekBar = findViewById(R.id.red);
        greenSeekBar = findViewById(R.id.green);
        blueSeekBar = findViewById(R.id.blue);
        alphaSeekBar = findViewById(R.id.alpha);
        updateBackground();


        redSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);
        greenSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);
        blueSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);
        alphaSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);

        redp = findViewById(R.id.redp);
        bluep = findViewById(R.id.bluep);
        greenp = findViewById(R.id.greenp);

    }

    private SeekBar.OnSeekBarChangeListener seekBarChangeListener
            = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress,
                                      boolean fromUser) {

            Log.v("", "" + seekBar);

            switch (seekBar.getId()) {

                case R.id.red:
                    redp.setText(progress + " %");
                    break;

                case R.id.blue:
                    bluep.setText(progress + " %");
                    break;

                case R.id.green:
                    greenp.setText(progress + " %");
                    break;
            }

// TODO Auto-generated method stub
                updateBackground();
            }
            @Override
            public void onStartTrackingTouch (SeekBar seekBar){
// TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch (SeekBar seekBar){
// TODO Auto-generated method stub
            }
        };



        private void updateBackground() {


            seekR = redSeekBar.getProgress();
            seekG = greenSeekBar.getProgress();
            seekB = blueSeekBar.getProgress();
            seekA = alphaSeekBar.getProgress();
            mScreen.setBackgroundColor(
                    0xff000000
                            + seekR * 0x10000
                            + seekG * 0x100
                            + seekB
                            + seekA


            );
        }
    }
