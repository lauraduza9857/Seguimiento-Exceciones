package vista;

import java.util.ArrayList;

import processing.core.PApplet;

public class Principal extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Principal.class.getName());
	}

	ArrayList<Cuadrado> listaColoresSeleccionar;
	Cuadrado cuadrado;
	Circulo circulo;
	/*int colori = color(0);
	private int x = 0 ;
	private int y = 0;*/

	public void settings() {
		size(1000, 600);
	}

	public void setup() {
		listaColoresSeleccionar = new ArrayList<Cuadrado>();
		cuadrado = new Cuadrado(width / 2 - 200, height / 2 - 100, 100, 100, this);
		circulo = new Circulo(width / 2 + 200, height / 2 - 100, 100, 100, this);

		for (int i = 0; i < 40; i++) {
			listaColoresSeleccionar.add(new Cuadrado((width / 10) + (i * 20), height / 2, 20, 20, this,
					(int) random(150, 255), (int) random(150, 255), (int) random(150, 255)));
		}
	}

	public void draw() {
		background(255);
		fill(0);
		rect(300, 450, 200, 60); // comparar
		rect(700, 450, 200, 60);// limpiar
		rectMode(CENTER);
		strokeWeight(1);
		stroke(0);
		

		for (int i = 0; i < listaColoresSeleccionar.size(); i++) {
			listaColoresSeleccionar.get(i).pintar();
		}
		circulo.pintar();
		cuadrado.pintar();
	}

	public void mouseClicked() {

		try {
			for (int i = 0; i < listaColoresSeleccionar.size(); i++) {
				if (cuadrado.selected) {
					listaColoresSeleccionar.get(i).seleccionarColor(cuadrado);
				}
				if (circulo.selected) {
					listaColoresSeleccionar.get(i).seleccionarColor(circulo);
				}
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	//	 if (dist(x, y, 700, 450) < 70) { // cercan�a
			if (dist(mouseX, mouseY, 700, 450) < 35) { // cambio de color
				cuadrado.setR(0);
				cuadrado.setG(0);
				cuadrado.setB(0);
				
				circulo.setR(0);
				circulo.setG(0);
				circulo.setB(0);
				
			}
 
		cuadrado.clicked();
		circulo.clicked();
		

		
		/* if(mouseX ) {
			 cuadrado.setB(255)*/
		// System.out.println("circ:" + circulo.selected + " "+"cuadr:" +
		// cuadrado.selected);

	}
}
