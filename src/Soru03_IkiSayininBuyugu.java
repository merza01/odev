import java.util.Scanner;

/** Soru 3: İki Sayının Büyüğü */
public class Soru03_IkiSayininBuyugu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.sayiyi giriniz");
        int s1= sc.nextInt();
        System.out.println("2.sayiyi giriniz");
        int s2= sc.nextInt();
        
        if (s1>s2){ System.out.println("1. sayi 2. sayidan buyuktur");}
          if (s2>s1){ System.out.println("2. sayi 1. sayidan buyuktur");}
          else{System.out.println("Iki sayi esittir.");}
        
        scanner.close();
    }
}
