package org.izv.android.juego1718;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;

import org.izv.android.juego1718.currentgame.Assets;
import org.izv.android.juego1718.currentgame.Background;
import org.izv.android.juego1718.currentgame.BouncingBall;
import org.izv.android.juego1718.currentgame.Fondo;
import org.izv.android.juego1718.currentgame.Tipejo;
import org.izv.android.juego1718.generic.GenericGameActivity;

import java.util.Random;

/**
 * Created by dam on 14/02/2018.
 */

public class JuegoNuevo extends GenericGameActivity {

    private  BouncingBall b1, b2;
    private Tipejo t;

    @Override
    public void start() {

        addGameObject(new Fondo());

        b1 = new BouncingBall();
        b1.setX(this.getGraphics().getWidth() - b1.getWidth());
        b1.setY(this.getGraphics().getHeight() - b1.getHeight());
        addGameObject(b1);

        t = new Tipejo();
        addGameObject(t);
    }

    @Override
    public void update() {
        super.update();

        chocaPelota(t, b1);
    }

    private boolean chocaPelota(Tipejo t, BouncingBall b){

        boolean chocan = t.instersects(b);
        if(chocan){
            Intent intent = new Intent(JuegoNuevo.this, GameOver.class);
            startActivity(intent);
        }
        else {
            if(b1.getX() < 2*(- b1.getWidth())){
                Random r = new Random();
                //Entre el 30 y 50. 30 inclusive
                int speed = -(r.nextInt(50 - 30) + 30);
                b1 = new BouncingBall();
                b1.setSpeedX(speed);
                b1.setX(this.getGraphics().getWidth() - b1.getWidth());
                b1.setY(this.getGraphics().getHeight() - b1.getHeight());
                addGameObject(b1);
            }
        }

        return true;
    }


}
