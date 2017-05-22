package com.nawoori.android.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//3. 눌렀을 때 무엇을 해줄지 view객체를 받아서 넘겨준다
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

  Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnplus, btnminus, btnequal, btnmutiple, btndevide;
    TextView textpre, textres;
        boolean ok = false;
        String start = "";
        String end = "";
        String result = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. 버튼을 연결한다.
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btn0=(Button)findViewById(R.id.button0);
        btnequal=(Button)findViewById(R.id.equal);
        btnminus=(Button)findViewById(R.id.minus);
        btnmutiple=(Button)findViewById(R.id.mutiple);
        btndevide=(Button)findViewById(R.id.division);
        btnplus=(Button)findViewById(R.id.plus);
        textpre=(TextView)findViewById(R.id.preview);
        textres=(TextView)findViewById(R.id.result);


        //2.클릭하면 여기서 무엇을 한다고 명령
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnequal.setOnClickListener(this);
        btnminus.setOnClickListener(this);
        btndevide.setOnClickListener(this);
        btnplus.setOnClickListener(this);

    }
    //4. 실제로 할 행동을 정해준다
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button0 :
                if(ok == true) {
                    end = end + "0";
                    result = end;
                }else{
                    start = start + "0";
                    result = start;
                }
                textpre.setText(result);
                break;

            case R.id.button1 :
                if(ok == true) {
                    end = end + "1";
                    result = end;
                }else{
                    start = start + "1";
                    result = start;
                }
                textpre.setText(result);
                break;

                case R.id.button2 :
                    if(ok == true) {
                        end = end + "2";
                        result = end;
                    }else{
                        start = start + "2";
                        result = start;
                    }
                    textpre.setText(result);
                    break;

            case R.id.button3 :
                if(ok == true) {
                    end = end + "3";
                    result = end;
                }else{
                    start = start + "3";
                    result = start;
                }
                textpre.setText(result);
                break;

            case R.id.button4 :
                if(ok == true) {
                    end = end + "4";
                    result = end;
                }else{
                    start = start + "4";
                    result = start;
                }
                textpre.setText(result);
                break;

            case R.id.button5 :
                if(ok == true) {
                    end = end + "5";
                    result = end;
                }else{
                    start = start + "5";
                    result = start;
                }
                textpre.setText(result);
                break;

            case R.id.button6 :
                if(ok == true) {
                    end = end + "6";
                    result = end;
                }else{
                    start = start + "6";
                    result = start;
                }
                textpre.setText(result);
                break;

            case R.id.button7 :
                if(ok == true) {
                    end = end + "7";
                    result = end;
                }else{
                    start = start + "7";
                    result = start;
                }
                textpre.setText(result);
                break;

            case R.id.button8 :
                if(ok == true) {
                    end = end + "8";
                    result = end;
                }else{
                    start = start + "8";
                    result = start;
                }
                textpre.setText(result);
                break;

            case R.id.button9 :
                if(ok == true) {
                    end = end + "9";
                    result = end;
                }else{
                    start = start + "9";
                    result = start;
                }
                textpre.setText(result);
                break;

            case R.id.minus :
                ok = true;
                textpre.setText("-");
                break;

            case R.id.plus :
                ok = true;
                textpre.setText("+");
                break;

            case R.id.mutiple :
                ok = true;
                textpre.setText("*");
                break;

            case R.id.crean :
                result = "0";
                textpre.setText(result);
                break;

            case R.id.division :
                ok = true;
                textpre.setText("/");
                break;

            case R.id.equal :
                int temp = Integer.parseInt(start) + Integer.parseInt(end);
                textres.setText(temp + "");
                break;
        }
    }

}
