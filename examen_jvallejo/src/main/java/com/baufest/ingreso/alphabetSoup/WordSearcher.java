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
						}
						if(soup[j][k] == letra)
						{
							encontrada = true;
							aciertos ++;
							i++;
							boolean sigue = false;
							letra= word.charAt(i);
							
							
							if(soup[j][k+1] == letra)
							{ 
								k++;
								sigue = true;
							}
							if(soup[j][k-1] == letra)
							{
								k = k-1;
								sigue = true;
							}
							if(soup[j+1][k] == letra)
							{
								j++;
								sigue = true;
							}
							if(soup[j-1][k] == letra)
							{
								j = j-1;
								sigue = true;
							}
							if(!sigue)
							{
								encontrada = false;
								aciertos = 0;
								i--;
								letra= word.charAt(i);
							}				
						}else if(encontrada) {
							j = jprevio;
							k = kprevio;
							i--;
							letra= word.charAt(i);
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
}
