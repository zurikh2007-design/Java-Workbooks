package com.pluralsight;

public class MainRandom {

    public static void main(String[] args) {
    rollTheDice dice = new rollTheDice();
    int twoCounter = 0;
    int fourCounter = 0;
    int sixCounter = 0;
    int sevenCounter = 0;

        if (twoCounter == 2){
            twoCounter += 1;
        }
        if (fourCounter == 4){
            fourCounter += 1;
        }
        if (sixCounter == 6){
            sixCounter += 1;
        }
        if (sevenCounter == 7){
            sevenCounter += 1;
        }

    for (int i = 0; i < 100; i++) {

            int roll1 = dice.roll();
            int roll2 = dice.roll();

            int sum = roll1 + roll2;

            System.out.println(
                    "Roll " + roll1 + " - " + roll2 + " Sum: " + sum
            );
        }


    }

    

}
