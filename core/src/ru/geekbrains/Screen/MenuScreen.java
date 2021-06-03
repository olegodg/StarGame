package ru.geekbrains.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

import ru.geekbrains.Base.BaseScreen;
import ru.geekbrains.math.Rect;
import ru.geekbrains.sprite.BackGround;

public class MenuScreen extends BaseScreen {
    private static final float vectorLen=0.7f;
    //Texture img;
    Texture back;
    //private Vector2 possition;
   // private Vector2 speed;
    private BackGround backGround;

    @Override
    public void show() {
        //img = new Texture("space.png");
        //possition = new Vector2(-0.5f,-0.5f);
        //speed = new Vector2();
        super.show();
        back = new Texture("textures/BackGR.jpg");
        backGround = new BackGround(back);
        //Gdx.graphics.setContinuousRendering(false);
        //Gdx.graphics.requestRendering();
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        backGround.resize(worldBounds);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
       // if(Gdx.input.isTouched()){
        //possition.add(speed);
        //}
        ScreenUtils.clear(0, 0.1f, 0.5f, 1);
        batch.begin();
        backGround.draw(batch);
        //batch.draw(img, possition.x, possition.y, 1f,1f);
        //if(touch.cpy().sub(possition).len()<speed.len()){
        //    possition.set(touch);
        //}
        //else{
        //    possition.add(speed);
        //}
        batch.end();
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        //possition.set(touch);
        return false;
    }

    //@Override
    //public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    //    //possition.set(screenX, Gdx.graphics.getHeight()-screenY);
    //    touch.set(screenX, Gdx.graphics.getHeight()-screenY);
    //    speed.set(touch.cpy().sub(possition)).setLength(vectorLen);
    //    return false;
    //}

    @Override
    public void dispose() {
        super.dispose();
        //img.dispose();
        back.dispose();
    }

}
