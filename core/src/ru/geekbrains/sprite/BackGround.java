package ru.geekbrains.sprite;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.geekbrains.Base.Sprite;
import ru.geekbrains.math.Rect;

public class BackGround extends Sprite {

    public BackGround(Texture Texture) {
        super(new TextureRegion(Texture));
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(1f);
        this.possition.set(worldBounds.possition);
    }
}
