import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad vill du göra?");
        System.out.println("1. Gå hem?");
        System.out.println("2. Stanna i skolan?");

        int choise = scanner.nextInt();

        switch (choise){
            case 1:
                System.out.println("Du går hem");
                break;
            case 2:
                System.out.println("Snyggt, du stannar kvar i skolan");
                break;
            case 3:
                System.out.println("Du klickade på 3");
                break;
            default:
                System.out.println("Inget godkännt val");
        }
    }
}
