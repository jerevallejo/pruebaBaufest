package com.baufest.ingreso.alphabetSoup;

import java.util.ArrayList;

public class WordSearcher {

    private char soup[][];

    public WordSearcher(char soup[][]){
        this.soup = soup;
    }

    /**
     * El objetivo de este ejercicio es implementar una función que determine si una palabra está en una sopa de letras.
     *
     * ### Reglas
     * - Las palabras pueden estar dispuestas direcciones horizontal o vertical, _no_ en diagonal.
     * - Las palabras pueden estar orientadas en cualquier sentido, esto es, de derecha a izquierda o viceversa, y de arriba
     * para abajo o viceversa.
     * - El cambio de dirección puede estar a media palabra, de modo que, por ejemplo, parte de la palabra
     * esté horizontal y de izquierda a derecha, parte esté vertical y de arriba hacia abajo, y otra parte horizontal
     * de derecha a la izquierda.
     *
     * @param word	Palabra a buscar en la sopa de letras.
     *
     * @return {@link Boolean}	true si la palabra se encuentra
     * en la sopa de letras.
     * */
    public boolean isPresent(String word){
    	
		
		int aciertos = 0;
		int jprevio = 0;
		int kprevio = 0;
		//int jVisto = 0;
		//int kVisto = 0;
		int letraprev = 0;
		int[] ultimaVista = new int[2];
		ArrayList<Casilla> letras = new ArrayList<Casilla>(); 
		//Casilla letra = new Casilla();
		
		for (int i = 0; i < soup.length; i++) {
			for (int k = 0; k < soup.length; k++) {
				Casilla letra = new Casilla();
				if(isValid(i ,k)){
					letra.setLetra(soup[i][k]);
					if(isValid(i, k+1))
						letra.setVecinoDer(soup[i][k+1]);
					if(isValid(i, k-1))
						letra.setVecinoIzq(soup[i][k-1]);
					if(isValid(i+1, k))
						letra.setVecinoAbajo(soup[i+1][k]);
					if(isValid(i-1, k))
						letra.setVecinoArriba(soup[i-1][k]);
				}
				letras.add(letra);
			}
		}
		
	//	letras.forEach(System.out.println("Letra: " + letras.getLetra() + " Izquierda: "+ cas.getVecinoIzq() +
		//			" Derecha: "+ cas.getVecinoDer()+" Arriba: "+ cas.getVecinoArriba()+" Abajo: "+ cas.getVecinoAbajo()); 
		//);
	
		for(int j =0; j < word.length() ; j++)
    	{
			//letras.
			//letras.contains(word.charAt(j));
			for(int let = 0; let < letras.size(); let++)
			{
				//tengo que ver como hago para la seleccion, porque sigo con el problema cuando una letra
				//tieen 2 posibles soluciones, puedo itrar una vez y si falla remoevo la opcion que falla 
				//con un boolean o pasando a null la opcion
				if(word.charAt(j)==letras.get(let).getLetra())
				{
					
				}
			}
    	}
		
		return true;
		
		/*	
    	for(int i =0; i < word.length(); i++)
    	{
    		boolean  encontrada = false;
    		char letra = word.charAt(i);
    		if(!encontrada && aciertos<word.length())
    		{
    			for (int j = 0; j < soup.length; j++) {
					for (int k = 0; k < soup.length; k++) {
						if(!encontrada) {
							jprevio = j;
 							kprevio = k;
				    		letraprev = i;
				    		
							//System.out.println(soup[j][k]); 
						}

						//System.out.println(soup[j][k]); 
						if(isValid(j ,k) && !ultimaVisitada(j, k+1, ultimaVista) && soup[j][k] == letra)
						{

							//System.out.println(soup[j][k]);
							//aca puedo preguntar por un booleans para saber si ya entro ?
							//no se me ocurre que hacer 
							aciertos ++;
							encontrada = true;
							jVisto = j;
							kVisto = k;
							if(aciertos == word.length())
							{
								return true;
							}
							i++;
							boolean sigue = false;
							letra= word.charAt(i);
							
							
							
							
							if(isValid(j ,k+1) && soup[j][k+1] == letra)
							{ 
								if(!ultimaVisitada(j, k+1, ultimaVista))
								{
									jVisto = j;
									kVisto = k++;
									/*letra= word.charAt(i+1);
									System.out.println(letra);
									if(isValid(j ,k+1) && soup[j][k+2] == letra)
									{
										sigue = true;
									}*/
								}
				/*			}
							if(isValid(j ,k-1) && soup[j][k-1] == letra)
							{	
								if(!ultimaVisitada(j, k-1, ultimaVista))
								{
									jVisto = j;
									kVisto = k-1;
									k = k-2;
								}
								/*letra= word.charAt(i+1);
								System.out.println(letra);
								if(isValid(j ,k-1) && soup[j][k-1] == letra)
								{
									sigue = true;
								}*/
					/*		}
							if(isValid(j+1 ,k) && soup[j+1][k] == letra)
							{
								if(!ultimaVisitada(j, k, ultimaVista))
								{
									jVisto = j+1;
									kVisto = k;
									j++;
									//le resto poruqe cuando vuelva al for le va a sumar
									//y yo tengo que ver la letra de abajo de la encontrada
									
									k--;
								}
							}
							if(isValid(j-1 ,k) && soup[j-1][k] == letra)
							{
								if(!ultimaVisitada(j, k, ultimaVista))
								{
									jVisto = j-1;
									kVisto = k;
									j = j-1;
									k--;
								}
							}			
					}else if(encontrada) {
							ultimaVista[0] = jVisto;
							ultimaVista[1] = kVisto;
							j = jprevio;
							k = kprevio -1 ;//le resto uno
							aciertos = 0;
							i  = letraprev;
							letra= word.charAt(letraprev);
							encontrada = false;
						}
					}
				}
    		}
    		
    	}
    	if(aciertos != word.length())
    	{
    		return false;
    	}
    	return true;
    }
    */
    private boolean ultimaVisitada(int i, int k, int[] ultimasVistas) {
		
		if(ultimasVistas[0]==i && ultimasVistas[1]==k)
		{
			return true;
		}
		return false;
	}

	public Boolean isValid(int j, int k)
    {
    	if(j >= 0 && j < soup.length && k >= 0 && k < soup.length) {
    		return true;
    	}
    	return false;
    }
}
