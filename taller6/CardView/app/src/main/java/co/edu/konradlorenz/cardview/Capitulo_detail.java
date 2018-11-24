package co.edu.konradlorenz.cardview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Capitulo_detail extends AppCompatActivity {
    ImageView portada;
    TextView capitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitulo_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent= getIntent();
        Bundle b =intent.getExtras();
        int cap=b.getInt("cap");
        int foto=b.getInt("foto");
        portada= findViewById(R.id.imagep);
        portada.setImageResource(foto);
        capitulo=findViewById(R.id.textcap);
        capitulo.setText("Capitulo "+cap);




    }

}
