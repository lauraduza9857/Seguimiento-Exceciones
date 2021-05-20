package vista;

import processing.core.PApplet;

public class Circulo extends Figura{

	public Circulo(int posX, int posY, int width, int height, PApplet app) {
		super(posX, posY, width, height, app);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		try {
			this.app.fill(r,g,b);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub
		
		this.app.strokeWeight(1);
		this.app.stroke(0);
		if(this.selected) {
			this.app.strokeWeight(10);
			this.app.stroke(255,0,0);
		}
		
		this.app.ellipse(posX, posY, width,height);
		
		
	}

}
