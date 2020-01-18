package com.mobkini.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


        TextView textView,textView2;

        Button clear, bracket, percentage, divide, add, subtract, multiply, equal, minusValue;

        Button one, two, three, four, five, six, seven, eight, nine, point, zero ;

        String current_value;

        boolean status_mul = false;
        boolean status_sub = false;
        boolean status_div = false;
        boolean status_add = false;

    DecimalFormat format = new DecimalFormat("0.########");

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            //code for hide title bar.
            requestWindowFeature(Window.FEATURE_NO_TITLE);

            setContentView(R.layout.activity_main);

            textView = (TextView)findViewById(R.id.textView1);
            textView2 = findViewById(R.id.textView2);

            clear = (Button)findViewById(R.id.buttonClearText);
            bracket = (Button)findViewById(R.id.buttonBracket);
            percentage = (Button)findViewById(R.id.buttonPercentage);
            divide = (Button)findViewById(R.id.buttonDivide);
            add = (Button)findViewById(R.id.buttonAdd);
            subtract = (Button)findViewById(R.id.buttonSubtraction);
            multiply = (Button)findViewById(R.id.buttonMultiply);
            equal = (Button)findViewById(R.id.buttonEqual);
            minusValue = (Button)findViewById(R.id.buttonMinusValue);

            one = (Button)findViewById(R.id.button1);
            two = (Button)findViewById(R.id.button2);
            three = (Button)findViewById(R.id.button3);
            four = (Button)findViewById(R.id.button4);
            five = (Button)findViewById(R.id.button5);
            six = (Button)findViewById(R.id.button6);
            seven = (Button)findViewById(R.id.button7);
            eight = (Button)findViewById(R.id.button8);
            nine = (Button)findViewById(R.id.button9);
            point = (Button)findViewById(R.id.buttonPoint);
            zero = (Button)findViewById(R.id.buttonZero);

            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    textView.setText(null);
                    textView2.setText(null);
                    status_mul = false;
                    status_div = false;
                    status_sub = false;
                    status_add = false;
                }
            });


            bracket.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

//                    String S = textView.getText().toString();

                }
            });

            percentage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

//                    textView.setText(textView.getText() + "%");

                }
            });


            divide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    status_div = true;
                    textView.setText(textView.getText() + "/");

                }
            });


            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    status_add = true;
                    textView.setText(textView.getText() + "+");
                }
            });


            subtract.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    status_sub = true;
                    textView.setText(textView.getText() + "-");

                }
            });


            multiply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    status_mul = true;
                    textView.setText(textView.getText() + "*");
                }
            });


            equal.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                @Override
                public void onClick(View view) {
                    textView.setText(format.format(eval(textView.getText().toString())));
                    textView2.setText(format.format(eval(textView.getText().toString())));
                }
            });


            minusValue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });

            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(status_add || status_sub || status_div || status_mul){
                        textView.setText(textView.getText() + "1");
                        if(textView.getText().toString().equals("1+-*/1")){

                        }else {
                            textView2.setText(format.format(eval(textView.getText().toString())));
                        }
                    }else {
                        textView.setText(textView.getText() + "1");
                    }
                }
            });

            two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(status_add || status_sub || status_div || status_mul){
                        textView.setText(textView.getText() + "2");

                        if(textView.getText().toString().equals("2+-*/2")){

                        }else {
                            textView2.setText(format.format(eval(textView.getText().toString())));
                        }
                    }else {
                        textView.setText(textView.getText() + "2");
                    }

                }
            });

            three.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(status_add || status_sub || status_div || status_mul){
                        textView.setText(textView.getText() + "3");
                        if(textView.getText().toString().equals("3+-*/3")){

                        }else {
                            textView2.setText(format.format(eval(textView.getText().toString())));
                        }
                    }else {
                        textView.setText(textView.getText() + "3");
                    }

                }
            });

            four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(status_add || status_sub || status_div || status_mul){
                        textView.setText(textView.getText() + "4");
                        textView2.setText(format.format(eval(textView.getText().toString())));
                    }else {
                        textView.setText(textView.getText() + "4");
                    }

                }
            });

            five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(status_add || status_sub || status_div || status_mul){
                        textView.setText(textView.getText() + "5");
                        textView2.setText(format.format(eval(textView.getText().toString())));
                    }else {
                        textView.setText(textView.getText() + "5");
                    }

                }
            });


            six.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(status_add || status_sub || status_div || status_mul){
                        textView.setText(textView.getText() + "6");
                        textView2.setText(format.format(eval(textView.getText().toString())));
                    }else {
                        textView.setText(textView.getText() + "6");
                    }


                }
            });


            seven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(status_add || status_sub || status_div || status_mul){
                        textView.setText(textView.getText() + "7");
                        textView2.setText(format.format(eval(textView.getText().toString())));
                    }else {
                        textView.setText(textView.getText() + "7");
                    }

                }
            });

            eight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(status_add || status_sub || status_div || status_mul){
                        textView.setText(textView.getText() + "8");
                        textView2.setText(format.format(eval(textView.getText().toString())));
                    }else {
                        textView.setText(textView.getText() + "8");
                    }

                }
            });

            nine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(status_add || status_sub || status_div || status_mul){
                        textView.setText(textView.getText() + "9");
                        textView2.setText(format.format(eval(textView.getText().toString())));
                    }else {
                        textView.setText(textView.getText() + "9");
                    }

                }
            });

            point.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    textView.setText(textView.getText() + ".");

                }
            });

            zero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    textView.setText(textView.getText() + "0");

                }
            });


            textView.addTextChangedListener(new TextWatcher() {

                public void afterTextChanged(Editable s) {
                }

                public void beforeTextChanged(CharSequence s, int start,
                                              int count, int after) {
                }

                public void onTextChanged(CharSequence s, int start,
                                          int before, int count) {
                    if(String.valueOf(s).equals("1+-*/1")){
                        showDialog();
                    }else if(String.valueOf(s).equals("2+-*/2")){
                        showDialog();
                    }else if(String.valueOf(s).equals("3+-*/3")){
                        showDialog();
                    }
                }
            });

        }


    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

    private void showDialog(){
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.custom_dialog);
        dialog.setTitle("Title...");
        dialog.setCancelable(false);

        LinearLayout linear_1 = dialog.findViewById(R.id.linear_1);
        LinearLayout linear_2 = dialog.findViewById(R.id.linear_2);
        LinearLayout linear_3 = dialog.findViewById(R.id.linear_3);

        linear_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DELETE);
                intent.setData(Uri.parse("package:com.mobkini.calculator"));
                startActivity(intent);
            }
        });

        linear_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DELETE);
                intent.setData(Uri.parse("package:com.mobkini.calculator"));
                startActivity(intent);
            }
        });

        linear_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}