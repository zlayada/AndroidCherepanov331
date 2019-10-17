package com.netology.androidcherepanov331;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mKey0;
    private Button mKey1;
    private Button mKey2;
    private Button mKey3;
    private Button mKey4;
    private Button mKey5;
    private Button mKey6;
    private Button mKey7;
    private Button mKey8;
    private Button mKey9;
    private Button mKeyPoint;
    private TextView mCell00;
    private Button mKeyClear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewInit();


    }



    private void viewInit() {

        mKey0 = findViewById(R.id.key0);
        mKey1 = findViewById(R.id.key1);
        mKey2 = findViewById(R.id.key2);
        mKey3 = findViewById(R.id.key3);
        mKey4 = findViewById(R.id.key4);
        mKey5 = findViewById(R.id.key5);
        mKey6 = findViewById(R.id.key6);
        mKey7 = findViewById(R.id.key7);
        mKey8 = findViewById(R.id.key8);
        mKey9 = findViewById(R.id.key9);
        mKeyPoint = findViewById(R.id.keyPoint);
        mCell00 = findViewById(R.id.cell00);
        mKeyClear = findViewById(R.id.keyClear);


    }

    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.key0:
                mCell00.setText(R.string.key0);
                break;

            case R.id.key1:
                mCell00.setText(R.string.key1);
                break;

            case R.id.key2:
                mCell00.setText(R.string.key2);
                break;

            case R.id.key3:
                mCell00.setText(R.string.key3);
                break;

            case R.id.key4:
                mCell00.setText(R.string.key4);
                break;

            case R.id.key5:
                mCell00.setText(R.string.key5);
                break;

            case R.id.key6:
                mCell00.setText(R.string.key6);
                break;

            case R.id.key7:
                mCell00.setText(R.string.key7);
                break;

            case R.id.key8:
                mCell00.setText(R.string.key8);
                break;

            case R.id.key9:
                mCell00.setText(R.string.key9);
                break;

            case R.id.keyPoint:
                mCell00.setText(R.string.keyPoint);
                break;

            case R.id.keyClear:
                mCell00.setText(R.string.tkeyClear);
                break;


            default:
                break;

        }

    }

}
