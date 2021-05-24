package ru.geekbrains;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class StarGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private TextureRegion region;
	private float x;
	private float y;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("space1.jpg");
		region = new TextureRegion(img,15,15,200,200);
	}

	@Override
	public void render () {
		x++;
		y++;
		ScreenUtils.clear(0, 0.7f, 0.6f, 1);
		batch.begin();
		batch.draw(img, x+10, y+10);
		batch.draw(region,x,y);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
