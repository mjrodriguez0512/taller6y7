package co.edu.konradlorenz.cardview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Transition;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AlbumDetailActivity extends AppCompatActivity {
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
    private Context mContext;
    private int p=0;
    private Transition transition;
    public static final long DURACION = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);
        nombre=findViewById(R.id.nombre);
        genero=findViewById(R.id.genero);
        actores=findViewById(R.id.actor);
        portada=findViewById(R.id.portada);
        b1=findViewById(R.id.boton1);
        b2=findViewById(R.id.boton2);
        b3=findViewById(R.id.boton3);
        b4=findViewById(R.id.boton4);
        b5=findViewById(R.id.boton5);
        b6=findViewById(R.id.boton6);
        mContext=this;
        Intent intent= getIntent();
        Bundle b =intent.getExtras();
        final int count=b.getInt("IMG");
        if(count==1){
            nombre.setText("Stranger Things");
            genero.setText("Terror");
            actores.setText(" Winona Ryder, David Harbour, Finn Wolfhard, Millie Bobby Brown, Gaten Matarazzo, Caleb McLaughlin");
            portada.setImageResource(R.drawable.serie1);
            p=1;
            b3.setVisibility(View.GONE);
            b4.setVisibility(View.GONE);
            b5.setVisibility(View.GONE);
            b6.setVisibility(View.GONE);

        }
        if(count==2){
            nombre.setText("casa de papel");
            genero.setText("Acción");
            actores.setText("juanito de papel, alfedo calmate pofavo de papel, pancho villa de papel");
            portada.setImageResource(R.drawable.serie2);
            p=2;
            b1.setVisibility(View.GONE);
            b3.setVisibility(View.GONE);
            b4.setVisibility(View.GONE);
            b5.setVisibility(View.GONE);
            b6.setVisibility(View.GONE);
        }
        if(count==3){
            nombre.setText("The Walking Dead");
            genero.setText("Acción");
            actores.setText("Andrew Lincoln, Jon Bernthal,Sarah Wayne Callies,Laurie Holden, Jeffrey DeMunn, Steven Yeun, Chandler Riggs");
            portada.setImageResource(R.drawable.serie3);
            p=3;
            b5.setVisibility(View.GONE);
            b6.setVisibility(View.GONE);

        }
        if(count==4){
            nombre.setText("Crown");
            genero.setText("Acción");
            actores.setText("Claire Foy,Matt Smith,Vanessa Kirby,Eileen Atkins,Jeremy Northam,Victoria Hamilton,Ben Miles");
            portada.setImageResource(R.drawable.serie4);
            p=4;
            b6.setVisibility(View.GONE);

        }
        if(count==6){
            nombre.setText("Elite");
            genero.setText("Comedia");
            actores.setText("María Pedraza,Itzan Escamilla,Miguel Bernardeau,Miguel Herrán,Jaime Lorente,Álvaro Rico,Arón Piper,Mina El Hammani,Ester Expósito,Omar Ayuso,Danna Paola");
            portada.setImageResource(R.drawable.serie6);
            b6.setVisibility(View.GONE);
            p=6;
        }
        if(count==5){
            nombre.setText("The Walking Dead");
            genero.setText("Acción, Drama, Ficción utópica y distópica, Ciencia ficción apocalíptica, Ciencia ficción");
            actores.setText(" Eliza Taylor, Paige Turco, Bob Morley, Marie Avgeropoulos");
            portada.setImageResource(R.drawable.serie5);
            p=5;
            b2.setVisibility(View.GONE);
            b3.setVisibility(View.GONE);
            b4.setVisibility(View.GONE);
            b5.setVisibility(View.GONE);
            b6.setVisibility(View.GONE);
        }
      b1.setOnClickListener(new View.OnClickListener() {
          @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
          @Override
          public void onClick(View view) {
              transition = new Explode();
              iniciarActividad(1,p);
          }
      });

        b2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                transition = new Explode();
                iniciarActividad(2,p);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                transition = new Explode();
                iniciarActividad(3,p);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                transition = new Explode();
                iniciarActividad(4,p);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                transition = new Explode();
                iniciarActividad(5,p);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                transition = new Explode();
                iniciarActividad(6,p);

            }
        });


    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void iniciarActividad(int con,int x){
        transition.setDuration(DURACION);
        transition.setInterpolator(new DecelerateInterpolator());
        getWindow().setExitTransition(transition);
        Intent intent = new Intent(this,tempDetailActivity.class);
        intent.putExtra("IMG",con);
        intent.putExtra("foto",x);
        startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());
    }
}

