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
		 * 	PERGUNTA PARA O USUÁRIO O TAMANHO QUE O VETOR TERÁ;
		 */
		try {
			System.out.print("Informe o tamanho do array: ");
			arraySize = scanner.nextInt();
		} catch(InputMismatchException error) {
			System.out.println("Você não informou um número válido");
		}
	   
		System.out.println("");
	    
		/**
		 *  ESTRUTURA DE REPETIÇÃO PARA POPULAR OS ÍNDICES DO VETOR, PERGUNTANDO PARA O
		 *  	USUÁRIO UM VALOR PARA CADA POSIÇÃO; 
		 */
	    for (int i = 0; i < arraySize; i++) {
	    	try {
	    		System.out.print("Informe o " + (i+1) + "º número: ");
	    		numbers.add(scanner.nextInt());	  
	    	} catch(InputMismatchException error) {
	    		System.out.println("Você não informou um número válido");
	    	}
	    }
	    
	    System.out.println("");
	    System.out.println("ARRAY INFORMADO: " + numbers);
	    System.out.println("");
	    
	    /**
	     * 	ESTRUTURA QUE PERCORRE O ARRAY DE NÚMEROS;
	     */
	    for (int i = 0; i < numbers.size(); i++) {
	    	int sumLeft = 0;
	    	int sumRight = 0;
	    	
	    	/**
	    	 * 	SOMANDO OS NÚMEROS LOCALIZADOS ATRÁS DO ÍNDICE ATUAL;
	    	 */
	    	if (i == 0) {
	    		sumLeft = 0;
	    	} else if (i != 0) {
	    		for (int j = 0; j < i; j++) {
	    			sumLeft += numbers.get(j);
	    		}
	    	}
	    	
	    	/**
	    	 * 	SOMANDO OSNÚMEROS LOCALIZADOS A FRENTE DO ÍNDICE ATUAL;
	    	 */
	    	if (i == (numbers.size() - 1)) {
	    		sumRight = 0;
	    	} else if (i < (numbers.size() - 1)) {
	    		for (int k = i + 1; k < numbers.size(); k++) {
	    			sumRight += numbers.get(k);
	    		}
	    	}
	    	
	    	/**
	    	 * 	ADICIONANDO OS VALORES EM UM ARRAY COM 4 CASAS PARA CADA ÍNDICE (CASO 
	    	 * 		TENHA 2 ÍNDICES, O ARRAY TERA 8 CASAS);
	    	 */
	    	if (sumLeft == sumRight) {
	    		repetitions.add(i);
	    		repetitions.add(numbers.get(i));
	    		repetitions.add(sumLeft);
	    		repetitions.add(sumRight);
	    	}   	
	    }
	    
	    /**
	     * 	VERIFICAÇÃO QUE SEMPRE PEGARÁ O MENOR ÍNDICE (4 PRIMEIRAS CASAS DO ARRAY) 
	     * 		CASO TENHA MAIS DE UM E RETORNARÁ -1 CASO NÃO TENHA NENHUM;
	     */
	    if (repetitions.size() != 0) {
	    	System.out.println("SAÍDA: O índice " + repetitions.get(0) 
	    		+ " contém o valor " + repetitions.get(1) + ", sendo a soma da esquerda igual a " 
	    		+ repetitions.get(2) + " e a soma da direita igual a " + repetitions.get(3) + ".");
	    } else {
	    	System.out.println("SAÍDA: -1 (Nenhum índice está dentro das regras)");
	    }
	}
}
