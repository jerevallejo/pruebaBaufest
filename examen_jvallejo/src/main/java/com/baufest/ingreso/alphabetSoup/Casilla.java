package com.baufest.ingreso.alphabetSoup;

import java.nio.charset.Charset;

public class Casilla {
	
	private char casillero[][];
	private boolean visitado;
	private int letraPrevia;
	
	public void cambiarEstado(char actual[][])
	{
		
	}
	
	public boolean estado(char actual[][], int letraPrev)
	{
		if(!visitado)
			return true;
		return false;
	}
	
	
	public char[][] getCasillero() {
		return casillero;
	}
	public void setCasillero(char[][] casillero) {
		this.casillero = casillero;
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
	
	
	
	

}
