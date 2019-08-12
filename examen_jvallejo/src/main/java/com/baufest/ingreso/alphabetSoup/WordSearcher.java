package com.baufest.ingreso.alphabetSoup;

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
		int jVisto = 0;
		int kVisto = 0;
		int letraprev = 0;
		int[] ultimaVista = new int[2];
		
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
							}
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
							}
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
    
    private boolean ultimaVisitada(int j, int k, int[] ultimasVistas) {
		
		if(ultimasVistas[0]==j && ultimasVistas[1]==k)
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
