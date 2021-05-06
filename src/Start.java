import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    ArrayList<Integer> repetitions = new ArrayList<Integer>();
		int arraySize = 0;
		
		/**
		 * 	PERGUNTA PARA O USU�RIO O TAMANHO QUE O VETOR TER�;
		 */
		try {
			System.out.print("Informe o tamanho do array: ");
			arraySize = scanner.nextInt();
		} catch(InputMismatchException error) {
			System.out.println("Voc� n�o informou um n�mero v�lido");
		}
	   
		System.out.println("");
	    
		/**
		 *  ESTRUTURA DE REPETI��O PARA POPULAR OS �NDICES DO VETOR, PERGUNTANDO PARA O
		 *  	USU�RIO UM VALOR PARA CADA POSI��O; 
		 */
	    for (int i = 0; i < arraySize; i++) {
	    	try {
	    		System.out.print("Informe o " + (i+1) + "� n�mero: ");
	    		numbers.add(scanner.nextInt());	  
	    	} catch(InputMismatchException error) {
	    		System.out.println("Voc� n�o informou um n�mero v�lido");
	    	}
	    }
	    
	    System.out.println("");
	    System.out.println("ARRAY INFORMADO: " + numbers);
	    System.out.println("");
	    
	    /**
	     * 	ESTRUTURA QUE PERCORRE O ARRAY DE N�MEROS;
	     */
	    for (int i = 0; i < numbers.size(); i++) {
	    	int sumLeft = 0;
	    	int sumRight = 0;
	    	
	    	/**
	    	 * 	SOMANDO OS N�MEROS LOCALIZADOS ATR�S DO �NDICE ATUAL;
	    	 */
	    	if (i == 0) {
	    		sumLeft = 0;
	    	} else if (i != 0) {
	    		for (int j = 0; j < i; j++) {
	    			sumLeft += numbers.get(j);
	    		}
	    	}
	    	
	    	/**
	    	 * 	SOMANDO OSN�MEROS LOCALIZADOS A FRENTE DO �NDICE ATUAL;
	    	 */
	    	if (i == (numbers.size() - 1)) {
	    		sumRight = 0;
	    	} else if (i < (numbers.size() - 1)) {
	    		for (int k = i + 1; k < numbers.size(); k++) {
	    			sumRight += numbers.get(k);
	    		}
	    	}
	    	
	    	/**
	    	 * 	ADICIONANDO OS VALORES EM UM ARRAY COM 4 CASAS PARA CADA �NDICE (CASO 
	    	 * 		TENHA 2 �NDICES, O ARRAY TERA 8 CASAS);
	    	 */
	    	if (sumLeft == sumRight) {
	    		repetitions.add(i);
	    		repetitions.add(numbers.get(i));
	    		repetitions.add(sumLeft);
	    		repetitions.add(sumRight);
	    	}   	
	    }
	    
	    /**
	     * 	VERIFICA��O QUE SEMPRE PEGAR� O MENOR �NDICE (4 PRIMEIRAS CASAS DO ARRAY) 
	     * 		CASO TENHA MAIS DE UM E RETORNAR� -1 CASO N�O TENHA NENHUM;
	     */
	    if (repetitions.size() != 0) {
	    	System.out.println("SA�DA: O �ndice " + repetitions.get(0) 
	    		+ " cont�m o valor " + repetitions.get(1) + ", sendo a soma da esquerda igual a " 
	    		+ repetitions.get(2) + " e a soma da direita igual a " + repetitions.get(3) + ".");
	    } else {
	    	System.out.println("SA�DA: -1 (Nenhum �ndice est� dentro das regras)");
	    }
	}
}
