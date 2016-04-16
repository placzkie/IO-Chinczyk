package logic;

public class Round {
	private int round;
	private Player player;
	private Map map;
	private Dice dice;
	
	public Round(Player p){
		this.round = 0;
		this.player = p;
	}

	public void start(){
		System.out.println(this.player.toString());
		this.map.makeMove(1,this.dice.throwDice());
		this.round++;
	}
	public boolean isDone(){
		return this.map.isDone();
	}
	public int getRound(){
		return this.round;
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}
}
