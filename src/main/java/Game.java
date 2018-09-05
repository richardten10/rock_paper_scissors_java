import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game {
    public int playerwins = 0;
    private static int playerwinsstatic;
    public int computerwins = 0;
    private static int computerwinsstatic;
    private static Integer z;

    // ts means truncated subtraction, I've used this to find difference between scores.
    public static int ts(int number, int number2) {
        if (number2 > number) {
            return 0;
        } else {
            return number - number2;
        }}

    public void trollgame (User inGameUser) {
        List<String> list1 = Arrays.asList("Rock", "Paper", "Scissors");
        List<String> rocklist = Arrays.asList("Rock");
        List<String> paperlist = Arrays.asList("Paper");
        List<String> scissorslist = Arrays.asList("Scissors");

        if (!(list1.contains(inGameUser.getCounter()))) {
            System.out.println("Try again!");
            inGameUser.amountofgames = inGameUser.amountofgames + 1;
        } else if (rocklist.contains(inGameUser.getCounter())) {
            System.out.println("Computer pick: Paper!");
            System.out.println("Computer wins the round!");
            computerwins = computerwins + 1;
        } else if (paperlist.contains(inGameUser.getCounter())) {
            System.out.println("Computer pick: Scissors!");
            System.out.println("Computer wins the round!");
            computerwins = computerwins + 1;
        } else if (scissorslist.contains(inGameUser.getCounter())) {
            System.out.println("Computer pick: Rock!");
            System.out.println("Computer wins the round!");
            computerwins = computerwins + 1;
        } else {
            System.out.println("Try again! 2");
        }
        System.out.println("Score: Player " + playerwins + " - " + computerwins + " Computer ");
        playerwinsstatic = playerwins;
        computerwinsstatic = computerwins;
    }

    public void trollgame2(User inGameUser) {
        if (playerwins > computerwins) {
            System.out.println("Well done, you won the whole game!");
        } else if (computerwins > playerwins) {
            System.out.println("Computer wins the whole game!");
        } else {
            System.out.println("The game ends in a tie.");
        }
    }
    public void playGamecomputer (User inGameUser) {
        List<String> list1 = Arrays.asList("Rock", "Paper", "Scissors");
        List<String> rocklist = Arrays.asList("Rock");
        List<String> paperlist = Arrays.asList("Paper");
        List<String> scissorslist = Arrays.asList("Scissors");
        String random = list1.get(new Random().nextInt(list1.size()));
        String random2 = list1.get(new Random().nextInt(list1.size()));
        List<String> randomlist = Arrays.asList(random);
        List<String> randomlist2 = Arrays.asList(random2);

        if (randomlist.contains(random2)) {
            System.out.println("Computer 1 picks: " + random);
            System.out.println("Computer 2 picks: " + random2);
            System.out.println("Draw! Repeating the round!");
            inGameUser.amountofgames = inGameUser.amountofgames + 1;
        } else if (rocklist.contains(random)) {
            if (scissorslist.contains(random2)) {
                System.out.println("Computer 1 picks: " + random);
                System.out.println("Computer 2 picks: " + random2);
                System.out.println("Computer 1 wins the round!");
                playerwins = playerwins + 1;
            }
            if (paperlist.contains(random2)) {
                System.out.println("Computer 1 picks: " + random);
                System.out.println("Computer 2 picks: " + random2);
                System.out.println("Computer 2 wins the round!");
                computerwins = computerwins + 1;
            }
        } else if (paperlist.contains(random)) {
            if (scissorslist.contains(random2)) {
                System.out.println("Computer 1 picks: " + random);
                System.out.println("Computer 2 picks: " + random2);
                System.out.println("Computer 2 wins the round!");
                computerwins = computerwins + 1;

            }
            if (rocklist.contains(inGameUser.getPlayer2input())) {
                System.out.println("Computer 1 picks: " + random);
                System.out.println("Computer 2 picks: " + random2);
                System.out.println("Computer wins the round!");
                playerwins = playerwins + 1;

            }
        } else if (scissorslist.contains(random)) {
            if (paperlist.contains(random2)) {
                System.out.println("Computer 1 picks: " + random);
                System.out.println("Computer 2 picks: " + random2);
                System.out.println("Computer 2 wins the round!");
                playerwins = playerwins + 1;
            }
            if (rocklist.contains(random2)) {
                System.out.println("Computer 1 picks: " + random);
                System.out.println("Computer 2 picks: " + random2);
                System.out.println("Computer 2 wins the round!");
                computerwins = computerwins + 1;

            }

        } else {
            System.out.println("Try again! 2");
        }
        playerwinsstatic = playerwins;
        computerwinsstatic = computerwins;
        System.out.println("Score: Computer 1 " + playerwins + " - " + computerwins + " Computer 2");
    }

    public void playGamecomputer2(User inGameUser) {
        if (playerwins > computerwins) {
            System.out.println("Computer 1 wins the whole game!");
        } else if (computerwins > playerwins) {
            System.out.println("Computer 2 wins the whole game!");
        } else {
            System.out.println("The game ends in a tie.");

        }
    }

    public void playGamefriend(User inGameUser) {
        List<String> list1 = Arrays.asList("Rock", "Paper", "Scissors");
        List<String> rocklist = Arrays.asList("Rock");
        List<String> paperlist = Arrays.asList("Paper");
        List<String> scissorslist = Arrays.asList("Scissors");
        List<String> player1list = Arrays.asList(inGameUser.getPlayer1input());
        List<String> player2list = Arrays.asList(inGameUser.getPlayer2input());

        if (player2list.contains(inGameUser.getPlayer1input())) {
            System.out.println("Draw! Repeating the round!");
            inGameUser.amountofgames = inGameUser.amountofgames + 1;
        } else if (!(list1.contains(inGameUser.getPlayer1input()))) {
            System.out.println("Try again!");
            inGameUser.amountofgames = inGameUser.amountofgames + 1;
        } else if (!(list1.contains(inGameUser.getPlayer2input()))) {
            System.out.println("Try again!");
            inGameUser.amountofgames = inGameUser.amountofgames + 1;
        } else if (rocklist.contains(inGameUser.getPlayer1input())) {
            if (scissorslist.contains(inGameUser.getPlayer2input())) {
                System.out.println(inGameUser.getPlayer1name() + " wins the round!");
                playerwins = playerwins + 1;
            }
            if (paperlist.contains(inGameUser.getPlayer2input())) {
                System.out.println(inGameUser.getPlayer2name()+ " wins the round!");
                computerwins = computerwins + 1;
            }
        } else if (paperlist.contains(inGameUser.getPlayer1input())) {
            if (scissorslist.contains(inGameUser.getPlayer2input())) {
                System.out.println(inGameUser.getPlayer2name() + "wins the round!");
                computerwins = computerwins + 1;

            }
            if (rocklist.contains(inGameUser.getPlayer2input())) {
                System.out.println(inGameUser.getPlayer1name() + " wins the round!");
                playerwins = playerwins + 1;

            }
        } else if (scissorslist.contains(inGameUser.getPlayer1input())) {
            if (paperlist.contains(inGameUser.getPlayer2input())) {
                System.out.println(inGameUser.getPlayer2name() + " wins the round!");
                playerwins = playerwins + 1;
            }
            if (rocklist.contains(inGameUser.getPlayer2input())) {
                System.out.println(inGameUser.getPlayer2name() + " wins the round!");
                computerwins = computerwins + 1;

            }

        } else {
            System.out.println("Try again! 2");
        }
        playerwinsstatic = playerwins;
        computerwinsstatic = computerwins;
        System.out.println("Score: " + inGameUser.getPlayer1name() + " " + playerwins + " - " + computerwins + " " + inGameUser.getPlayer2name());
    }

    public void playGamefriend2(User inGameUser) {
        if (playerwins > computerwins) {
            System.out.println("Well done " + inGameUser.getPlayer1name() + " you won the whole game!");
        } else if (computerwins > playerwins) {
            System.out.println("Well done " + inGameUser.getPlayer2name() +", you won the whole game!");
        } else {
            System.out.println("The game ends in a tie.");

        }
    }


    public void playGame(User inGameUser) {
        List<String> list1 = Arrays.asList("Rock", "Paper", "Scissors");
        List<String> rocklist = Arrays.asList("Rock");
        List<String> paperlist = Arrays.asList("Paper");
        List<String> scissorslist = Arrays.asList("Scissors");
        String random = list1.get(new Random().nextInt(list1.size()));
        List<String> randomlist = Arrays.asList(random);

        if (randomlist.contains(inGameUser.getCounter())) {
            System.out.println("Computer pick: " + random);
            System.out.println("Draw! Repeating the round!");
            inGameUser.amountofgames = inGameUser.amountofgames + 1;
        } else if (!(list1.contains(inGameUser.getCounter()))) {
            System.out.println("Try again!");
            inGameUser.amountofgames = inGameUser.amountofgames + 1;
        } else if (rocklist.contains(inGameUser.getCounter())) {
            if (scissorslist.contains(random)) {
                System.out.println("Computer pick: " + random);
                System.out.println("You win the round!");
                playerwins = playerwins + 1;
            }
            if (paperlist.contains(random)) {
                System.out.println("Computer pick: " + random);
                System.out.println("Computer wins the round!");
                computerwins = computerwins + 1;
            }
        } else if (paperlist.contains(inGameUser.getCounter())) {
            if (scissorslist.contains(random)) {
                System.out.println("Computer pick: " + random);
                System.out.println("Computer wins the round!");
                computerwins = computerwins + 1;

            }
            if (rocklist.contains(random)) {
                System.out.println("Computer pick: " + random);
                System.out.println("You win the round!");
                playerwins = playerwins + 1;

            }
        } else if (scissorslist.contains(inGameUser.getCounter())) {
            if (paperlist.contains(random)) {
                System.out.println("Computer pick: " + random);
                System.out.println("You win the round!");
                playerwins = playerwins + 1;
            }
            if (rocklist.contains(random)) {
                System.out.println("Computer pick: " + random);
                System.out.println("Computer wins the round!");
                computerwins = computerwins + 1;

            }

        } else {
            System.out.println("Try again! 2");
        }
        System.out.println("Score: Player " + playerwins + " - " + computerwins + " Computer ");
        playerwinsstatic = playerwins;
        computerwinsstatic = computerwins;
    }

    public void playGame2(User inGameUser) {
        if (playerwins > computerwins) {
            System.out.println("Well done, you won the whole game!");
        } else if (computerwins > playerwins) {
            System.out.println("Computer wins the whole game!");
        } else {
            System.out.println("The game ends in a tie.");

        }
    }

    public static void objectforgame() {
        int answer = ts(playerwinsstatic, computerwinsstatic) + ts(computerwinsstatic, playerwinsstatic);
        z = answer;
    }

    public static Integer staticdifference() {
        return z;
    }
}
