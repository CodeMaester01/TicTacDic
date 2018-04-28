package Tic.game;

public class TurnHandler {
	
	private State playerTurn;
	
	public TurnHandler(State startTurn) {
		if(startTurn == State.BLANK) {
			System.out.println("TurnHandler Error");
		}
		playerTurn = startTurn;
	}
	public TurnHandler() {
		playerTurn = State.X;
	}
	public State getPlayerTurn() {
		return playerTurn;
	}
	public void changeTurn() {
		switch(playerTurn) {
		case X:
			playerTurn = State.O;break;
		case O:
			playerTurn = State.X;break;
		}
	}
	
	
}
