import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class Dice {
    public static int lastroll = 0;
    static int dice_size = 6;
    static int roll_amount = 100;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dice size, default is 6:");
        String myDiceSize = scanner.next();
        if (!Objects.equals(myDiceSize, "default")) {
            setDice_size(Integer.parseInt(myDiceSize));
        }
        System.out.println("Enter the amount of rolls, default is 100:");
        String myRoll_amount = scanner.next();
        if(!Objects.equals(myRoll_amount,"default")){
            setRoll_amount(Integer.parseInt(myRoll_amount));
        }
        new game(5);
        System.out.println(Arrays.toString(rollDice(roll_amount)));
        System.out.println(getLastroll());


    }
    public static int[] rollDice(int times){
        int[] roll =  new int[times];
        int[] rollcount = new int[dice_size];
        for (int i = 0; i<times; i++) {
            int diceroll = (int) Math.round(Math.random() * (dice_size-1) + 1);
            roll[i] = diceroll;
            rollcount[diceroll-1]++;
            lastroll = diceroll;
        }
        System.out.println(Arrays.toString(rollcount));
        return roll;
    }
    public static int getLastroll(){
        return lastroll;
    }
    public static void setDice_size(int size) {
        dice_size = size;
    }
    public static void setRoll_amount(int amount){
        roll_amount = amount;
    }
}
