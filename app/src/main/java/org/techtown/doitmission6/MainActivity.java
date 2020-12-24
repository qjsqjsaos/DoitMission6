package org.techtown.doitmission6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    SeekBar seekBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        seekBar = findViewById(R.id.seekBar);
        textView = findViewById(R.id.textView);


        //프로그레스바만 메서드 호출 setOnSeekBarChangeListener 메서드 외우기
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) { //드래그 하는 중에 발생
                progressBar.setProgress(progress);
                textView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { //최초에 탭하여 드래그 시작할때 발생

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { //드래그를 멈출때 발생

            }
        });
    }
}