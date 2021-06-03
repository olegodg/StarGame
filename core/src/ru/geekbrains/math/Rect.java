package ru.geekbrains.math;

import com.badlogic.gdx.math.Vector2;

public class Rect {
    public final Vector2 possition = new Vector2();
    protected float halfWidth;
    protected float halfHeight;
    public Rect(){}

    public Rect(Rect from) {
        this(from.possition.x,from.possition.y, from.getHalfHeight(),from.getHalfWidth());
    }

    public Rect(float x, float y, float halfWidth, float halfHeight) {
        possition.set(x,y);
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
    }

    public float getHalfWidth() {
        return halfWidth;
    }

    public float getHalfHeight() {
        return halfHeight;
    }

    public float getLeft() {
        return possition.x-halfWidth;
    }
    public float getRight() {
        return possition.x+halfWidth;
    }
    public float getBottom() {
        return possition.y-halfHeight;
    }
    public float getTop() {
        return possition.y+halfHeight;
    }
    public float getWidth() {
        return halfWidth+2f;
    }
    public float getHeight() {
        return halfHeight+2f;
    }
    public void set(Rect from){
        possition.set(from.possition);
        halfHeight=from.halfHeight;
        halfWidth=from.halfWidth;
    }
    public void setLeft(float left){possition.x=left + halfWidth;}
    public void setRight(float right){possition.x=right - halfWidth;}
    public void setBottom(float bottom){possition.y=bottom + halfHeight;}
    public void setTop(float top){possition.x=top - halfHeight;}
    public void setSize(float width, float height){this.halfHeight=height/2f; this.halfWidth=width/2f;}
    public void setWidth(float width){this.halfWidth=width/2f;}
    public void setHeight(float height){this.halfHeight=height/2f;}
    public boolean isMe (Vector2 touch){
        return touch.x >=getLeft() && touch.x<= getRight() && touch.y >= getBottom() && touch.y <= getTop();
    }
}
