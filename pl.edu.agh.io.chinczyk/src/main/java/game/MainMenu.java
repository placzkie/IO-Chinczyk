package game;

public class MainMenu {
	// TODO
	
	public MainMenu(){
		int numberOfPlayers = initMenu();
		createGame(numberOfPlayers);
	}
	
	private int initMenu(){
		System.out.println("Menu:");
		return 2;
	}
	
	private void createGame(int numberOfPlayers){
		new Game(numberOfPlayers);
	}
}
