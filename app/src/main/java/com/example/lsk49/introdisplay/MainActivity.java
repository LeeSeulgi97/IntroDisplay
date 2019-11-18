package com.example.lsk49.introdisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MainActivity에서 Activity의 상태값을 나타내는 savedInstanceState를 사용한 방법

        //savedInstanceState은 이 Activity의 상태값을 나타내는데 이게 0이 아닐경우 onCreate에서 불러서 사용할수 있다
        if (savedInstanceState != null) {
            //mainActivity 종료
            finish();
            // Intent를 사용하여 IntroActivity를 실행한다.
            startActivity(new Intent(this, IntroActivity.class));
            // IntroActivity가 모두 실행되면 IntroActivity가 종료 되고 MainActivity로 돌아온다.
            return;
        }
    }
}
