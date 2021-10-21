package item;

import javax.swing.JFrame;

public class Bomb extends Item {
	private final static String TAG = "Key : ";
	private Bomb bomb = this;
   
	public Bomb(JFrame app, String url, String gubun, int xItem, int yItem, int width, int height) {
		super(app, url, gubun, xItem, yItem, width, height);
		drawItem();
	}
	@Override
	public void drawItem() {
		getSsItem().drawObject(getXItem(), getYItem());
		getApp().add(getSsItem());
	}
}
