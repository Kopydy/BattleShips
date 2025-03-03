import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface GameRulesAndFunctions {
    Scanner scanner = new Scanner(System.in);
    boolean canChange = true;

    public static void changingId(String userChoice){


        int correctValue = 0;

        if(userChoice.equals("0") || userChoice.equals("1") || userChoice.equals("2") || userChoice.equals("3") || userChoice.equals("4") || userChoice.equals("5") || userChoice.equals("6") ||userChoice.equals("7") || userChoice.equals("8") ||userChoice.equals("9") ||userChoice.equals("10") ||userChoice.equals("20") || userChoice.equals("30") || userChoice.equals("40") || userChoice.equals("50") || userChoice.equals("60") ||userChoice.equals("70") ||userChoice.equals("80") || userChoice.equals("90")){
            System.out.println("Nieprawidłowa wartość");
        }else{
            correctValue = Integer.parseInt(userChoice);
            BoardSettings.placeId[correctValue] = "X";
        }
    }


    public static boolean checkIfCanChange(String userChoice){

    }

}
