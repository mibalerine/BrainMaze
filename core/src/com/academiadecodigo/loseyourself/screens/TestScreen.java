package com.academiadecodigo.loseyourself.screens;

import com.academiadecodigo.loseyourself.gameobjects.Player;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

/**
 * Created by codecadet on 23/11/17.
 */
public class TestScreen extends ScreenAdapter {
    private Player player;
    private Stage gameStage;

    @Override
    public void show() {
        super.show();

        gameStage = new Stage();
        this.player = new Player(true);
        gameStage.addActor(player);
        gameStage.addActor(new Player(false));
    }

    @Override
    public void render(float delta) {

        super.render(delta);

        gameStage.act();
        gameStage.getCamera().position.set(player.getX(), player.getY(), 0);

        gameStage.draw();
    }
}