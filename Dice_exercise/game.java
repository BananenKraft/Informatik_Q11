import java.util.Arrays;

public class game {
    private int amount_of_games;
    public game(int amount_of_games) {
        this.amount_of_games = amount_of_games;
        Dice[] dice = new Dice[amount_of_games];
        for (int i=0;i<amount_of_games;i++){
            dice[i] = new Dice();
        }
        System.out.println(Arrays.toString(dice));
    }
}
