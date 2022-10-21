import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        chat();
    }

    public static void chat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir la largeur");
        int largeur = scanner.nextInt();
        String front = "-";
        String yeux = "0";
        String entreyeux = "";
        String menton = "";
        String blanc = "";
        String og = "|\\";
        String od = "/|";
        String mg = "\\_";
        String md = "_/";
        for (int i = 0; i < largeur-5; i++) {
            front = front + "-";
        }
        for (int i = 0; i < largeur-6; i++) {
            entreyeux = entreyeux + "_";
            menton = menton +"^";
        }
        for (int i = 0; i < largeur-2; i++) {
            blanc = blanc + " ";
        }
        String haut = og+front+od;
        String ligne = "|"+" "+yeux+entreyeux+yeux+" "+"|";
        String bas = " "+mg+menton+md+" ";

        System.out.println(haut);
        if (largeur % 2 !=0 && largeur >7){
            for (int i =1; i<(largeur-4)/2; i++){
                System.out.println("|"+blanc+"|");
            }
        }
        System.out.println(ligne);

        if (largeur % 2 !=0 && largeur >7){
            for (int i =1; i<(largeur-4)/2; i++){
                System.out.println("|"+blanc+"|");
            }
        }
        System.out.println(bas);
        System.out.println(blanc);
    }
}