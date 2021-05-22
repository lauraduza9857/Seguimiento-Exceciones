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
	boolean anuncioP, anuncioN;

	public void settings() {
		size(1000, 600);
	}

	public void setup() {
		anuncioP = false; //anuncio positivo
		anuncioN = false; //anuncio negativo
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
		
		if (anuncioP == true) {
			fill(0);
			textSize(15);
			text("Hiciste match!", 450, 550);
		}
		if (anuncioN == true) {
			fill(0);
			textSize(15);
			text("No hiciste match! Pinta las figuras del mismo color", 350, 550);
		}
		
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

		if (dist(mouseX, mouseY, 700, 450) < 35) { // botón cambio de color
			cuadrado.setR(0);
			cuadrado.setG(0);
			cuadrado.setB(0);

			circulo.setR(0);
			circulo.setG(0);
			circulo.setB(0);

		}
		if (dist(mouseX, mouseY, 300, 450) < 35) { // botón comparar colores
			if ((cuadrado.getR() == circulo.getR()) && (cuadrado.getG() == circulo.getG())
					&& (cuadrado.getB() == circulo.getB())) {
				anuncioP = true;
				anuncioN = false;
			}else {
				anuncioP= false;
				anuncioN = true;
				
			}
		}
		
		

		cuadrado.clicked();
		circulo.clicked();

	}
}
