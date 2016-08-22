package com.example.danny.pimpskate;

import android.app.usage.UsageEvents;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

public class PimpSkate extends AppCompatActivity {
    // Handler hand = new Handler();

    ImageButton chasis1, chasis2, chasis3, chasis4;
    ImageButton amaboton, azulboton, rosa, negro, verde, lila, rojo, naranja;
    CheckBox uno, dos, tres, cuatro;
    ImageView patin;
    int i = 0;
    int rot = 1;
    TareasRuedas tar;
    boolean bandera =false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pimp_skate);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        patin = (ImageView) findViewById(R.id.patin);
        amaboton = (ImageButton) findViewById(R.id.ruedama);
        azulboton = (ImageButton) findViewById(R.id.azulBoton);
        naranja = (ImageButton) findViewById(R.id.ruenaranja);
        rosa = (ImageButton) findViewById(R.id.ruerosa);
        negro = (ImageButton) findViewById(R.id.ruenegra);
        verde = (ImageButton) findViewById(R.id.rueverde);
        rojo = (ImageButton) findViewById(R.id.rueroja);
        lila = (ImageButton) findViewById(R.id.lila);
        uno = (CheckBox) findViewById(R.id.checkBox);
        dos = (CheckBox) findViewById(R.id.checkBox2);
        tres = (CheckBox) findViewById(R.id.checkBox3);
        cuatro = (CheckBox) findViewById(R.id.checkBox4);
        chasis2 = (ImageButton) findViewById(R.id.imageButton);
        chasis1 = (ImageButton) findViewById(R.id.imageButton2);
        chasis3 = (ImageButton) findViewById(R.id.imageButton3);
        chasis4 = (ImageButton) findViewById(R.id.cuartaRueda);

        ImageButton [] a = {chasis1,chasis2,chasis3,chasis4};
       tar = new TareasRuedas("rodar hilo",a);
        tar.start();
        patin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                i++;
                if (i == 1) {
                    patin.setBackgroundResource(R.drawable.sebaigorblanco);
                    patin.setY(patin.getY() + 10);
                    patin.invalidate();
                }

                if (i == 2) {
                    patin.setBackgroundResource(R.drawable.sebablanco);
                    patin.setY(patin.getY() - 10);
                    patin.invalidate();
                    Toast.makeText(getApplicationContext(), "" + tar.para, Toast.LENGTH_SHORT).show();
                }
                if (i == 3) {
                    patin.setBackgroundResource(R.drawable.sebaazul);
                    patin.invalidate();

                    i = 0;

                      if(tar.para) {
                          tar.paraBandera(false);
                      }else {
                          tar.paraBandera(true);

                      }
                           Toast.makeText(getApplicationContext(), "" + tar.para, Toast.LENGTH_SHORT).show();


                }

            }
        });
        naranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dos.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis2.setBackground(getResources().getDrawable(R.drawable.ruedanaranja));
                }
                if (uno.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis1.setBackground(getResources().getDrawable(R.drawable.ruedanaranja));
                }
                if (tres.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis3.setBackground(getResources().getDrawable(R.drawable.ruedanaranja));
                }
                if (cuatro.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis4.setBackground(getResources().getDrawable(R.drawable.ruedanaranja));
                }
            }
        });
        rojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dos.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis2.setBackground(getResources().getDrawable(R.drawable.ruedaroja));
                }
                if (uno.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis1.setBackground(getResources().getDrawable(R.drawable.ruedaroja));
                }
                if (tres.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis3.setBackground(getResources().getDrawable(R.drawable.ruedaroja));
                }
                if (cuatro.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis4.setBackground(getResources().getDrawable(R.drawable.ruedaroja));
                }
            }
        });
        negro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dos.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis2.setBackground(getResources().getDrawable(R.drawable.ruedanegra));
                }
                if (uno.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis1.setBackground(getResources().getDrawable(R.drawable.ruedanegra));
                }
                if (tres.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis3.setBackground(getResources().getDrawable(R.drawable.ruedanegra));
                }
                if (cuatro.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis4.setBackground(getResources().getDrawable(R.drawable.ruedanegra));
                }
            }
        });
        rosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dos.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis2.setBackground(getResources().getDrawable(R.drawable.ruedarosa));
                }
                if (uno.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis1.setBackground(getResources().getDrawable(R.drawable.ruedarosa));
                }
                if (tres.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis3.setBackground(getResources().getDrawable(R.drawable.ruedarosa));
                }
                if (cuatro.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis4.setBackground(getResources().getDrawable(R.drawable.ruedarosa));
                }
            }
        });
        verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dos.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis2.setBackground(getResources().getDrawable(R.drawable.ruedaverde));
                }
                if (uno.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis1.setBackground(getResources().getDrawable(R.drawable.ruedaverde));
                }
                if (tres.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis3.setBackground(getResources().getDrawable(R.drawable.ruedaverde));
                }
                if (cuatro.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis4.setBackground(getResources().getDrawable(R.drawable.ruedaverde));
                }

            }
        });
        lila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (dos.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis2.setBackground(getResources().getDrawable(R.drawable.ruedalila));
                }
                if (uno.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis1.setBackground(getResources().getDrawable(R.drawable.ruedalila));
                }
                if (tres.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis3.setBackground(getResources().getDrawable(R.drawable.ruedalila));
                }
                if (cuatro.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis4.setBackground(getResources().getDrawable(R.drawable.ruedalila));
                }

            }
        });
        azulboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dos.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis2.setBackground(getResources().getDrawable(R.drawable.ruedaazul));
                }
                if (uno.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis1.setBackground(getResources().getDrawable(R.drawable.ruedaazul));
                }
                if (tres.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis3.setBackground(getResources().getDrawable(R.drawable.ruedaazul));
                }
                if (cuatro.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis4.setBackground(getResources().getDrawable(R.drawable.ruedaazul));
                }
            }
        });


        amaboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (uno.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis1.setBackground(getResources().getDrawable(R.drawable.rueda));
                }
                if (dos.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis2.setBackground(getResources().getDrawable(R.drawable.rueda));
                }
                if (tres.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis3.setBackground(getResources().getDrawable(R.drawable.rueda));
                }
                if (cuatro.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Street inavders SEBA", Toast.LENGTH_LONG).show();
                    chasis4.setBackground(getResources().getDrawable(R.drawable.rueda));
                }
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK) {
            tar.paraBandera(true);
            tar.paraHilo();
            Toast.makeText(getApplicationContext(),"saliendo...",Toast.LENGTH_SHORT).show();
        }

        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onResume() {
        super.onResume();
        tar.paraBandera(false);

    }

    @Override
    protected void onPause() {

        super.onPause();
        tar.paraBandera(false);


    }
    /* private Runnable rodar = new Runnable() {
        @Override
        public void run() {
            int e =0;
            chasis1.setRotation(e++*2);
            chasis1.invalidate();
            hand.postDelayed(this,1000);
       }
    };*/




    class TareasRuedas extends Thread{

    ImageButton []b;



          TareasRuedas(String name,ImageButton... a){
              super(name);
              this.b = a;
          }
        int limite = 500;
        boolean para = false;
        @Override
        public void run() {

            while (true)
            while (para) {




                    b[0].setRotation(rot++*9);


                    b[1].setRotation(rot++);

                    b[2].setRotation(rot++*9);


                    b[3].setRotation(rot++*9);

                    //     Thread.sleep(25);
                    b[0].setRotation(rot++*9);


                    b[1].setRotation(rot++*9);

                    b[2].setRotation(rot++*9);

                    b[3].setRotation(rot++*9);


                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {

                    }



            }

        }


        public void paraHilo(){

          interrupt();
        }
        public void paraBandera(boolean t){

            this.para=t;
        }


    }


}