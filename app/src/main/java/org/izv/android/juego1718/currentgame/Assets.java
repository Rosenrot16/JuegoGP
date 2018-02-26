package org.izv.android.juego1718.currentgame;

import org.izv.android.juego1718.media.Graphics;
import org.izv.android.juego1718.media.Image;

public class Assets {

    public static Image background, ball, pk2, jump, right, stand, ducking, bk3, valla, tipo1, tipo2, tiposalto;

    public static void load(Graphics g) {
        Assets.background = g.newImage("background.jpg");
        Assets.pk2 = g.newImage("pk2.jpg");
        Assets.bk3 = g.newImage("bk3.png");
        Assets.valla = g.newImage("valla1.png");
        Assets.tipo1 = g.newImage("tipo1.png");
        Assets.tipo2 = g.newImage("tipo2.png");
        Assets.tiposalto = g.newImage("tiposalto.png");
        Assets.ball = g.newImage("ball.png");
        Assets.jump = g.newImage("jump.png");
        Assets.right = g.newImage("right.png");
        Assets.stand = g.newImage("stand.png");
        Assets.ducking = g.newImage("ducking.png");
    }
}