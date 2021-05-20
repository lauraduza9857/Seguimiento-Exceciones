package vista;

import processing.core.PApplet;

public abstract class Figura {
	
	protected int posX;
	protected int posY;
	protected int width;
	protected int height;
	protected PApplet app;
	protected int r;
	protected int g;
	protected int b;
	protected boolean selected;
	
	public Figura(int posX, int posY, int width, int height, PApplet app, int r, int g, int b) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
		this.app = app;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public Figura(int posX, int posY, int width, int height, PApplet app) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
		this.app = app;
		this.selected = false;
	}
	
	public abstract void pintar();
	
	public void clicked() {
		if(this.app.mouseX > this.posX-this.width && 
		   this.app.mouseX < this.posX+this.width &&
		   this.app.mouseY > this.posY-this.height && 
		   this.app.mouseY < this.posY+this.height ) {
			selected = true;
		} else {
			selected = false;
		}
	}
	
	public void seleccionarColor(Figura fig) {
		if(this.app.mouseX > this.posX-this.width && 
				   this.app.mouseX < this.posX+this.width &&
				   this.app.mouseY > this.posY-this.height && 
				   this.app.mouseY < this.posY+this.height ) {
					
						fig.setR(this.r);
						fig.setG(this.g);
						fig.setB(this.b);
					
				}
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
	
}
