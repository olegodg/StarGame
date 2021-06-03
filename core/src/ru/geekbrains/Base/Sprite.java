package ru.geekbrains.Base;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.math.Rect;

public class Sprite extends Rect {
     protected float angle;
     protected float scale=1;
     protected TextureRegion[] regions;
     protected int frame;
     public Sprite(TextureRegion region){
         regions = new TextureRegion[1];
         regions[0]=region;
     }
     public  void draw(SpriteBatch batch){
         batch.draw(regions[frame], getBottom(), getLeft(), getWidth(), getHeight(), halfWidth, halfHeight,scale, scale, angle);
     }
     public void resize(Rect worldBounds){

     }
    public void update(float delta){

    }
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        return false;
    }
    public boolean touchUp(Vector2 touch, int pointer, int button) {
        return false;
    }

    public float getAngle() {
        return angle;
    }

    public float getScale() {
        return scale;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }
    public void setHeightProportion(float hieght){
         setHeight(hieght);
         float aspect = regions[frame].getRegionWidth()/regions[frame].getRegionHeight();
         setWidth(hieght*aspect);
    }
}
