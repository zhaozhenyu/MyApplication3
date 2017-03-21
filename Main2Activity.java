package com.example.zzacce.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static android.R.id.text1;

public class Main2Activity extends AppCompatActivity {
//    private Button b1, b2,b3,b4,b5,b6,b7,b8,b9,add,did,jian,cheng,dengyu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int a1=1,a2=2,a3=3,a4=4,a5=5,a6=6,a7=7,a8=8,a9=9;

        String[] strArray={""};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        final TextView text1 = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();
        Button b1 = (Button) findViewById(R.id.n1);
        Button b2 = (Button) findViewById(R.id.n2);
        Button b3 = (Button) findViewById(R.id.n3);
        Button b4 = (Button) findViewById(R.id.n4);
        Button b5 = (Button) findViewById(R.id.n5);
        Button b6 = (Button) findViewById(R.id.n6);
        Button b7 = (Button) findViewById(R.id.n7);
        Button b8 = (Button) findViewById(R.id.n8);
        Button b9 = (Button) findViewById(R.id.n9);
        Button jia = (Button) findViewById(R.id.jia);
        Button  jian= (Button) findViewById(R.id.jian);
        Button  chen= (Button) findViewById(R.id.cheng);
        Button  dengyu= (Button) findViewById(R.id.dengyu);
        Button  clean= (Button) findViewById(R.id.qingchu);

        b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
//                // Perform action on click
//                //增加自己的代码......
//
//                final TextView text = (TextView) findViewById(R.id.textView5);
//

                String x=String.valueOf(a1);
                text1.setText(x);
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
//                // Perform action on click
//                //增加自己的代码......
//
//                final TextView text = (TextView) findViewById(R.id.textView5);
//

                String x=String.valueOf(a2);
                text1.setText("OnClick. " +x);
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
//                // Perform action on click
//                //增加自己的代码......
//
//                final TextView text = (TextView) findViewById(R.id.textView5);
//
                int b33=1;
                b33++;
                int b333=b33*3;
                String x1=String.valueOf(b333);
                String x=String.valueOf(a3);
                text1.setText("OnClick. " +x);
            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
//                // Perform action on click
//                //增加自己的代码......
//
//                final TextView text = (TextView) findViewById(R.id.textView5);
//

                String x=String.valueOf(a1);
                text1.setText("OnClick. " +x);
            }
        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
//                // Perform action on click
//                //增加自己的代码......
//
//                final TextView text = (TextView) findViewById(R.id.textView5);
//

                String x=String.valueOf(a1);
                text1.setText("OnClick. " +x);
            }
        });
        b6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
//                // Perform action on click
//                //增加自己的代码......
//
//                final TextView text = (TextView) findViewById(R.id.textView5);
//

                String x=String.valueOf(a1);
                text1.setText("OnClick. " +x);
            }
        });
        b7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
//                // Perform action on click
//                //增加自己的代码......
//
//                final TextView text = (TextView) findViewById(R.id.textView5);
//

                String x=String.valueOf(a1);
                text1.setText("OnClick. " +x);
            }
        });
        b8.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
//                // Perform action on click
//                //增加自己的代码......
//
//                final TextView text = (TextView) findViewById(R.id.textView5);
//

                String x=String.valueOf(a1);
                text1.setText("OnClick. " +x);
            }
        });
        b9.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
//                // Perform action on click
//                //增加自己的代码......
//
//                final TextView text = (TextView) findViewById(R.id.textView5);
//

                String x=String.valueOf(a1);
                text1.setText("OnClick. " +x);
            }
        });
        b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
//                // Perform action on click
//                //增加自己的代码......
//
//                final TextView text = (TextView) findViewById(R.id.textView5);
//

                String x=String.valueOf(a1);
                text1.setText("OnClick. " +x);
            }
        });

//
//         class ButtonClick implements View.OnClickListener {
//
//            public void onClick(View v)
//            {
//                switch(v.getId())
//
//                {
//
//                    case R.id.n1:
//                        text1
//                        break;
//                    case R.id.n2:
//                        break;
//                    case R.id.n3:
//                        break;
//                    case R.id.n4:
//                        break;
//                    case R.id.n5:
//                        break;
//                    case R.id.n6:
//                        break;
//                    case R.id.n7:
//                        break;
//                    case R.id.n8:
//                        break;
//                    case R.id.n9:
//                        break;
//                    case R.id.jia:
//                        break;
//                    case R.id.jian:
//                        break;
//                    case R.id.cheng:
//                        break;
//                    case R.id.chu:
//                        break;
//                    case R.id.qingchu:
//                        break;
//                    case R.id.dengyu:
//                        break;
//
//
//                }
//            }
//        }
//        setOnClickListener(new ButtonClick());

//        Button  jian= (Button) findViewById(R.id.jian);


//        Button button = (Button) findViewById(R.id.button1);



    }



}
