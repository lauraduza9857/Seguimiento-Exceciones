package vista;

import processing.core.PApplet;

public class Circulo extends Figura{

	public Circulo(int posX, int posY, int width, int height, PApplet app) {
		super(posX, posY, width, height, app);
	
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
		
		this.app.ellipse(posX, posY, width,height);
		
	}

}
