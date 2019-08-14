package com.baufest.ingreso.alphabetSoup;

import java.nio.charset.Charset;

public class Casilla {
	
	private char letra;
	private char vecinoIzq;
	private char vecinoDer;
	private char vecinoArriba;
	private char vecinoAbajo;

	private boolean visitado;
	private int letraPrevia;
	
	public boolean estado(char actual[][], int letraPrev)
	{
		if(!visitado)
			return true;
		return false;
	}
	
	public boolean isVisitado() {
		return visitado;
	}
	
	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}
	
	public int getLetraPrevia() {
		return letraPrevia;
	}
	
	public void setLetraPrevia(int letraPrevia) {
		this.letraPrevia = letraPrevia;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public char getVecinoIzq() {
		return vecinoIzq;
	}

	public void setVecinoIzq(char vecinoIzq) {
		this.vecinoIzq = vecinoIzq;
	}

	public char getVecinoDer() {
		return vecinoDer;
	}

	public void setVecinoDer(char vecinoDer) {
		this.vecinoDer = vecinoDer;
	}

	public char getVecinoArriba() {
		return vecinoArriba;
	}

	public void setVecinoArriba(char vecinoArriba) {
		this.vecinoArriba = vecinoArriba;
	}

	public char getVecinoAbajo() {
		return vecinoAbajo;
	}

	public void setVecinoAbajo(char vecinoAbajo) {
		this.vecinoAbajo = vecinoAbajo;
	}
}
