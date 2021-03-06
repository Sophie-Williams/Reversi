package GameBot.MGPlayer;

import Board.ReversiBoard;
import GameBot.GameBot;
import Board.Move;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sven Eriksson on 2016-03-25.
 */
public class MGBot extends GameBot {
    public MGBot(){
        super();
        this.setCreator("MGUser");
        this.setName("MGBot");
        this.setVersion(1);

    }
    @Override
    public void calculateNextMove(ReversiBoard reversiBoard, int colour, List<Move> allPreviousMoves) {
        this.isRunning = true;
        Move temp = new Move();
        this.setMove(temp);

        this.isRunning = false;
    }
}
