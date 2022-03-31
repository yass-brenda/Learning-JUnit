package player;

public class Player {
    private  Say say;
    private int minNumberToWin;

    public Player(Say say, int minNumberToWin) {
        this.say = say;
        this.minNumberToWin = minNumberToWin;
    }

    public boolean play(){
        int sayNumber = say.roll();
        return sayNumber > minNumberToWin;
    }

}
