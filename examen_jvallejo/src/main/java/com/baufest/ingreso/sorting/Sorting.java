package com.baufest.ingreso.sorting;

import java.util.List;

public class Sorting {

    /**
     * Se debe ordenar primero por puntuación de manera descendente, luego por nombre de manera ascendente.
     * @param jugadores la lista de jugadores a ordenar
     * @return la lista ordenada de jugadores
     */

	public static List<Jugador> ordenarPorPuntuacionYNombre(List<Jugador> jugadores){

		jugadores.sort((jug1, jug2) -> {
			
			int cmp = Integer.compare(jug2.getPuntuacion(), jug1.getPuntuacion());
			
			if(cmp == 0)	
			{	
				cmp = jug2.getNombre().compareTo(jug1.getNombre());
				
				if(cmp < 0)
				{
					return cmp = 1;
				}
				
				cmp = -1;
			
			}
			return cmp;	
		});
		
		for(Jugador jug : jugadores)
		{
			System.out.println(jug.getNombre() +" puntuacion "+ jug.getPuntuacion());
		}
	
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
		
		jugadores.sort((jug1, jug2) -> {
			int cmp = Integer.compare(jug2.getPuntuacion(), jug1.getPuntuacion());
			if(cmp == 0)		
				cmp = Integer.compare(jug1.getPerdidas(), jug2.getPerdidas());
			if(cmp == 0)	
			{	
				cmp = jug2.getNombre().compareTo(jug1.getNombre());
				
				if(cmp < 0)
				{
					return cmp = 1;
				}
				
				cmp = -1;	
			}
			
			return cmp;	
		});
		return jugadores;
	}
	
}
