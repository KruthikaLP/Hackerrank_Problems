import java.util.*;

// Write your Checker class here
class Checker implements Comparator<Player> {
    // Comparator method to compare Player objects
    public int compare(Player p1, Player p2) {
        // First compare based on score in descending order
        // p2.score - p1.score is used to sort the players by score in descending order.
        if (p1.score != p2.score) {
            return p2.score - p1.score;
        }
        // If scores are the same, compare based on name in lexicographical order
        return p1.name.compareTo(p2.name);
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
