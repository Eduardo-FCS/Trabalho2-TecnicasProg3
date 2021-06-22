package br.edu.univas.system;

public class UserViewer {
	
	public void openMenu() {
		System.out.println("1. Mega-Sena \n2. Quina \n3. Lotof�cil \n9. Sair");
	}
	
	public void subMenu() {
		System.out.println("1. 5 n�meros que mais sa�ram \n2. 5 n�meros que menos sa�ram \n3. Gerar n�meros rand�micos \n4. Verificar meu jogo");
	}
	public void wrongChoose() {
		System.out.println("Selecione uma op��o v�lida para o jogo! \n");
	}
	
	public void endGame() {
		System.out.println("Obrigado pelo meu bom uso. Volte sempre!");
	}
	
	public void findEqualGame(String idGame, String dateGame, int counter) {
		System.out.println("Voc� teria acertado pelo jogo " + idGame + " com " + counter + " acertos na data de " + dateGame);
	}
	
	public void FoudntQuina() {
		System.out.println("N�o foi encontrado nenhum jogo cujos n�meros ganhariam uma Quina!");
	}
	
	public void FoudntMega() {
		System.out.println("N�o foi encontrado nenhum jogo cujos n�meros ganhariam uma Mega!");
	}
	
	public void FoundntLoto() {
		System.out.println("N�o foi encontrado nenhum jogo cujos n�meros ganhariam uma LotoF�cil!");
	}

}