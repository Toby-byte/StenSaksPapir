import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {

    public static int Randomizer(int minNumber, int maxNumber) {
        Random random = new Random();
        int randomizer = random.nextInt(maxNumber-minNumber)+minNumber;
        return randomizer;
    }

    public static boolean stenSaksPapir(String player1, String player2) {
        // har vi et statement som der afgør om player 1 eller player 2 vinder
        if (player1.equals("sten") && player2.equals("saks")) {
                System.out.println("player 1 vinder");
                return true;
            }
            else if (player1.equals("papir") && player2.equals("sten")) {
                System.out.println("player 1 vinder");
                return true;
            }
            else if (player1.equals("saks") && player2.equals("papir")) {
                System.out.println("player 1 vinder");
                return true;
            }
            else if (player1.equals("saks") && player2.equals("sten")) {
                System.out.println("player 2 vinder");
                return true;
            }
            else if (player1.equals("sten") && player2.equals("papir")) {
                System.out.println("player 2 vinder");
                return true;
            }
            else if (player1.equals("papir") && player2.equals("saks")) {
                System.out.println("player 2 vinder");
                return true;
            // hvis ingen vinder vil vi, få en value der hedder false
            }else if (player1.equals(player2)) {
                System.out.println("uafgjort");
                return false;
            }

        return true;
    }

    public static boolean stenSaksPapirComputer(String player1) {
        // har vi et statement som der afgør om player 1 eller computer vinder
        int intplayer2 = Randomizer(1,3);
        String player2 = "";
        // Her er et if statement som der afgør computerens valg af sten, saks eller papir
        if (intplayer2 == 1) {
            player2 = "papir";
        } else if (intplayer2 == 2) {
            player2 = "sten";
        } else if (intplayer2 == 3) {
            player2 = "saks";
        }

        if (player1.equals("sten") && Objects.equals(player2, "saks")) {
            System.out.println("player 1 vinder");
            return true;
        }
        else if (player1.equals("papir") && Objects.equals(player2, "sten")) {
            System.out.println("player 1 vinder");
            return true;
        }
        else if (player1.equals("saks") && Objects.equals(player2, "papir")) {
            System.out.println("player 1 vinder");
            return true;
        }
        else if (player1.equals("saks") && Objects.equals(player2, "sten")) {
            System.out.println("Computer vinder, den slog sten");
            return true;
        }
        else if (player1.equals("sten") && Objects.equals(player2, "papir")) {
            System.out.println("Computer vinder, den slog papir");
            return true;
        }
        else if (player1.equals("papir") && Objects.equals(player2, "saks")) {
            System.out.println("Computer vinder, den slog saks");
            return true;
            // hvis ingen vinder vil vi, få en value der hedder false
        }else if (player1.equals(player2)) {
            System.out.println("uafgjort");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hejsa, har du lyst til at spille mod computeren eller mod en anden spiller?");
        System.out.println("1 for player, 2 for computer");

        String playerChoice = scanner.nextLine();

        if (Objects.equals(playerChoice, "1")) {

            // siden ingen har vundet til at starte med setter vi winner found til false
            boolean winnerfound = false;
            // så længe winnerfound er sat til false vil køre loopet.
            // Så hvis det bliver uafgjort starter vi forfra
            while (winnerfound == false) {
                System.out.println("player 1, vælg sten, saks eller papir");
                String player1 = scanner.nextLine();
                System.out.println("player 2, vælg sten, saks eller papir");
                String player2 = scanner.nextLine();
                winnerfound = stenSaksPapir(player1,player2);
            }

        } else if (Objects.equals(playerChoice, "2")) {
            // siden ingen har vundet til at starte med setter vi winner found til false
            boolean winnerfound = false;
            // så længe winnerfound er sat til false vil køre loopet.
            // Så hvis det bliver uafgjort starter vi forfra
            while (winnerfound == false) {
                System.out.println("player 1, vælg sten, saks eller papir");
                String player1 = scanner.nextLine();
                winnerfound = stenSaksPapirComputer(player1);
            }
        }




    }
}
