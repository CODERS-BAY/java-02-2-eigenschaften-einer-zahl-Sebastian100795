import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int glueckszahl= 7;

        System.out.println("Die Glückszahl ist " + glueckszahl);

        int deineZahl = scanner.nextInt();
        if(deineZahl%10==0){
            System.out.println("Das ist eine Runde Zahl");
        }
        if(deineZahl%2==0){
            System.out.println("Das ist eine gerade Zahl");
        }
        if(deineZahl==7){
            System.out.println("Das ist meine Glückszahl");
        }
        if((deineZahl>=10) && (deineZahl<=99) || (deineZahl<=-10) && (deineZahl>=-99)){
            System.out.println("Das ist ein zweistellige Zahl");
        }
    }
}
