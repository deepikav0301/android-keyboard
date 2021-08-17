package com.example.keyboardapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button keyQ,keyW,keyE,keyR,keyT,keyY,keyU,keyI,keyO,keyP,keyA,keyS,keyD,keyF,keyG,keyH;
    Button keyJ,keyK,keyL,keyZ,keyX,keyC,keyV,keyB,keyN,keyM;
    Button deletekey,spacekey,commakey,dotkey;
    ImageButton enter;
    ToggleButton capsswitch,numswitch;
    TextView textbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        keyQ=(Button)findViewById(R.id.Qbutton1);
        keyW=(Button)findViewById(R.id.Wbutton1);
        keyE=(Button)findViewById(R.id.Ebutton1);
        keyR=(Button)findViewById(R.id.Rbutton1);
        keyT=(Button)findViewById(R.id.TButton1);
        keyY=(Button)findViewById(R.id.Ybutton1);
        keyU=(Button)findViewById(R.id.Ubutton1);
        keyI=(Button)findViewById(R.id.Ibutton1);
        keyO=(Button)findViewById(R.id.Obutton1);
        keyP=(Button)findViewById(R.id.Pbutton1);
        keyA=(Button)findViewById(R.id.Abutton1);
        keyS=(Button)findViewById(R.id.Sbutton1);
        keyD=(Button)findViewById(R.id.Dbutton1);
        keyF=(Button)findViewById(R.id.Fbutton1);
        keyG=(Button)findViewById(R.id.Gbutton1);
        keyH=(Button)findViewById(R.id.Hbutton1);
        keyJ=(Button)findViewById(R.id.Jbutton1);
        keyK=(Button)findViewById(R.id.Kbutton1);
        keyL=(Button)findViewById(R.id.Lbutton1);
        keyZ=(Button)findViewById(R.id.Zbutton1);
        keyX=(Button)findViewById(R.id.Xbutton1);
        keyC=(Button)findViewById(R.id.Cbutton1);
        keyV=(Button)findViewById(R.id.Vbutton1);
        keyB=(Button)findViewById(R.id.Bbutton1);
        keyN=(Button)findViewById(R.id.Nbutton1);
        keyM=(Button)findViewById(R.id.Mbutton1);
        capsswitch=(ToggleButton)findViewById(R.id.capsButton);
        deletekey=(Button)findViewById(R.id.deleteButton);
        spacekey=(Button)findViewById(R.id.spaceButton);
        commakey=(Button)findViewById(R.id.commaButton);
        dotkey=(Button)findViewById(R.id.dotButton);
        enter=(ImageButton)findViewById(R.id.enterButton);
        numswitch=(ToggleButton)findViewById(R.id.numButton);
        textbox=(TextView)findViewById(R.id.textView1);
        String text=textbox.getText().toString();
        numswitch.setText("123?");
        capsswitch.setText("↑");
        numswitch.setTextOff("123?");
        keyQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_q=keyQ.getText().toString();
                textbox.append(text_q);
            }
        });
        keyW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_w=keyW.getText().toString();
                textbox.append(text_w);
            }
        });
        keyE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_e=keyE.getText().toString();
                textbox.append(text_e);
            }
        });
        keyR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_r=keyR.getText().toString();
                textbox.append(text_r);
            }
        });
        keyT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_t=keyT.getText().toString();
                textbox.append(text_t);
            }
        });
        keyY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_y=keyY.getText().toString();
                textbox.append(text_y);
            }
        });
        keyU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_u=keyU.getText().toString();
                textbox.append(text_u);
            }
        });
        keyI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_i=keyI.getText().toString();
                textbox.append(text_i);
            }
        });
        keyO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_o=keyO.getText().toString();
                textbox.append(text_o);
            }
        });
        keyP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_p=keyP.getText().toString();
                textbox.append(text_p);
            }
        });
        keyA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_a=keyA.getText().toString();
                textbox.append(text_a);
            }
        });
        keyS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_s=keyS.getText().toString();
                textbox.append(text_s);
            }
        });
        keyD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_d=keyD.getText().toString();
                textbox.append(text_d);
            }
        });
        keyF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_f=keyF.getText().toString();
                textbox.append(text_f);
            }
        });
        keyG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_g=keyG.getText().toString();
                textbox.append(text_g);
            }
        });
        keyH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_h=keyH.getText().toString();
                textbox.append(text_h);
            }
        });
        keyJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_j=keyJ.getText().toString();
                textbox.append(text_j);
            }
        });
        keyK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_k=keyK.getText().toString();
                textbox.append(text_k);
            }
        });
        keyL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_l=keyL.getText().toString();
                textbox.append(text_l);
            }
        });
        keyZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_z=keyZ.getText().toString();
                textbox.append(text_z);
            }
        });
        keyX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_x=keyX.getText().toString();
                textbox.append(text_x);
            }
        });
        keyC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_c=keyC.getText().toString();
                textbox.append(text_c);
            }
        });
        keyV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_v=keyV.getText().toString();
                textbox.append(text_v);
            }
        });
        keyB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_b=keyB.getText().toString();
                textbox.append(text_b);
            }
        });
        keyN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_n=keyN.getText().toString();
                textbox.append(text_n);
            }
        });
        keyM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_m=keyM.getText().toString();
                textbox.append(text_m);
            }
        });
        capsswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton,boolean b) {
                if(capsswitch.isChecked()){
                    capsswitch.setTextOn("↑");
                    keyQ.setText("q");
                    keyW.setText("w");
                    keyE.setText("e");
                    keyR.setText("r");
                    keyT.setText("t");
                    keyY.setText("y");
                    keyU.setText("u");
                    keyI.setText("i");
                    keyO.setText("o");
                    keyP.setText("p");
                    keyA.setText("a");
                    keyS.setText("s");
                    keyD.setText("d");
                    keyF.setText("f");
                    keyG.setText("g");
                    keyH.setText("h");
                    keyJ.setText("j");
                    keyK.setText("k");
                    keyL.setText("l");
                    keyZ.setText("z");
                    keyX.setText("x");
                    keyC.setText("c");
                    keyV.setText("v");
                    keyB.setText("b");
                    keyN.setText("n");
                    keyM.setText("m");
                }
                else{
                    capsswitch.setTextOff("↑");
                    keyQ.setText("Q");
                    keyW.setText("W");
                    keyE.setText("E");
                    keyR.setText("R");
                    keyT.setText("T");
                    keyY.setText("Y");
                    keyU.setText("U");
                    keyI.setText("I");
                    keyO.setText("O");
                    keyP.setText("P");
                    keyA.setText("A");
                    keyS.setText("S");
                    keyD.setText("D");
                    keyF.setText("F");
                    keyG.setText("G");
                    keyH.setText("H");
                    keyJ.setText("J");
                    keyK.setText("K");
                    keyL.setText("L");
                    keyZ.setText("Z");
                    keyX.setText("X");
                    keyC.setText("C");
                    keyV.setText("V");
                    keyB.setText("B");
                    keyN.setText("N");
                    keyM.setText("M");
                }
            }
        });
        deletekey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=textbox.getText().toString();
                String end="";
                end = text.substring(0,text.length()-1);
                textbox.setText(end);
            }
        });
        spacekey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textbox.append(" ");
            }
        });
        commakey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textbox.append(",");
            }
        });
        dotkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textbox.append(".");
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textbox.append("\n");
            }
        });
        numswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(numswitch.isChecked()){
                    numswitch.setTextOn("ABC");
                    keyQ.setText("1");
                    keyW.setText("2");
                    keyE.setText("3");
                    keyR.setText("4");
                    keyT.setText("5");
                    keyY.setText("6");
                    keyU.setText("7");
                    keyI.setText("8");
                    keyO.setText("9");
                    keyP.setText("0");
                    keyA.setText("@");
                    keyS.setText("#");
                    keyD.setText("_");
                    keyF.setText("&");
                    keyG.setText("-");
                    keyH.setText("+");
                    keyJ.setText("(");
                    keyK.setText(")");
                    keyL.setText("/");
                    keyZ.setText("*");
                    keyX.setText("\"");
                    keyC.setText("'");
                    keyV.setText(":");
                    keyB.setText(";");
                    keyN.setText("!");
                    keyM.setText("?");
                    capsswitch.setText("=/<");
                }
                else{
                    numswitch.setTextOff("123?");
                    keyQ.setText("q");
                    keyW.setText("w");
                    keyE.setText("e");
                    keyR.setText("r");
                    keyT.setText("t");
                    keyY.setText("y");
                    keyU.setText("u");
                    keyI.setText("i");
                    keyO.setText("o");
                    keyP.setText("p");
                    keyA.setText("a");
                    keyS.setText("s");
                    keyD.setText("d");
                    keyF.setText("f");
                    keyG.setText("g");
                    keyH.setText("h");
                    keyJ.setText("j");
                    keyK.setText("k");
                    keyL.setText("l");
                    keyZ.setText("z");
                    keyX.setText("x");
                    keyC.setText("c");
                    keyV.setText("v");
                    keyB.setText("b");
                    keyN.setText("n");
                    keyM.setText("m");
                    capsswitch.setText("↑");
                }
            }
        });
    }
}