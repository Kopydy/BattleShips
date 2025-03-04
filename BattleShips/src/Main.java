import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BoardSettings.giveAnValue();
        BoardSettings.giveAnId();
        BoardSettings.giveAnChecking();

        System.out.println("Wyznacz pole, które chcesz zająć: ");
        String userChoice = scanner.next();

        GameRulesAndFunctions.checkIfCanChange(userChoice);
        Board.boardBuilding();
        GameRulesAndFunctions.checkIfCanChange(userChoice);

        setNicks(scanner);

        Ships onePartShip = new Ships(1);
        Ships twoPartShip = new Ships(2);
        Ships threePartShip = new Ships(3);

        List<Ships> shipsAmmountPlayer1 = new ArrayList<>();
        for(int i = 0; i<3;i++){
            shipsAmmountPlayer1.add(onePartShip);
        }
        for(int i = 0;i<2;i++){
            shipsAmmountPlayer1.add(twoPartShip);
        }
        shipsAmmountPlayer1.add(threePartShip);

        List<Ships> shipsAmmountPlayer2 = new ArrayList<>();
        for(int i = 0; i<3;i++){
            shipsAmmountPlayer2.add(onePartShip);
        }
        for(int i = 0;i<2;i++){
            shipsAmmountPlayer2.add(twoPartShip);
        }
        shipsAmmountPlayer2.add(threePartShip);


            //Board.boardBuilding();



        }

    public static void setNicks(Scanner scanner) {
        System.out.println("Niech gracz nr 1 wybierze swój nick");
        String playerNameForThisFunction = scanner.next();
        Player player1 = new Player(playerNameForThisFunction, 1);
        System.out.println("Niech gracz nr 1 wybierze swój nick");
        playerNameForThisFunction = scanner.next();
        Player player2 = new Player(playerNameForThisFunction, 2);

        System.out.println(player1.playerName);
        System.out.println(player2.playerName);
    }


}