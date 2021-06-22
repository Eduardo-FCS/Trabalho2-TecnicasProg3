package br.edu.univas.system;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;


public class NumberGenerator {
	
	/* Função generatorBody é para chamar todas as funções da Classe NumberGenerator
	 * A função generateRandomList é para gerar números randômicos e adicioná-los em Lista
	 * A função orderList é para ordenar e formatar os mesmos para que sejam verossímeis com os do arquivo CSV
	 */
	
	public List<Integer> generatorBody(int sizeGame, List<Integer> numberList, int auxOrder, int max) {
		
		// A variável auxOrder verifica se a lista já possui um jogo e limpa os elementos, caso haja.
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
			
			/* Este looping utiliza uma árvore do Java para fazer uma comparação... 
			 * Essa comparação verifica se esse número gerado randômicamente já foi gerado anteriormente, e se negativo, ele pausa o looping...
			 * E adiciona no List de Integer. Caso contrário, segue o looping */
			
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
