package Wrappers;

import java.util.ArrayList;
import java.util.List;

public class TestandoWrappers {

	public static void main(String[] args) {
		Integer idadeRef = 29; //autoboxing
        int primitivo = new Integer(21); //unboxing

        
        //adicionando valores em uma lista.
        List<Integer> lista = new ArrayList<>();
        lista.add(idadeRef); 
        lista.add(primitivo); 

        //atribuindo valores da lista em variáveis.
        int i1 = lista.get(0);   //tipo primitivo
        Integer i2 = lista.get(1);   //String/objeto

        System.out.println(i1);  
        System.out.println(i2); 

	}

}
