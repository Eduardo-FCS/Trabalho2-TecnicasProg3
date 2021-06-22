package br.edu.univas.system;

public class UserViewer {
	
	public void openMenu() {
		System.out.println("1. Mega-Sena \n2. Quina \n3. Lotofácil \n9. Sair");
	}
	
	public void subMenu() {
		System.out.println("1. 5 números que mais saíram \n2. 5 números que menos saíram \n3. Gerar números randômicos \n4. Verificar meu jogo");
	}
	public void wrongChoose() {
		System.out.println("Selecione uma opção válida para o jogo! \n");
	}
	
	public void endGame() {
		System.out.println("Obrigado pelo meu bom uso. Volte sempre!");
	}
	
	public void findEqualGame(String idGame, String dateGame, int counter) {
		System.out.println("Você teria acertado pelo jogo " + idGame + " com " + counter + " acertos na data de " + dateGame);
	}
	
	public void FoudntQuina() {
		System.out.println("Não foi encontrado nenhum jogo cujos números ganhariam uma Quina!");
	}
	
	public void FoudntMega() {
		System.out.println("Não foi encontrado nenhum jogo cujos números ganhariam uma Mega!");
	}
	
	public void FoundntLoto() {
		System.out.println("Não foi encontrado nenhum jogo cujos números ganhariam uma LotoFácil!");
	}

}