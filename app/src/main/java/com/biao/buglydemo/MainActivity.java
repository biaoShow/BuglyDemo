package com.biao.buglydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private ImageView ivMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        ivMap = findViewById(R.id.iv_map);
//        ivMap.setImageResource(R.mipmap.bag);
        ivMap.setImageResource(R.mipmap.kele);
    }

    private void initData() {
    }

    public void test(View view) {
        BugClass.bug();
    }

    public void testos(View view) {
//        NativeJni.createNativeCrash();
        String str = NativeJni.stringFromJNI();
        Log.e(TAG, "str = " + str);
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}