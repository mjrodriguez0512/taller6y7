package co.edu.konradlorenz.cardview;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.transition.Slide;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class tempDetailActivity extends AppCompatActivity {
    private TextView nombre;
    private TextView genero;
    private TextView actores;
    private ImageView portada;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Transition transition;
    public static final long DURACION = 500;
    int p=0;
    int foto=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_detail);
        nombre=findViewById(R.id.nombre);
        b1=findViewById(R.id.boton1);
        b2=findViewById(R.id.boton2);
        b3=findViewById(R.id.boton3);
        b4=findViewById(R.id.boton4);
        b5=findViewById(R.id.boton5);
        b6=findViewById(R.id.boton6);
        portada=findViewById(R.id.portada);
        Intent intent= getIntent();
        Bundle b =intent.getExtras();
        int count=b.getInt("IMG");
        int por=b.getInt("foto");
        Log.w("hola", " este es " + por);
        //portada.setImageResource(por);

        if(por==1){
            portada.setImageResource(R.drawable.serie1);
            foto=R.drawable.serie1;
        }
        if(por==2){
            portada.setImageResource(R.drawable.serie2);
            foto=R.drawable.serie2;
        }
        if(por==3){
            portada.setImageResource(R.drawable.serie3);
            foto=R.drawable.serie3;
        }
        if(por==4){
            portada.setImageResource(R.drawable.serie4);
            foto=R.drawable.serie4;
        }
        if(por==5){
            portada.setImageResource(R.drawable.serie5);
            foto=R.drawable.serie5;
        }
        if(por==6){
            portada.setImageResource(R.drawable.serie6);
            foto=R.drawable.serie6;
        }
        if(count==1){
            nombre.setText("Temporada 1");
        }
        if(count==2){
            nombre.setText("Temporada 2");
        }
        if(count==3){
            nombre.setText("Temporada 3");
        }
        if(count==4){

            nombre.setText("Temporada 4");
        }
        if(count==6){
            nombre.setText("Temporada 6");

        }
        if(count==5){
            nombre.setText("Temporada 5");
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                transition = new Slide();
                iniciarActividad(1,foto);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                transition = new Slide();
                iniciarActividad(2,foto);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                transition = new Slide();
                iniciarActividad(3,foto);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                transition = new Slide();
                iniciarActividad(4,foto);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                transition = new Slide();
                iniciarActividad(5,foto);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                transition = new Slide();
                iniciarActividad(6,foto);

            }
        });


    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void iniciarActividad(int con,int x){
        transition.setDuration(DURACION);
        transition.setInterpolator(new DecelerateInterpolator());
        getWindow().setExitTransition(transition);
        Intent intent = new Intent(this,Capitulo_detail.class);
        intent.putExtra("cap",con);
        intent.putExtra("foto",x);
        startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());
    }

    }

