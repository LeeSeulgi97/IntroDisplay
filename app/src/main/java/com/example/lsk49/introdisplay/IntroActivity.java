package com.example.lsk49.introdisplay;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity extends AppCompatActivity {
    // IntroActivity에서 Handler과 Runnable을 사용하는 방법

    Handler handler = new Handler();
    Runnable runnalble = new Runnable() {
        @Override
        public void run() {
            // 4초뒤에 다음화면(MainActivity)으로 넘어가기 Handler 사용
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent); // 다음화면(MainActivity)으로 넘어가기
            finish(); // IntroActivity 화면 종료
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }
    @Override
    protected void onResume() {
        super.onResume();
        handler.postDelayed(runnalble, 4000); // 4초 뒤에 Runnable 객체 수행
    }
    @Override
    protected void onPause() {
        super.onPause();
        // 화면을 벗어나면, handler 에 예약해놓은 작업을 취소해야함.
        handler.removeCallbacks(runnalble); // 예약 취소
    }
}
