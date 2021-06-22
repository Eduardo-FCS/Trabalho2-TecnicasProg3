package br.edu.univas.system;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;


public class NumberGenerator {
	
	/* Fun��o generatorBody � para chamar todas as fun��es da Classe NumberGenerator
	 * A fun��o generateRandomList � para gerar n�meros rand�micos e adicion�-los em Lista
	 * A fun��o orderList � para ordenar e formatar os mesmos para que sejam veross�meis com os do arquivo CSV
	 */
	
	public List<Integer> generatorBody(int sizeGame, List<Integer> numberList, int auxOrder, int max) {
		
		// A vari�vel auxOrder verifica se a lista j� possui um jogo e limpa os elementos, caso haja.
		if(auxOrder > 0) {
			numberList.clear();
		}
		
		Random random = new Random();
		TreeSet<Integer> MyNumbers = new TreeSet ();
		generateRandomList(MyNumbers, random, numberList, sizeGame, max);
		System.out.println(numberList);
		return numberList;
		
	}
	
	private void generateRandomList(TreeSet MyNumbers, Random random, List<Integer> numberList, int sizeGame, int max) {
		int randomNumber = 0;
		for(int i = 0; i < sizeGame;i++) {
			randomNumber = random.nextInt((max - 1) + 1) + 1;
			
			/* Este looping utiliza uma �rvore do Java para fazer uma compara��o... 
			 * Essa compara��o verifica se esse n�mero gerado rand�micamente j� foi gerado anteriormente, e se negativo, ele pausa o looping...
			 * E adiciona no List de Integer. Caso contr�rio, segue o looping */
			
			for(;;) {
				if (MyNumbers.add(randomNumber)) break;
					randomNumber = random.nextInt((25 - 1) + 1) + 1;
			}
			numberList.add(randomNumber);
		}
		orderList(numberList);
	}
	
	private void orderList(List<Integer> numberList) {
		Collections.sort(numberList);	
	}

}
