import java.util.Scanner;

public class User {
    public int amountofgames;
    private String pick;
    private Boolean friend;
    private String  player1input;
    private String player2input;
    private String  player1name;
    private String player2name;
    private Boolean playornot;
    private String nextgame;
    private Boolean trollornot;

    Scanner user_input = new Scanner(System.in);

    public void setPlayer1input (String message) {
        System.out.println(message);
        this.player1input = user_input.next();
    }

    public void setPlayer2input (String message) {
        System.out.println(message);
        this.player2input = user_input.next();
    }

    public void setPlayer1name (String message) {
        System.out.println(message);
        this.player1name = user_input.next();
    }
    public void setPlayer2name (String message) {
        System.out.println(message);
        this.player2name = user_input.next();
    }

    public void setAmountofgames(String message){
        System.out.println(message);
        this.amountofgames= user_input.nextInt();
    }

    public void setPick(String message){
        System.out.println(message);
        this.pick = user_input.next();
    }

    public void setFriend (String  message) {
        System.out.println(message);
        this.friend = user_input.nextBoolean();
    }

    public void setPlayornot (String  message) {
        System.out.println(message);
        this.playornot = user_input.nextBoolean();
    }

    public void setNextgame () {
        this.player1input = user_input.next();
    }

    public void setTrollornot (String  message) {
        System.out.println(message);
        this.trollornot = user_input.nextBoolean();
    }

    public Boolean getFriend () {return  friend;}

    public Integer getAmount (){
        return amountofgames;
    }

    public String getCounter (){
        return pick;
    }

    public String getPlayer1input (){
        return player1input;
    }

    public String getPlayer2input (){ return player2input; }

    public String getPlayer1name (){ return player1name; }

    public String getPlayer2name (){ return player2name; }

    public Boolean getPlayornot (){ return playornot; }

    public String getNextgame (){ return nextgame; }

    public Boolean getTrollornot () {return  trollornot;}
}

