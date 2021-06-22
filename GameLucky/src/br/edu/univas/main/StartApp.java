package br.edu.univas.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.univas.read.LotoFacil;
import br.edu.univas.read.MegaSena;
import br.edu.univas.read.MothersLoteria;
import br.edu.univas.read.Quina;
import br.edu.univas.system.NumberGenerator;
import br.edu.univas.system.UserViewer;

public class StartApp {

	UserViewer show = new UserViewer();

	public static void main(String[] args) {
		StartApp manager = new StartApp();
		manager.body();
	}

	public void body() {
		Scanner scanner = new Scanner(System.in);
		MothersLoteria motherGame = new MothersLoteria();
		List<LotoFacil> lotoList = new ArrayList<>();
		List<Quina> quinaList = new ArrayList<>();
		List<MegaSena> megaList = new ArrayList<>();
		NumberGenerator random = new NumberGenerator();
		List<Integer> numberList = new ArrayList<>();
		List<String> stringNumberList = new ArrayList<>();
		readLoto(lotoList);
		readQuina(quinaList);
		readMega(megaList);
		int choose, auxOrder = 0;

		do {

			show.openMenu();
			choose = readInteger(scanner);
			if (choose == 1) {
				int aux = 0;
				for (int i = 0;; i++) {

					show.subMenu();
					choose = readInteger(scanner);

					if (choose == 1) {
						
						break;
					} else if (choose == 2) {
						
						break;
					} else if (choose == 3) {
						random.generatorBody(6, numberList, auxOrder, 60);
						auxOrder++;
						break;
					} else if (choose == 4) {
						intToString(4, numberList, stringNumberList);
						checkMega(megaList, stringNumberList, motherGame);
						break;
					} else {

					}
					aux += 1;
				}

			} else if (choose == 2) {

				int aux = 0;
				for (int i = 0;; i++) {

					show.subMenu();
					choose = readInteger(scanner);
						
					if (choose == 1) {
						
						break;
					} else if (choose == 2) {
						
						break;
					} else if (choose == 3) {
						random.generatorBody(5, numberList, auxOrder, 80);
						auxOrder++;
						break;
					} else if (choose == 4) {
						intToString(5, numberList, stringNumberList);
						checkQuina(quinaList, stringNumberList, motherGame);
						break;
					} else {

					}
					aux += 1;
				}

			} else if (choose == 3) {
				int aux = 0;
				for (int i = 0;; i++) {

					show.subMenu();
					choose = readInteger(scanner);

					if (choose == 1) {

						break;
					} else if (choose == 2) {

						break;
					} else if (choose == 3) {
						random.generatorBody(15, numberList, auxOrder, 25);
						auxOrder++;
						break;
					} else if (choose == 4) {
						intToString(11, numberList, stringNumberList);
						checkLoto(lotoList, stringNumberList, motherGame);
						break;
					} else {

					}
				}

			} else if (choose != 9 && choose > 4 && choose < 1) {
				show.wrongChoose();
			}

		} while (choose != 9);
		show.endGame();
		scanner.close();
	}

	private int readInteger(Scanner scanner) {
		int value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}

	public void readLoto(List<LotoFacil> lotoList) {
		String line = new String();
		String sting = "source\\lotofacil.csv";
		File arch = new File(sting);

		if (arch.exists()) {
			BufferedReader ArchivesBuffer;
			try {
				FileReader readderArchives = new FileReader(sting);
				ArchivesBuffer = new BufferedReader(readderArchives);
				while (true) {
					line = ArchivesBuffer.readLine();
					LotoFacil loto = new LotoFacil();
					if (line == null) {
						break;
					}
					String[] wordsLine = line.split(",");
					loto.setIdxGame(wordsLine[0]);
					loto.setDateGame(wordsLine[1]);
					for (int p = 2; p < wordsLine.length; p++) {
						loto.getNumberGame().add(wordsLine[p]);
					}
					lotoList.add(loto);
				}

			} catch (Exception e) {
				System.out.println("Erro na leitura de arquivo");
			}
		}

	}

