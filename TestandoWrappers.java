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

        
        Integer valorRef = Integer.valueOf(34); //método para atribuir o valor a referencia do tipo Integer 
        int valorPrimitivo = valorRef.intValue();
        
        
        System.out.println(i1);  
        System.out.println(i2); 
        System.out.println(valorPrimitivo);//Imprime 34.
        
        System.out.println(Integer.MAX_VALUE); // valor máximo de um Integer
        System.out.println(Integer.MIN_VALUE); //valor mínimo de um Integer

        System.out.println(Integer.SIZE); // 32 bits
        System.out.println(Integer.BYTES); //4 Bytes
        
	}

}
