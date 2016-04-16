package pl.edu.agh.io.chinczyk.logic;

import java.util.ArrayList;

public class Round {
	private int id;
	private int numberOfPlayers;
	private ArrayList<Player> players;
	
	public Round(int number){
		this.id = 0;
		this.numberOfPlayers = number;
		if(!init()) System.out.println("Round init failed!");
	}
	
	private boolean init(){
		this.players =  new ArrayList<Player>();
		for(int i=0; i<this.numberOfPlayers; i++){
			this.players.add(new Player(i));
		}
		return true;
	}
	public void start(){
		boolean more = true;
		int id = 0;
		while(more){
			System.out.println("Player"+id);
			this.players.get(id).makeMove(1,1);
			more = !this.players.get(id).isDone();
			id++;
			if(id==this.numberOfPlayers-1) id=0;
		}
	}
}