	public void readQuina(List<Quina> quinaList) {
		String line = new String();
		String sting = "source\\quina.csv";
		File arch = new File(sting);

		if (arch.exists()) {
			BufferedReader ArchivesBuffer;
			try {
				FileReader readderArchives = new FileReader(sting);
				ArchivesBuffer = new BufferedReader(readderArchives);
				while (true) {
					line = ArchivesBuffer.readLine();
					Quina quina = new Quina();
					if (line == null) {
						break;
					}
					String[] wordsLine = line.split(",");
					quina.setIdxGame(wordsLine[0]);
					quina.setDateGame(wordsLine[1]);
					for (int p = 2; p < wordsLine.length; p++) {
						quina.getNumberGame().add(wordsLine[p]);
					}
					quinaList.add(quina);
				}

			} catch (Exception e) {
				System.out.println("Erro na leitura de arquivo");
			}
		}

	}

	public void readMega(List<MegaSena> megaList) {

		String line = new String();
		String sting = "source\\mega.csv";
		File arch = new File(sting);

		if (arch.exists()) {
			BufferedReader ArchivesBuffer;
			try {
				FileReader readderArchives = new FileReader(sting);
				ArchivesBuffer = new BufferedReader(readderArchives);
				while (true) {
					line = ArchivesBuffer.readLine();
					MegaSena mega = new MegaSena();
					if (line == null) {
						break;
					}
					String[] wordsLine = line.split(",");
					mega.setIdxGame(wordsLine[0]);
					mega.setDateGame(wordsLine[1]);
					for (int p = 2; p < wordsLine.length; p++) {
						mega.getNumberGame().add(wordsLine[p]);
					}
					megaList.add(mega);
				}

			} catch (Exception e) {
				System.out.println("Erro na leitura de arquivo");
			}
		}

	}

	private List<String> intToString(int minResquest, List<Integer> numberList, List<String> stringNumberList) {

		for (int i = 0; i < numberList.size(); i++) {
			int value = numberList.get(i);
			String sValue = String.valueOf(value);
			stringNumberList.add(sValue);
		}
		return stringNumberList;

	}

	private void checkLoto(List<LotoFacil> lotoList, List<String> stringNumberList, MothersLoteria mother) {
		int aux = 0;
		for (String valueComparate : mother.getNumberGame()) {
			for (int i = 0; i < stringNumberList.size(); i++) {
				if (lotoList.get(i).equals(valueComparate)) {
					aux++;
				}
			}
			if (aux >= 11) {
				show.findEqualGame(mother.getIdxGame(), mother.getDateGame(), aux);
			}
			aux = 0;
		}
		show.FoundntLoto();

	}

	public void checkMega(List<MegaSena> megaList, List<String> stringNumberList, MothersLoteria mother) {
		int aux = 0;
		System.out.println(mother.getNumberGame());
		for (String valueComparate : mother.getNumberGame()) {
			for (int i = 0; i < stringNumberList.size(); i++) {
				if (megaList.get(i).equals(valueComparate)) {
					aux++;
				}
			}
			if (aux >= 11) {
				show.findEqualGame(mother.getIdxGame(), mother.getDateGame(), aux);
			}
			aux = 0;
		}
		show.FoudntMega();
	}

	public void checkQuina(List<Quina> quinaList, List<String> stringNumberList, MothersLoteria mother) {
		int aux = 0;
		System.out.println(stringNumberList);
		for (String valueComparate : mother.getNumberGame()) {
			for (int i = 0; i < stringNumberList.size(); i++) {
				if (quinaList.get(i).equals(valueComparate)) {
					aux++;
				}
			}
			if (aux >= 11) {
				show.findEqualGame(mother.getIdxGame(), mother.getDateGame(), aux);
			}
			aux = 0;
		}
		show.FoudntQuina();
	}
}
