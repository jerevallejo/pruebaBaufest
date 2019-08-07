package com.baufest.ingreso.sorting;


import java.util.Collections;
import java.util.List;

public class Sorting {

    /**
     * Se debe ordenar primero por puntuación de manera descendente, luego por nombre de manera ascendente.
     * @param jugadores la lista de jugadores a ordenar
     * @return la lista ordenada de jugadores
     */

	public static List<Jugador> ordenarPorPuntuacionYNombre(List<Jugador> jugadores){

		Collections.sort(jugadores);
		for(Jugador jug : jugadores)
		{
			System.out.println(jug.getNombre() +" puntuacion "+ jug.getPuntuacion());
		}
		/*Jugador jugadorAux = null; 
	    for (int i = 0; i < jugadores.size(); i++) {
			for (int j = i++; j < jugadores.size(); j++) {
				if(jugadores.get(i).getPuntuacion()>jugadores.get(j).getPuntuacion())
		    	{
		    		jugadorAux = jugadores.get(i);
		    		jugadores.get(i).
		    	}
			}
	    }*/
		return jugadores;
	    	
        //throw new UnsupportedOperationException();
	}

    /**
     * Se debe ordenar primero por puntuación de manera descendente. Cuando 2 jugadores tienen igual cantidad de puntos,
     * el que tiene menos perdidas se lo considerara el mayor. Luego a igual puntos y perdidas se seguirá usando el
     * nombre de manera ascendente.
     * @param jugadores la lista de jugadores a ordenar
     * @return la lista ordenada de jugadores
     */
	public static List<Jugador> ordenarPorPuntuacionPerdidasYNombre(List<Jugador> jugadores){
        //TODO: resolver
        throw new UnsupportedOperationException();
	}
}
