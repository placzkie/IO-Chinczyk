package game;

import java.util.ArrayList;

import logic.Dice;
import logic.Player;
import logic.Round;

public class Game {
	private ArrayList<Player> players;
	private ArrayList<Round> rounds;
	private Dice dice;
	
	public Game(int i) {
		this.dice = new Dice();
		init(i);
	}
	
	private void init(int number){
		this.players =  new ArrayList<Player>();
		for(int i=0; i<number; i++){
			this.players.add(new Player(i));
		}
		this.rounds =  new ArrayList<Round>();
		for(int i=0; i<number; i++){
			Round temp = new Round(this.players.get(i));
			temp.setDice(this.dice);
			this.rounds.add(temp);
		}
		start();
	}
	private void start(){
		boolean more = true;
		int idPlayer = 0;
		Round temp = null;
		while(more){
			temp = this.rounds.get(idPlayer);
			temp.start();
			more = !temp.isDone();
			if(idPlayer==this.rounds.size()) idPlayer=0;
			else idPlayer++;
		}
	}
}
