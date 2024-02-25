// result 0 - lose
// result 1 - win

import java.util.Random;

public class Game {
    final int[] doors;
    int playerChoice;
    int showmanChoice;
    Random rd = new Random();

    public Game(ThreeDoors doors, int playerChoice) {
        this.doors = doors.getDoors();

        this.playerChoice = playerChoice;

        for (int i = 0; i < 3; i++) {
            if (i != playerChoice && this.doors[i] == 0) {
                this.showmanChoice = i;
                break;
            }
        }
    }

    public int checkResultWithChangingDecision(){
        if (this.doors[3-showmanChoice-playerChoice] == 1)
            return 1;
        else return 0;
    }

    public int checkResultWithSameDecision(){
        if (this.doors[playerChoice] == 1)
            return 1;
        else return 0;
    }
}

