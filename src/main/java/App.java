import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
import org.openqa.selenium.*;

import static javax.xml.bind.DatatypeConverter.parseString;

public class App {
    public static void main(String args[]) {
        User player = new User();
        Game firstGame = new Game();
        //int chosenincrement;
        player.setPlayornot("You want to play. True or false?");
        if (!player.getPlayornot()) {
            player.setAmountofgames("The computer will play itself. How many rounds should it play?");
            // System.out.println("After every round write anything to move on to the next one!");
            for (int i = 1; i <= player.getAmount(); i++) {
                firstGame.playGamecomputer(player);
                //player.setNextgame(); // This was going to be to have a user input start the next round
                Game.objectforgame();
                Integer difference = Game.staticdifference();//Retrieve the name
                if(difference>(player.getAmount()-i)) {
                    if (player.getAmount()-i==0) {
                        System.out.println("Amount of rounds left: " + (player.getAmount() - i));
                    }
                    else {
                        System.out.println("Amount of rounds left: " + (player.getAmount() - i));
                        System.out.println("No point! The game is already won!");
                        i = player.getAmount();
                    }
                }
                else {
                    System.out.println("Amount of rounds left: " + (player.getAmount() - i));
                }}
            firstGame.playGamecomputer2(player);
        }
        else {
            player.setFriend("You have a friend to play with. True or false?");
            if (player.getFriend()) {
                player.setPlayer1name("What should I call player 1?");
                player.setPlayer2name("What should I call player 2?");
                player.setAmountofgames("How many rounds do you want to play?");
                for (int i = 1; i <= player.getAmount(); i++) {
                    player.setPlayer1input(player.getPlayer1name()+": Write Rock, Paper, or Scissors!");
                    player.setPlayer2input(player.getPlayer2name()+": Write Rock, Paper, or Scissors!");
                    firstGame.playGamefriend(player);
                    Game.objectforgame();
                    Integer difference = Game.staticdifference();//Retrieve the name
                    if(difference>(player.getAmount()-i)) {
                        if (player.getAmount()-i==0) {
                            System.out.println("Amount of rounds left: " + (player.getAmount() - i));
                        }
                        else {
                            System.out.println("Amount of rounds left: " + (player.getAmount() - i));
                            System.out.println("No point! The game is already won!");
                            i = player.getAmount();
                        }
                    }
                    else {
                        System.out.println("Amount of rounds left: " + (player.getAmount() - i));
                    }}
                firstGame.playGamefriend2(player);
            } else {
                player.setTrollornot("You want a challenge. True or false?");
                if (player.getTrollornot()) {
                    player.setAmountofgames("You can play the cheating computer. How many rounds do you want to play?");
                    for (int i = 1; i <= player.getAmount(); i++) {
                        player.setPick("Write Rock, Paper, or Scissors!");
                        firstGame.trollgame(player);
                        Game.objectforgame();
                        Integer difference = Game.staticdifference();//Retrieve the name
                        if (difference > (player.getAmount() - i)) {
                            if (player.getAmount()-i ==0) {
                                System.out.println("Amount of rounds left: " + (player.getAmount() - i));
                            }
                            else {
                                System.out.println("Amount of rounds left: " + (player.getAmount() - i));
                                System.out.println("No point! The game is already won!");
                                i = player.getAmount();
                            }
                        } else {
                            System.out.println("Amount of rounds left: " + (player.getAmount() - i));
                        }
                    }

                    firstGame.trollgame2(player);
                }
                else {
                    player.setAmountofgames("You can play the computer. How many rounds do you want to play?");
                    for (int i = 1; i <= player.getAmount(); i++) {
                        player.setPick("Write Rock, Paper, or Scissors!");
                        firstGame.playGame(player);
                        Game.objectforgame();
                        Integer difference = Game.staticdifference();//Retrieve the name
                        if (difference > (player.getAmount() - i)) {
                            if (player.getAmount()-i ==0) {
                                System.out.println("Amount of rounds left: " + (player.getAmount() - i));
                            }
                            else {
                                System.out.println("Amount of rounds left: " + (player.getAmount() - i));
                                System.out.println("No point! The game is already won!");
                                i = player.getAmount();
                            }
                        } else {
                            System.out.println("Amount of rounds left: " + (player.getAmount() - i));
                        }
                    }

                    firstGame.playGame2(player);
                }
            }
        }}}
