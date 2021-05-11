package com.msvdaamen;

import com.msvdaamen.engine.IGameLogic;
import com.msvdaamen.engine.MsvEngine;
import com.msvdaamen.game.TestGame;

public class main {
    public static void main(String[] args) {
        try {
            boolean vSync = true;
            IGameLogic gameLogic = new TestGame();
            MsvEngine gameEng = new MsvEngine("GAME", 600, 480, vSync, gameLogic);
            gameEng.run();
        } catch (Exception excp) {
            excp.printStackTrace();
            System.exit(-1);
        }
    }
}
