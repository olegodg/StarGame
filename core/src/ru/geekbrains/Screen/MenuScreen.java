package ru.geekbrains.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

import ru.geekbrains.Base.BaseScreen;

public class MenuScreen extends BaseScreen {
    private static final float vectorLen=0.5f;
    Texture img;
    private Vector2 possition;
    private Vector2 speed;
    private Vector2 touch;

    @Override
    public void show() {
        img = new Texture("space.png");
        possition = new Vector2();
        speed = new Vector2();
        touch = new Vector2();
        super.show();
        //Gdx.graphics.setContinuousRendering(false);
        //Gdx.graphics.requestRendering();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
       // if(Gdx.input.isTouched()){
        possition.add(speed);
        //}
        ScreenUtils.clear(0, 0.1f, 0.5f, 1);
        batch.begin();
        batch.draw(img, possition.x, possition.y);
        if(touch.cpy().sub(possition).len()<speed.len()){
            possition.set(touch);
        }
        else{
            possition.add(speed);
        }
        batch.end();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        //possition.set(screenX, Gdx.graphics.getHeight()-screenY);
        touch.set(screenX, Gdx.graphics.getHeight()-screenY);
        speed.set(touch.cpy().sub(possition)).setLength(vectorLen);
        return false;
    }

    @Override
    public void dispose() {
        super.dispose();
        img.dispose();
    }
}
