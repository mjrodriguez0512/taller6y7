package co.edu.konradlorenz.cardview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Animation fromBottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        Animation fromTop = AnimationUtils.loadAnimation(this,R.anim.fromtop);

        Button bottonEnter = (Button) findViewById(R.id.button_enter);
        bottonEnter.setAnimation(fromBottom);

        bottonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView imageLogo = (ImageView) findViewById(R.id.image_logo);
        imageLogo.setAnimation(fromTop);


    }
    }


