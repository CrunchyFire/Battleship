import java.util.Scanner;
public class Battleshipmain {
    private int longShips;
    private int smallShips;
    public Battleshipmain(){
        longShips=3;
        smallShips=2;
    }
    public Battleshipmain(int lShips, int sShips){
        longShips=3;
        smallShips=2;
    }
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        Battleshipmain player = new Battleshipmain();
        System.out.println("Welcome to battleship");
        for (int i=0; i<=player.longShips+player.smallShips;)
        System.out.println("Would you like to place a long ship or short ship");
        String choice=e.nextLine();
        if (choice=="longship"){
            player.longShipsMethod(player.longShips);

        }
    }
}
