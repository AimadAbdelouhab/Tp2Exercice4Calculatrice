package com.example.tp2calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    TextView edt1;
    String m="";
    boolean Addition, Subtract, Multiplication, Division,  decimal;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub,
            buttonMul, buttonDivision, buttonEqual, buttonDel, buttonDot, ButtonSigne,buttonM,buttonMr,buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity. this , "Bienvenu dans l'application de Aimad ABDELOUHAB" +
                "" ,Toast.LENGTH_SHORT).show();

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        ButtonSigne = (Button) findViewById(R.id.ButtonSigne);
        buttonDel = (Button) findViewById(R.id.buttonDel);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        buttonM = (Button) findViewById(R.id.buttonM);
        buttonMr = (Button) findViewById(R.id.buttonMr);
        buttonC = (Button) findViewById(R.id.buttonC);

        edt1 = (TextView) findViewById(R.id.display);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Addition = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Subtract = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Division = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        ButtonSigne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Float x = Float.parseFloat(edt1.getText() + "");
                    x=x*(-1);
                    edt1.setText(x.toString());

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division ) {
                    input2 = Float.parseFloat(edt1.getText() + "");
                }

                if (Addition) {

                    edt1.setText(input1 + input2 + "");
                    Addition = false;
                }

                if (Subtract) {

                    edt1.setText(input1 - input2 + "");
                    Subtract = false;
                }

                if (Multiplication) {
                    edt1.setText(input1 * input2 + "");
                    Multiplication = false;
                }

                if (Division) {
                    edt1.setText(input1 / input2 + "");
                    Division = false;
                }

            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= edt1.getText().toString();
                if (s.length()>0) s=s.substring(0,s.length()-1); else s="";
                edt1.setText(s);

            }
        });
        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m= (edt1.getText().toString());
                Toast.makeText(MainActivity. this , "la valeur "+m+" à  été sauvegardé" ,Toast.LENGTH_SHORT).show();
            }
        });

        buttonMr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(m);

            }
        });



        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                    //do nothing or you can show the error
                } else {
                    edt1.setText(edt1.getText() + ".");
                    decimal = true;
                }

            }
        });
    }
    protected void onRestart () {
        super .onRestart();
        Toast.makeText(MainActivity. this , "Vous êtes de retour sur l'application de Aimad ABDELOUHAB" ,Toast.LENGTH_SHORT).show();
    }
}