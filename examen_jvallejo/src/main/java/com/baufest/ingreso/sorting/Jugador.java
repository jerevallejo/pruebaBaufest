package com.baufest.ingreso.sorting;



public class Jugador implements Comparable<Jugador>{
	
	private String nombre;
    private int puntuacion;
    private int perdidas;

	public Jugador(String nombre, int puntuacion) {
			this.nombre = nombre;
			this.puntuacion = puntuacion;
			this.perdidas = 0;
	}
	
	public Jugador(String nombre, int puntuacion, int perdidas) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.perdidas = perdidas;
	}
	
    @Override
    public String toString() {
    	
        return this.getNombre() + this.getPuntuacion() + this.getPerdidas();
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getPerdidas() {
		return perdidas;
	}

	public void setPerdidas(int perdidas) {
		this.perdidas = perdidas;
	}

	@Override
	public int compareTo(Jugador j) {
		if(j.getPuntuacion()<puntuacion)
		{
			return -1;
		}else if(j.getPuntuacion()<puntuacion){
			if(j.getNombre().compareTo(nombre)<1){
				return -1;
			}else {
				return 1;
			}
		}else {
			return 1;
		}
	}
	public int compare(Jugador a, Jugador b) {
        int resultado = Integer.compare(a.getPuntuacion(), b.getPuntuacion());//a.getPuntuacion().compareTo(b.getPuntuacion());
        if (resultado != 0 ) {
            return resultado;
        }
        resultado = a.getNombre().compareTo(b.getNombre());
        if (resultado != 0 ) {
            return resultado;
        }
        return resultado;
    }
}
