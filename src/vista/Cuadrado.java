package vista;

import processing.core.PApplet;

public class Cuadrado extends Figura{
	
	

	public Cuadrado(int posX, int posY, int width, int height, PApplet app) {
		super(posX, posY, width, height, app);
	}
	
	public Cuadrado(int posX, int posY, int width, int height, PApplet app, int r, int g, int b) {
		super(posX, posY, width, height, app, r, g ,b);
	}

	public void pintar() {
		try {
			this.app.fill(r,g,b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.app.strokeWeight(1);
		this.app.stroke(0);
		if(this.selected) {
			this.app.strokeWeight(10);
			this.app.stroke(255,0,0);
		}
		
		this.app.rect(posX, posY, width, height);
	}
	
	

}
