package com.baufest.ingreso.strings;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map.Entry;

public class RepeatedCharacters {

    /**
     * El metodo debe retornar un booleano indicando si el parametro `cadena` cumple con alguna de las siguientes propiedades:
     * 1- Todos los caracteres aparecen la misma cantidad de veces.
     *     Ejemplos: "aabbcc", "abcdef", "aaaaaa"
     * 2- Todos los caracteres aparecen la misma cantidad de veces, a excepcion de 1, que aparece un vez mas o una vez menos.
     *     Ejemplos: "aabbccc", "aabbc", "aaaaccccc"
     * @param cadena la cadena a evaluar
     * @return booleano indicando si la cadena cumple con las propiedades
     */
    public Boolean isValid(String cadena) {

    	HashMap<String, Integer> caracteres = new HashMap<String, Integer>();
    	int max = 0;

    	for(int i =0; i < cadena.length(); i++)
    	{
    		//convierto el char a string
    		String car= Character.toString(cadena.charAt(i));
    		
    		if(!caracteres.containsKey(car))
    		{
        		caracteres.put(car, 1);
    		}else {
    			int val = caracteres.get(car) + 1;
    			caracteres.put(car, val);
    		}
    	}
    	//le asigno al valor minimo el largo de la cadena, para asegurarme que inicie
    	//con un valor mas grande a la cantidad de caracteres repetidos minimo
    	int min = cadena.length();
    	for(Entry<String, Integer> letra : caracteres.entrySet()) {
    		if(letra.getValue() > max)
    			max = letra.getValue();	
    		if(letra.getValue() < min)
    			min = letra.getValue();
    	}
    	if(min == max || min - max == -1 || min - max == 1)
    		return true;
    	  
    	return false;
    	
    }

}
