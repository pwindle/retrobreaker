package br.usp.ime.retrobreaker.forms;

public class Brick extends Quad {
	
	public static final int GRAY_LIVES = 1;
	public static final int NORMAL_LIVES = 0;
	
	public static final int GRAY_EXPLOSION_SIZE = 8;
	
	public static enum Type {
		NORMAL, EXPLOSIVE, HARD, MOBILE
	}

	public static final float[] VERTICES = {
		-0.5f, -0.2f, // bottom left
		-0.5f,  0.2f, // top left
		0.5f, -0.2f, // bottom right
		0.5f,  0.2f, // top right
	};
	
	private int mLives;
	private Type mType;

	public Brick(float[] colors, float posX, float posY, float scale, Type type) {
		super(VERTICES, colors, posX, posY, scale);
		mType = type;
		switch (type) {
		case NORMAL:
			mLives = 0;
			break;
		case EXPLOSIVE:
			mLives = 0;
			break;
		case HARD:
			mLives = 1;
			break;
		case MOBILE:
			mLives = 0;
			break;
		}
				
	}
	
	public void decrementLives() {
		mLives--;
	}
	
	public int getLives() {
		return mLives;
	}
	
	public Type getType() {
		return mType;
	}

}