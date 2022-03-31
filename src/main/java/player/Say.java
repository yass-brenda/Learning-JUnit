package player;

import java.util.Random;

public class Say {
    private int sides;

    public Say(int sides) {
        this.sides = sides;
    }

    public int roll(){
        return new Random().nextInt(sides + 1);
    }
}
