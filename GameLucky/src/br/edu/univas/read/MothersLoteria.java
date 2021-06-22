package br.edu.univas.read;

import java.util.ArrayList;
import java.util.List;

public class MothersLoteria {

	private String idxGame;
	private String dateGame;
	private List<String> numberGame = new ArrayList<>();
	
	public String getIdxGame() {
		return idxGame;
	}
	public void setIdxGame(String idxGame) {
		this.idxGame = idxGame;
	}
	public String getDateGame() {
		return dateGame;
	}
	public void setDateGame(String dateGame) {
		this.dateGame = dateGame;
	}
	public List<String> getNumberGame() {
		return numberGame;
	}
	public void setNumberGame(List<String> numberGame) {
		this.numberGame = numberGame;
	}
	
	

}
