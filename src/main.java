import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean goodMood = true;

        System.out.println("Start av mitt program");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents == 33) {
            System.out.println("Alla är  här idag:");
            if (goodMood){
                System.out.println("Alla mår bra idag");
            }
        } else if (numberOfStudents > 33) {
            System.out.println("för många i klassrummet");

        } else if (numberOfStudents < 33) {
            System.out.println("Det fattas några elever");
        }else {
            System.out.println("Något annat hände nu");
        }




    }
}